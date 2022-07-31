package com.zgo.camera.utils

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.os.Build
import android.view.WindowInsets
import androidx.camera.core.ImageProxy
import androidx.core.view.WindowInsetsCompat
import java.nio.ByteBuffer


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/7/25
 */


object CameraUtils {
    private fun getWindowHeight(context: Activity): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val metrics = context.windowManager.currentWindowMetrics
            val insets = metrics.windowInsets.getInsets(WindowInsets.Type.systemBars())
            metrics.bounds.height() - insets.bottom - insets.top
        } else {
            val view = context.window.decorView
            val insets = WindowInsetsCompat.toWindowInsetsCompat(view.rootWindowInsets, view)
                .getInsets(WindowInsetsCompat.Type.systemBars())
            context.resources.displayMetrics.heightPixels - insets.bottom - insets.top
        }
    }

    private fun getWindowWidth(context: Activity): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val metrics = context.windowManager.currentWindowMetrics
            val insets = metrics.windowInsets.getInsets(WindowInsets.Type.systemBars())
            metrics.bounds.width() - insets.left - insets.right
        } else {
            val view = context.window.decorView
            val insets = WindowInsetsCompat.toWindowInsetsCompat(view.rootWindowInsets, view)
                .getInsets(WindowInsetsCompat.Type.systemBars())
            context.resources.displayMetrics.widthPixels - insets.left - insets.right
        }
    }

    fun convertImageProxyToBitmap(imageProxy: ImageProxy, activity: Activity): Bitmap {
        val buffer = imageProxy.planes[0].buffer
        buffer.rewind()
        val bytes = ByteArray(buffer.capacity())
        buffer.get(bytes)
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.size).let {
            //workaround: some devices are capturing rotated pictures, causing ML recog to fail
            val rotation =
                if (imageProxy.imageInfo.rotationDegrees != 0 && getWindowHeight(activity) > getWindowWidth(
                        activity
                    )
                ) 90f else 0f
            val matrix = Matrix()
            matrix.postRotate(rotation)

            return@let Bitmap.createBitmap(it, 0, 0, it.width, it.height, matrix, false)
        }
    }


    /**
     * YUV_420_888转NV21
     *
     * @param image CameraX ImageProxy
     * @return byte array
     */
    private fun yuv420ToNv21(image: ImageProxy): ByteArray {
        val planes = image.planes
        val yBuffer: ByteBuffer = planes[0].buffer
        val uBuffer: ByteBuffer = planes[1].buffer
        val vBuffer: ByteBuffer = planes[2].buffer
        val ySize: Int = yBuffer.remaining()
        val uSize: Int = uBuffer.remaining()
        val vSize: Int = vBuffer.remaining()
        val size = image.width * image.height
        val nv21 = ByteArray(size * 3 / 2)
        yBuffer.get(nv21, 0, ySize)
        vBuffer.get(nv21, ySize, vSize)
        val u = ByteArray(uSize)
        uBuffer.get(u)
        //每隔开一位替换V，达到VU交替
        var pos = ySize + 1
        for (i in 0 until uSize) {
            if (i % 2 == 0) {
                nv21[pos] = u[i]
                pos += 2
            }
        }
        return nv21
    }
}
