package com.zgo.demo.scan.ui.scanner

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
import com.zgo.demo.scan.data.db.ScanHistory
import com.zgo.demo.scan.database
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
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
            .setBarcodeFormats(Barcode.FORMAT_ALL_FORMATS).build()
    )

    private var useOCR = false


    var scanText = mutableStateOf("")
    var scanBarcode = mutableStateOf("")


    var enableTorch: MutableState<Boolean> = mutableStateOf(false)

    fun toggleTorch() {
        enableTorch.value = !enableTorch.value
    }

    private var enableAnalysis = true

    // 重新识别
    fun analyzeReStart() {
        enableAnalysis = true
    }


    @SuppressLint("UnsafeOptInUsageError")
    fun analyze() {

        imageAnalysis.setAnalyzer(Executors.newSingleThreadExecutor()) { image ->
            //Log.d("enableAnalysis", "enableAnalysis: $enableAnalysis")
            if (!enableAnalysis || image.image == null) {
                image.close()
                return@setAnalyzer
            }

            enableAnalysis = false

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
                        scanText.value = text

                        analyzeReStart()

                    }.addOnFailureListener {
                        Log.d("zzz", "onFailure")
                        scanText.value = "onFailure"

                        analyzeReStart()
                    }

            } else {
                barcodeScanner.process(inputImage)
                    .addOnSuccessListener {
                        Log.d("zzz", "barcodeScanner onSuccess")


                        val history = getScanHistory(it)

                        history?.apply {
                            viewModelScope.launch {
                                withContext(Dispatchers.IO) {
                                    database.historyDao().insert(history)
                                }
                            }
                            val json = history.toJson()

                            scanBarcode.value = json
                        } ?: analyzeReStart()


                    }.addOnFailureListener {
                        Log.d("zzz", "onFailure")
                        scanBarcode.value = "onFailure"

                        analyzeReStart()

                    }
            }


            task.addOnCompleteListener {
                image.close()
            }


        }


    }

    private fun getScanHistory(list: List<Barcode>): ScanHistory? {

        list.forEach { barcode ->
            val code = barcode.displayValue ?: ""
            code.isNotEmpty().apply {
                val format = barFormat(barcode.format)
                val type = barcode.valueType


                val history = ScanHistory(code = code, format = format, type = type.toString())

                return history
            }
        }

        return null
    }


    private fun barFormat(format: Int): String {
        return when (format) {
            Barcode.FORMAT_UNKNOWN -> "UNKNOWN"
            Barcode.FORMAT_ALL_FORMATS -> "ALL_FORMATS"
            Barcode.FORMAT_CODE_128 -> "CODE_128"
            Barcode.FORMAT_CODE_39 -> "CODE_39"
            Barcode.FORMAT_CODE_93 -> "CODE_93"
            Barcode.FORMAT_CODABAR -> "CODABAR"
            Barcode.FORMAT_DATA_MATRIX -> "DATA_MATRIX"
            Barcode.FORMAT_EAN_13 -> "EAN_13"
            Barcode.FORMAT_EAN_8 -> "EAN_8"
            Barcode.FORMAT_ITF -> "ITF"
            Barcode.FORMAT_QR_CODE -> "QR_CODE"
            Barcode.FORMAT_UPC_A -> "UPC_A"
            Barcode.FORMAT_UPC_E -> "UPC_E"
            Barcode.FORMAT_PDF417 -> "PDF417"
            Barcode.FORMAT_AZTEC -> "AZTEC"
            else -> ""
        }

    }


    fun getOutputDirectory(context: Context): File {


        val mediaDir = File(context.getExternalFilesDir(null), "image").apply {
            mkdir()
        }

        return mediaDir
    }
}