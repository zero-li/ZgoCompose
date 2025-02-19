@file:OptIn(ExperimentalPermissionsApi::class)

package com.zgo.camera.ui

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Typeface
import android.net.Uri
import android.util.Log
import androidx.camera.core.*
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.zgo.camera.utils.ImageUtils
import com.zgo.camera.utils.PermissionView
import com.zgo.camera.utils.openSettingsPermission
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


/*
 * 相机
 *
 * @author: zhhli
 * @date: 22/7/25
 */


// We only need to analyze the part of the image that has text, so we set crop percentages
// to avoid analyze the entire image from the live camera feed.
// 裁剪区域 比例
val cropTopLeftScale: Offset = Offset(x = 0.025f, y = 0.3f)
val cropSizeScale: Size = Size(width = 0.95f, height = 0.1f)

@Composable
fun CameraViewPermission(
    modifier: Modifier = Modifier,
    preview: Preview,
    imageCapture: ImageCapture? = null,
    imageAnalysis: ImageAnalysis? = null,
    cameraSelector: CameraSelector = CameraSelector.DEFAULT_BACK_CAMERA,
    scaleType: PreviewView.ScaleType = PreviewView.ScaleType.FILL_CENTER,
    enableTorch: Boolean = false,
    focusOnTap: Boolean = false
) {

    val context = LocalContext.current

    PermissionView(
        permission = Manifest.permission.CAMERA,
        rationale = "请打开相机权限",
        permissionNotAvailableContent = {
            Column(modifier) {
                Text("未能获取相机")
                Spacer(modifier = Modifier.height(8.dp))
                TextButton(
                    onClick = {
                        openSettingsPermission(context)
                    }
                ) {
                    Text("打开应用权限设置")
                }
            }
        }
    ) {

        CameraView(
            modifier,
            preview = preview,
            imageCapture = imageCapture,
            imageAnalysis = imageAnalysis,
            scaleType = scaleType,
            cameraSelector = cameraSelector,
            focusOnTap = focusOnTap,
            enableTorch = enableTorch,
        )


    }


}

// https://stackoverflow.com/a/70302763
@Composable
fun CameraView(
    modifier: Modifier = Modifier,
    preview: Preview,
    imageCapture: ImageCapture? = null,
    imageAnalysis: ImageAnalysis? = null,
    cameraSelector: CameraSelector = CameraSelector.DEFAULT_BACK_CAMERA,
    scaleType: PreviewView.ScaleType = PreviewView.ScaleType.FILL_CENTER,
    enableTorch: Boolean = false,
    focusOnTap: Boolean = false
) {

    val context = LocalContext.current

    //1
    val previewView = remember { PreviewView(context) }
    val lifecycleOwner = LocalLifecycleOwner.current

    val cameraProvider by produceState<ProcessCameraProvider?>(initialValue = null) {
        value = context.getCameraProvider()
    }

    val camera = remember(cameraProvider) {
        cameraProvider?.let {
            it.unbindAll()
            it.bindToLifecycle(
                lifecycleOwner,
                cameraSelector,
                *listOfNotNull(preview, imageAnalysis, imageCapture).toTypedArray()
            )
        }
    }


    LaunchedEffect(true) {
        preview.setSurfaceProvider(previewView.surfaceProvider)
        previewView.scaleType = scaleType
    }


    LaunchedEffect(camera, enableTorch) {
        camera?.let {
            if (it.cameraInfo.hasFlashUnit()) {
                it.cameraControl.enableTorch(context, enableTorch)
            }
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            cameraProvider?.unbindAll()
        }
    }

    // 3
    AndroidView(
        { previewView },
        modifier = modifier
            .fillMaxSize()
            .pointerInput(camera, focusOnTap) {
                if (!focusOnTap) return@pointerInput

                detectTapGestures {
                    val meteringPointFactory = SurfaceOrientedMeteringPointFactory(
                        size.width.toFloat(),
                        size.height.toFloat()
                    )

                    val meteringAction = FocusMeteringAction
                        .Builder(
                            meteringPointFactory.createPoint(it.x, it.y),
                            FocusMeteringAction.FLAG_AF
                        )
                        .disableAutoCancel()
                        .build()

                    camera?.cameraControl?.startFocusAndMetering(meteringAction)
                }
            },
    )


}


/**
 * 扫描框：按屏幕比例
 *
 * 当 sizeScale.height == 0f 或 sizeScale.width == 0f 为方形
 *
 */
@Composable
fun DrawCropScan(
    topLeftScale: Offset = cropTopLeftScale,
    sizeScale: Size = cropSizeScale,
    color: Color = MaterialTheme.colorScheme.primary,
) {

    var lineBottomY by remember { mutableStateOf(0f) }


    var isAnimated by remember { mutableStateOf(true) }


    val lineYAnimation by animateFloatAsState(
        targetValue = if (isAnimated) 0f else lineBottomY,
        animationSpec = infiniteRepeatable(animation = TweenSpec(durationMillis = 1500))
    )

    LaunchedEffect(true) {
        isAnimated = !isAnimated
    }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .onGloballyPositioned {
            }
    ) {

        val paint = Paint().asFrameworkPaint()

        paint.apply {
            isAntiAlias = true
            textSize = 24.sp.toPx()
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        }


        drawRect(Color.Transparent.copy(alpha = 0.1f))


        // 扫描框 高度、宽度
        var height = size.height * sizeScale.height
        var with = size.width * sizeScale.width

        // square 方形
        if (sizeScale.height == 0f) {
            height = with
        }
        if (sizeScale.width == 0f) {
            with = height
        }


        val topLeft = Offset(x = size.width * topLeftScale.x, y = size.height * topLeftScale.y)


        // 扫描框 矩形
        val rectF = Rect(offset = topLeft, size = Size(with, height))

//        Log.d("rectF", " width-height: ${rectF.width} * ${rectF.height}")
//        Log.d("rectF", "$rectF")
//        Log.d("size", "${size.toRect()}")


        drawRoundRect(
            color = Color.Transparent,
            topLeft = rectF.topLeft, size = rectF.size,
            blendMode = BlendMode.Clear
        )

        // 扫描线 可到达的最大位置
        lineBottomY = height - 5.dp.toPx()


        val padding = 10.dp.toPx()

        // 扫描线
        val rectLine = Rect(
            offset = topLeft.plus(Offset(x = padding, y = lineYAnimation)),
            size = Size(with - 2 * padding, 3.dp.toPx())
        )

        // 画扫描线
        drawOval(color, rectLine.topLeft, rectLine.size)

        // 边框
        val lineWith = 3.dp.toPx()
        val lineLength = 12.dp.toPx()

        val lSizeH = Size(lineLength, lineWith)
        val lSizeV = Size(lineWith, lineLength)

        val path = Path()
        // 左上角
        path.addRect(Rect(offset = rectF.topLeft, lSizeH))
        path.addRect(Rect(offset = rectF.topLeft, lSizeV))

        // 左下角
        path.addRect(Rect(offset = rectF.bottomLeft.minus(Offset(x = 0f, y = lineWith)), lSizeH))
        path.addRect(Rect(offset = rectF.bottomLeft.minus(Offset(x = 0f, y = lineLength)), lSizeV))


        // 右上角
        path.addRect(Rect(offset = rectF.topRight.minus(Offset(x = lineLength, y = 0f)), lSizeH))
        path.addRect(Rect(offset = rectF.topRight.minus(Offset(x = lineWith, y = 0f)), lSizeV))

        // 右下角
        path.addRect(
            Rect(offset = rectF.bottomRight.minus(Offset(x = lineLength, y = lineWith)), lSizeH)
        )
        path.addRect(
            Rect(offset = rectF.bottomRight.minus(Offset(x = lineWith, y = lineLength)), lSizeV)
        )

        drawPath(path = path, color = Color.White)


//        Log.d("zzzz topLeft ", topLeft.toString())
//        Log.d("zzzz canvas ", target2.toString())
//
//        Log.d("zzzz screenHeight ", screenHeight.toPx().toString())
//        Log.d("zzzz size ", size.toString())


    }
}


@Composable
fun ShowAfterCropImageToAnalysis(bitmap: Bitmap) {

    Image(bitmap = bitmap.asImageBitmap(), contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .padding(top = 60.dp)
            .fillMaxWidth()

            .drawWithContent {
                drawContent()

                drawRect(
                    Color.Red,
                    Offset.Zero,
                    Size(height = size.height, width = size.width),
                    style = Stroke(width = 2.dp.toPx())
                )
            }
    )


}


@SuppressLint("UnsafeOptInUsageError")
fun cropTextImage(imageProxy: ImageProxy): Bitmap? {
    val mediaImage = imageProxy.image ?: return null

    val rotationDegrees = imageProxy.imageInfo.rotationDegrees


    val imageHeight = mediaImage.height
    val imageWidth = mediaImage.width

    val cropRect = when (rotationDegrees) {
        90, 270 -> {
            val cropRect90 = getCropRect90(imageHeight.toFloat(), imageWidth.toFloat())
            android.graphics.Rect(
                cropRect90.left.toInt(),
                cropRect90.top.toInt(),
                cropRect90.right.toInt(),
                cropRect90.bottom.toInt()
            )
        }
        else -> {
            val cropRect1 = getCropRect(imageHeight.toFloat(), imageWidth.toFloat())
            android.graphics.Rect(
                cropRect1.left.toInt(),
                cropRect1.top.toInt(),
                cropRect1.right.toInt(),
                cropRect1.bottom.toInt()
            )
        }
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


fun getCropRect(
    surfaceHeight: Float,
    surfaceWidth: Float,
    topLeftScale: Offset = cropTopLeftScale,
    sizeScale: Size = cropSizeScale,
): Rect {

    val height = surfaceHeight * sizeScale.height
    val with = surfaceWidth * sizeScale.width
    val topLeft = Offset(x = surfaceWidth * topLeftScale.x, y = surfaceHeight * topLeftScale.y)

    return Rect(offset = topLeft, size = Size(with, height))

}

fun getCropRect90(
    surfaceHeight: Float,
    surfaceWidth: Float,
    topLeftScale: Offset = Offset(x = cropTopLeftScale.y, y = cropTopLeftScale.x),
    sizeScale: Size = Size(width = cropSizeScale.height, height = cropSizeScale.width),
): Rect {

    val height = surfaceHeight * sizeScale.height
    val with = surfaceWidth * sizeScale.width
    val topLeft = Offset(x = surfaceWidth * topLeftScale.x, y = surfaceHeight * topLeftScale.y)

    return Rect(offset = topLeft, size = Size(with, height))

}


private suspend fun Context.getCameraProvider(): ProcessCameraProvider =
    suspendCoroutine { continuation ->
        ProcessCameraProvider.getInstance(this).also { cameraProvider ->
            cameraProvider.addListener({
                continuation.resume(cameraProvider.get())
            }, ContextCompat.getMainExecutor(this))
        }
    }

private suspend fun CameraControl.enableTorch(context: Context, torch: Boolean): Unit =
    suspendCoroutine {
        enableTorch(torch).addListener(
            {},
            ContextCompat.getMainExecutor(context)

        )
    }


fun ImageCapture.takePhoto(
    filenameFormat: String = "yyyy-MM-dd-HH-mm-ss-SSS",
    outputDirectory: File,
    executor: Executor = Executors.newSingleThreadExecutor(),
    onImageCaptured: (Uri) -> Unit,
    onError: (ImageCaptureException) -> Unit
) {

    val photoFile = File(
        outputDirectory,
        SimpleDateFormat(filenameFormat, Locale.US).format(System.currentTimeMillis()) + ".jpg"
    )

    val outputOptions = ImageCapture.OutputFileOptions.Builder(photoFile).build()

    takePicture(outputOptions, executor, object : ImageCapture.OnImageSavedCallback {
        override fun onError(exception: ImageCaptureException) {
            Log.e("kilo", "Take photo error:", exception)
            onError(exception)
        }

        override fun onImageSaved(outputFileResults: ImageCapture.OutputFileResults) {
            val savedUri = Uri.fromFile(photoFile)
            onImageCaptured(savedUri)
        }
    })
}




