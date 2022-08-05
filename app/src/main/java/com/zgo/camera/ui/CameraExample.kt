package com.zgo.camera.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Highlight
import androidx.compose.material.icons.outlined.Highlight
import androidx.compose.material.icons.sharp.Lens
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.zgo.camera.AspectRatioCameraConfig
import com.zgo.camera.CameraViewModel


/*
 * CameraView
 * 
 * @author: zhhli
 * @date: 22/7/26
 */

@SuppressLint("UnsafeOptInUsageError")
@Composable
fun CameraExample() {

    val context = LocalContext.current

    val viewModel = remember {
        val config = AspectRatioCameraConfig(context)
        val model = CameraViewModel(config)
        model.analyze()
        model
    }


    Box(
        contentAlignment = Alignment.TopCenter, modifier = Modifier
            .fillMaxSize()
    ) {

        CameraViewPermission(
            preview = viewModel.preview,
            imageAnalysis = viewModel.imageAnalysis,
            imageCapture = viewModel.imageCapture,
            enableTorch = viewModel.enableTorch.value,
            modifier = Modifier
                .fillMaxSize()
        )

        // 裁剪区域
        DrawCropScan()

        // real bitmap for analysis after crop
        ShowAfterCropImageToAnalysis(viewModel.bitmapR.value)


        // show analysis result
        Text(
            text = "${viewModel.scanText.value} \n ${viewModel.scanBarcode.value}",
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .padding(horizontal = 10.dp, vertical = 100.dp)
                .heightIn(max = 150.dp)
                .widthIn(min = 100.dp)
                .background(Color.Transparent.copy(alpha = 0.6f)),
            color = Color.Red,
            textAlign = TextAlign.Left
        )

        // enableTorch
        IconButton(
            onClick = { viewModel.toggleTorch() },
            modifier = Modifier
                .align(alignment = Alignment.BottomEnd)
                .padding(bottom = 50.dp, end = 20.dp),
        ) {
            Icon(
                imageVector = if (viewModel.enableTorch.value) {
                    Icons.Filled.Highlight
                } else {
                    Icons.Outlined.Highlight
                },
                contentDescription = "enableTorch",
                tint = Color.White,
                modifier = Modifier
                    .size(60.dp)
                    .border(1.dp, Color.White, CircleShape)
                    .padding(10.dp),
            )
        }



        IconButton(
            modifier = Modifier
                .padding(bottom = 40.dp)
                .align(alignment = Alignment.BottomCenter),
            onClick = {
                viewModel.imageCapture.takePhoto(
                    outputDirectory = viewModel.getOutputDirectory(context),
                    onError = {

                    },
                    onImageCaptured = {

                    }
                )
            },
            content = {
                Icon(
                    imageVector = Icons.Sharp.Lens,
                    contentDescription = "Take picture",
                    tint = Color.White,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(1.dp)
                        .border(1.dp, Color.White, CircleShape)
                )
            }
        )


    }

}











