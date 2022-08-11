package com.zgo.demo.scan.ui.scanner

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.mlkit.vision.barcode.BarcodeScanner
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.TextRecognizer
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions
import com.zgo.camera.CameraConfig
import com.zgo.camera.ui.cropTextImage
import java.io.File
import java.util.concurrent.Executors


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/11
 */


class ScannerViewModel(config: CameraConfig) : ViewModel() {
    val preview = config.options(Preview.Builder())
    val imageCapture: ImageCapture = config.options(ImageCapture.Builder())
    val imageAnalysis: ImageAnalysis = config.options(ImageAnalysis.Builder())


    private val textRecognizer: TextRecognizer = TextRecognition.getClient(
        ChineseTextRecognizerOptions.Builder().build()
    )

    private val barcodeScanner: BarcodeScanner = BarcodeScanning.getClient(
        BarcodeScannerOptions.Builder()
            .setBarcodeFormats(Barcode.FORMAT_CODE_128, Barcode.FORMAT_QR_CODE).build()
    )

    private var useOCR = false


    var scanText = mutableStateOf("")
    var scanBarcode = mutableStateOf("")

    var bitmapR = mutableStateOf(Bitmap.createBitmap(10, 10, Bitmap.Config.RGB_565))

    var enableTorch: MutableState<Boolean> = mutableStateOf(false)

    fun toggleTorch() {
        enableTorch.value = !enableTorch.value
    }


    @SuppressLint("UnsafeOptInUsageError")
    fun analyze() {

        imageAnalysis.setAnalyzer(Executors.newSingleThreadExecutor()) { image ->
            if (image.image == null) {
                image.close()
                return@setAnalyzer
            }

            val mediaImage = image.image!!


            val inputImage = InputImage.fromMediaImage(mediaImage, image.imageInfo.rotationDegrees)

            val task = if (useOCR) {

                // OCR 识别, 截取扫描框图片
                val bitmap = cropTextImage(image) ?: return@setAnalyzer

                val inputImageCrop = InputImage.fromBitmap(bitmap, 0)

                textRecognizer.process(inputImageCrop)
                    .addOnSuccessListener {
                        val text = it.text

                        Log.d("zzz", "textRecognizer onSuccess")
                        Log.d("zzzzzz OCR result", "ocr result: $text")
                        bitmapR.value = bitmap
                        scanText.value = text

                    }.addOnFailureListener {
                        Log.d("zzz", "onFailure")
                        bitmapR.value = bitmap
                        scanText.value = "onFailure"
                    }

            } else {
                barcodeScanner.process(inputImage)
                    .addOnSuccessListener {
                        Log.d("zzz", "barcodeScanner onSuccess")
                        it.forEach { code ->
                            val text = code.displayValue ?: ""
                            text.isNotEmpty().apply {
                                scanBarcode.value = text
                            }
                        }

                    }.addOnFailureListener {
                        Log.d("zzz", "onFailure")
                        scanBarcode.value = "onFailure"

                    }
            }


            task.addOnCompleteListener {
                image.close()
            }


        }


    }


    fun getOutputDirectory(context: Context): File {


        val mediaDir = File(context.getExternalFilesDir(null), "image").apply {
            mkdir()
        }

        return mediaDir
    }
}