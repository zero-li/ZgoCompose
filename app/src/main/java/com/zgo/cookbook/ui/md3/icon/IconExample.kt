package com.zgo.cookbook.ui.md3.icon

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ToggleOn
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import com.zgo.demo.R
import com.zgo.lib.ui.theme.md_theme_light_primary


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/10
 */
@Composable
fun IconExample() {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Icon(imageVector = Icons.Filled.ToggleOn, contentDescription = null)
        }

        // vectorResource 用来加载一个矢量 XML，
        // imageResource 用来加载 jpg 或者 png 图片。
        // painterResource 对以上两种类型的 Drawable 都支持，内部会根据资源的不同类型创作对应的画笔进行图标的绘制。

        item {
            // svg
            Icon(
                imageVector = ImageVector.vectorResource(
                    id = R.drawable.ic_launcher_foreground
                ), contentDescription = "矢量图资源",
                tint = md_theme_light_primary
            )

        }

        item {

            // png
            Icon(
                bitmap = ImageBitmap.imageResource(
                    id = R.drawable.icon
                ), contentDescription = "图片资源",
                tint = md_theme_light_primary
            )
        }

        item {


            // 不显示 webp, 非黑白
            Icon(
                painter = painterResource(
                    id = R.drawable.img
                ), contentDescription = "任意类型资源",
                tint = md_theme_light_primary
            )
        }


    }

}
