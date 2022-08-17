package com.zgo.demo.scan.ui.scanner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FlashOff
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material.icons.outlined.FlashOn
import androidx.compose.material.icons.outlined.FlipCameraIos
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.zgo.camera.AspectRatioCameraConfig
import com.zgo.camera.ui.CameraViewPermission
import com.zgo.camera.ui.DrawCropScan


/*
 * 扫描页
 * 
 * @author: zhhli
 * @date: 22/8/11
 */


@Composable
fun ScannerPage(
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    navigate: (historyJson: String) -> Unit,
) {


    val context = LocalContext.current

    val viewModel = remember {
        val config = AspectRatioCameraConfig(context)
        val model = ScannerViewModel(config)
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
        DrawCropScan(
            topLeftScale = Offset(x = 0.2f, y = 0.25f),
            sizeScale = Size(width = 0.6f, height = 0f)
        )

        // show analysis result
//        Text(
//            text = "${viewModel.scanText.value} \n ${viewModel.scanBarcode.value}",
//            modifier = Modifier
//                .align(alignment = Alignment.BottomStart)
//                .padding(horizontal = 10.dp, vertical = 100.dp)
//                .heightIn(max = 150.dp)
//                .widthIn(min = 100.dp)
//                .background(Color.Transparent.copy(alpha = 0.6f)),
//            color = Color.Red,
//            textAlign = TextAlign.Left
//        )


        Row(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 100.dp)
                .shadow(shape = CircleShape, elevation = 1.dp, clip = true)
                .background(color = MaterialTheme.colorScheme.primary)
                .padding(horizontal = 15.dp)
        ) {


            IconButton(
                onClick = { },
                modifier = Modifier,
            ) {
                Icon(
                    Icons.Filled.Photo,
                    contentDescription = "Image",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(0.dp)
                        .size(34.dp),
                )
            }

            IconButton(
                onClick = { },
                modifier = Modifier.padding(horizontal = 20.dp),
            ) {
                Icon(
                    Icons.Outlined.FlipCameraIos,
                    contentDescription = "Image",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(0.dp)
                        .size(34.dp),
                )
            }


            IconButton(
                onClick = { viewModel.toggleTorch() },
                modifier = Modifier,
            ) {
                Icon(
                    imageVector = if (viewModel.enableTorch.value) {
                        Icons.Filled.FlashOff
                    } else {
                        Icons.Outlined.FlashOn
                    },
                    contentDescription = "Image",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(0.dp)
                        .size(34.dp),
                )
            }


        }



        if (viewModel.scanBarcode.value.isNotEmpty()) {
            val result = viewModel.scanBarcode.value

            viewModel.scanBarcode.value = ""

            navigate(result)


//            viewModel.analyzeReStart()
        }

        // 实现切换界面，重置扫码分析状态
        DisposableEffect(lifecycleOwner) {
            val observer = LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_START) {
                    // Toast.makeText(context, "start", Toast.LENGTH_SHORT).show()
                    // 重新进入页面，恢复解码
                    viewModel.analyzeReStart()
                }
            }

            // Add the observer to the lifecycle
            lifecycleOwner.lifecycle.addObserver(observer)

            // When the effect leaves the Composition, remove the observer
            onDispose {
                lifecycleOwner.lifecycle.removeObserver(observer)
            }
        }


    }

}
