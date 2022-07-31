package com.zgo.camera.ui

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Lens
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
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
            modifier = Modifier
                .fillMaxSize()
        )

        // 裁剪区域
        DrawCropScan()

        // real bitmap for analysis after crop
        ShowAfterCropImageToAnalysis(viewModel.bitmapR.value)


        // show analysis result
        Text(
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .padding(10.dp)
                .background(Color.Transparent.copy(alpha = 0.6f)),
            text = "${viewModel.scanText.value} \n ${viewModel.scanBarcode.value}",
            color = Color.Red
        )



        IconButton(
            modifier = Modifier
                .padding(bottom = 20.dp)
                .align(alignment = Alignment.BottomCenter),
            onClick = {
                Log.i("kilo", "ON CLICK")
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
                        .size(100.dp)
                        .padding(1.dp)
                        .border(1.dp, Color.White, CircleShape)
                )
            }
        )


    }

}











