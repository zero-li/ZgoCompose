package com.zgo.camera

import android.content.Context
import android.util.Log
import android.util.Size
import androidx.camera.core.*
import org.jetbrains.annotations.NotNull
import kotlin.math.abs
import kotlin.math.ln
import kotlin.math.max
import kotlin.math.min


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/7/26
 */
open class CameraConfig {
    open fun options(builder: Preview.Builder): Preview {
        return builder.build()
    }

    open fun options(builder: CameraSelector.Builder): CameraSelector {
        return builder.build()
    }

    open fun options(builder: ImageCapture.Builder): ImageCapture {
        return builder.build()
    }

    open fun options(builder: ImageAnalysis.Builder): ImageAnalysis {
        return builder.build()
    }

}


/**
 *  * 相机配置：根据尺寸配置相机的目标图像，使输出分析的图像尽可能的接近屏幕尺寸
 */
class ResolutionCameraConfig(context: Context) : CameraConfig() {
    private val mTargetSize: Size
    override fun options(builder: Preview.Builder): Preview {
        builder.setTargetResolution(mTargetSize)
        return super.options(builder)
    }

    override fun options(builder: CameraSelector.Builder): CameraSelector {
        return super.options(builder)
    }

    override fun options(builder: ImageAnalysis.Builder): ImageAnalysis {
        builder.setTargetResolution(mTargetSize)
        return super.options(builder)
    }

    @NotNull
    override fun options(builder: ImageCapture.Builder): ImageCapture {
        builder.setTargetResolution(mTargetSize)
        return builder.build()
    }

    init {
        val displayMetrics = context.resources.displayMetrics
        val width = displayMetrics.widthPixels
        val height = displayMetrics.heightPixels
        Log.d("CameraConfig", String.format("displayMetrics:%d x %d", width, height))
        //因为为了保持流畅性和性能，限制在1080p，在此前提下尽可能的找到屏幕接近的分辨率
        mTargetSize = if (width < height) {
            val size = Math.min(width, 1080)
            val ratio = width / height.toFloat()
            if (ratio > 0.7) { //一般应用于平板
                Size(size, (size / 3.0f * 4.0f).toInt())
            } else {
                Size(size, (size / 9.0f * 16.0f).toInt())
            }
        } else {
            val size = Math.min(height, 1080)
            val ratio = height / width.toFloat()
            if (ratio > 0.7) { //一般应用于平板
                Size((size / 3.0f * 4.0f).toInt(), size)
            } else {
                Size((size / 9.0f * 16.0).toInt(), size)
            }
        }
        Log.d("CameraConfig", "targetSize:$mTargetSize")
    }
}


class AspectRatioCameraConfig(context: Context) : CameraConfig() {
    private val mAspectRatio: Int


    private fun aspectRatio(width: Float, height: Float): Int {
        val ratio = Math.max(width, height) / Math.min(width, height)
        return if (Math.abs(ratio - 4.0f / 3.0f) < Math.abs(ratio - 16.0f / 9.0f)) {
            AspectRatio.RATIO_4_3
        } else AspectRatio.RATIO_16_9
    }


    private val RATIO_4_3_VALUE = 4.0 / 3.0
    private val RATIO_16_9_VALUE = 16.0 / 9.0


    private fun aspectRatio(width: Int, height: Int): Int {
        val previewRatio = ln(max(width, height).toDouble() / min(width, height))
        if (abs(previewRatio - ln(RATIO_4_3_VALUE))
            <= abs(previewRatio - ln(RATIO_16_9_VALUE))
        ) {
            return AspectRatio.RATIO_4_3
        }
        return AspectRatio.RATIO_16_9
    }

    override fun options(builder: Preview.Builder): Preview {
        return super.options(builder)
    }

    override fun options(builder: CameraSelector.Builder): CameraSelector {
        return super.options(builder)
    }

    override fun options(builder: ImageAnalysis.Builder): ImageAnalysis {
        builder.setTargetAspectRatio(mAspectRatio)
        return super.options(builder)
    }

    override fun options(builder: ImageCapture.Builder): ImageCapture {
        builder.setTargetAspectRatio(mAspectRatio)
        return super.options(builder)
    }

    init {
        val displayMetrics = context.resources.displayMetrics
        val width = displayMetrics.widthPixels
        val height = displayMetrics.heightPixels
        mAspectRatio = aspectRatio(width.toFloat(), height.toFloat())
        Log.d("CameraConfig", "aspectRatio:$mAspectRatio")
    }
}