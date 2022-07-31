package com.zgo.camera

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.util.Log
import androidx.camera.core.ExperimentalGetImage
import androidx.camera.core.ImageProxy
import androidx.compose.ui.graphics.toAndroidRect
import com.google.mlkit.vision.barcode.BarcodeScanner
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.Text
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.TextRecognizer
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions
import com.zgo.camera.Analyzer.OnAnalyzeListener
import com.zgo.camera.ui.getCropRect
import com.zgo.camera.ui.getCropRect90
import com.zgo.camera.utils.ImageUtils


/*
 *
 *
 * @author: zhhli
 * @date: 22/7/27
 */

interface Analyzer<T> {
    /**
     * Analyzes an image to produce a result.
     * @param image The image to analyze
     */
    fun analyze(image: ImageProxy, listener: OnAnalyzeListener<AnalyzeResult<T>>)
    interface OnAnalyzeListener<T> {
        fun onSuccess(result: T)
        fun onFailure(bitmap: Bitmap)
    }
}


class AnalyzeResult<T>(val bitmap: Bitmap, var result: T)


/**
 * 全屏识别 条码
 */
class BarcodeAnalyzer(
) : Analyzer<List<Barcode>> {

    private val barcodeScanner: BarcodeScanner = BarcodeScanning.getClient(
        BarcodeScannerOptions.Builder()
            .setBarcodeFormats(Barcode.FORMAT_CODE_128).build()
    )

    @SuppressLint("UnsafeOptInUsageError")
    override fun analyze(
        image: ImageProxy,
        listener: OnAnalyzeListener<AnalyzeResult<List<Barcode>>>
    ) {


        // 识别 条码

        val mediaImage = image.image ?: return

//            val bitmap: Bitmap? = BitmapUtils.getBitmap(image)
        val bitmap: Bitmap = ImageUtils.convertYuv420888ImageToBitmap(mediaImage)

        val inputImage =
            InputImage.fromMediaImage(mediaImage, image.imageInfo.rotationDegrees)

//        val mlImage =
//            MediaMlImageBuilder(mediaImage).setRotation(image.imageInfo.rotationDegrees).build()

        barcodeScanner.process(inputImage)
            .addOnSuccessListener {
                if (it == null || it.isEmpty()) {
                    listener.onFailure(bitmap)
                } else {
                    listener.onSuccess(AnalyzeResult(bitmap, result = it))
                }
            }.addOnFailureListener {
                it.printStackTrace()
//                        val crop = getClipBitmap(bitmap!!, image.cropRect)

                listener.onFailure(bitmap)
            }.addOnCompleteListener {
                image.close()
            }


    }

}


/**
 * 裁剪区域识别 文字
 */
class TextCropScanAnalyzer(
) : Analyzer<Text> {
    private val textRecognizer: TextRecognizer = TextRecognition.getClient(
        ChineseTextRecognizerOptions.Builder().build()
    )


    @ExperimentalGetImage
    override fun analyze(
        image: ImageProxy,
        listener: OnAnalyzeListener<AnalyzeResult<Text>>
    ) {

        try {

            // OCR 识别
            val bitmap = cropTextImage(image) ?: return

            Log.d("image", "width:${bitmap.width}  height: ${bitmap.height}")

            val inputImage = InputImage.fromBitmap(bitmap, 0)

            textRecognizer.process(inputImage).addOnSuccessListener { it ->
                if (it == null) {
                    listener.onFailure(bitmap)
                } else {
                    listener.onSuccess(AnalyzeResult(bitmap, result = it))
                }

            }.addOnFailureListener { e: Exception ->
                // 触发重新扫描分析
                listener.onFailure(bitmap)
                e.printStackTrace()
            }.addOnCompleteListener {
                image.close()
            }


        } catch (e: Exception) {
            e.printStackTrace()
        }


    }


    @SuppressLint("UnsafeOptInUsageError")
    private fun cropTextImage(imageProxy: ImageProxy): Bitmap? {
        val mediaImage = imageProxy.image ?: return null

        val rotationDegrees = imageProxy.imageInfo.rotationDegrees


        val imageHeight = mediaImage.height
        val imageWidth = mediaImage.width

        val cropRect = when (rotationDegrees) {
            90, 270 -> getCropRect90(imageHeight.toFloat(), imageWidth.toFloat()).toAndroidRect()
            else -> getCropRect(imageHeight.toFloat(), imageWidth.toFloat()).toAndroidRect()
        }


        val convertImageToBitmap = ImageUtils.convertYuv420888ImageToBitmap(mediaImage)

        val croppedBitmap =
            ImageUtils.rotateAndCrop(convertImageToBitmap, rotationDegrees, cropRect)

//        Log.d("===", "====================================")
//        Log.d("mediaImage", "$rotationDegrees width-height: $imageWidth * $imageHeight")
//        Log.d("cropRect", "$rotationDegrees width-height: ${cropRect.width()} * ${cropRect.height()}")
//        Log.d("cropRect", "$rotationDegrees ltrb: $cropRect")
//
//        Log.d("convertImageToBitmap", "width-height: ${convertImageToBitmap.width} * ${convertImageToBitmap.height}")
//        Log.d("croppedBitmap", "width-height: ${croppedBitmap.width} * ${croppedBitmap.height}")


        return croppedBitmap

    }


}
