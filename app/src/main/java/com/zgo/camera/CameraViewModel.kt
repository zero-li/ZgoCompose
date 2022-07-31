package com.zgo.camera

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
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.text.Text
import java.io.File
import java.util.concurrent.Executors


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/7/29
 */
class CameraViewModel(config: CameraConfig) : ViewModel() {

    val preview = config.options(Preview.Builder())
    val imageCapture: ImageCapture = config.options(ImageCapture.Builder())
    val imageAnalysis: ImageAnalysis = config.options(ImageAnalysis.Builder())
    val imageAnalysisBarcode: ImageAnalysis = config.options(ImageAnalysis.Builder())


    private val textAnalyzer = TextCropScanAnalyzer()
    private val barcodeAnalyzer = BarcodeAnalyzer()


    var scanText = mutableStateOf("")
    var scanBarcode = mutableStateOf("")

    var bitmapR = mutableStateOf(Bitmap.createBitmap(10, 10, Bitmap.Config.RGB_565))

    var enableTorch: MutableState<Boolean> = mutableStateOf(false)

    fun toggleTorch() {
        enableTorch.value = !enableTorch.value
    }


    @SuppressLint("UnsafeOptInUsageError")
    fun analyze() {

        imageAnalysis.setAnalyzer(Executors.newSingleThreadExecutor()) {

            textAnalyzer.analyze(
                it,
                object : Analyzer.OnAnalyzeListener<AnalyzeResult<Text>> {
                    override fun onSuccess(result: AnalyzeResult<Text>) {

                        val text = result.result.text

                        Log.d("zzz", "onSuccess")
                        Log.d("zzzzzz OCR result", "ocr result: $text")
                        bitmapR.value = result.bitmap
                        scanText.value = text

                    }

                    override fun onFailure(bitmap: Bitmap) {
                        Log.d("zzz", "onFailure")

                        bitmapR.value = bitmap
                        scanText.value = "onFailure"

                    }
                })


        }




        imageAnalysisBarcode.setAnalyzer(Executors.newSingleThreadExecutor()) {

            barcodeAnalyzer.analyze(it,
                object : Analyzer.OnAnalyzeListener<AnalyzeResult<List<Barcode>>> {
                    override fun onSuccess(result: AnalyzeResult<List<Barcode>>) {

                        result.result.forEach { code ->
                            val text = code.displayValue ?: ""
                            text.isNotEmpty().apply {
                                scanBarcode.value = text

                            }
                        }


                    }

                    override fun onFailure(bitmap: Bitmap) {
                        scanBarcode.value = ""
                    }

                })
        }
    }


    fun getOutputDirectory(context: Context): File {


        val mediaDir = File(context.getExternalFilesDir(null), "image").apply {
            mkdir()
        }

        return mediaDir
    }


}