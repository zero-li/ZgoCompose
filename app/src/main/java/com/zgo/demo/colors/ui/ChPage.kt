package com.zgo.demo.colors.ui

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zgo.lib.ui.theme.color.ChColor
import com.zgo.lib.ui.theme.color.ZgoColor


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/9
 */

@Composable
fun ChPage() {
//    LockScreenOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)


    Column(
        modifier = Modifier
            .background(color = Color.White)
            .wrapContentWidth()

    ) {
        Item(ChColor.jinzi_317)
    }


}

@Composable
fun Item(item: ZgoColor) {

    val cmyk = item.toCMYK()

    Column(
        modifier = Modifier
//        .height(IntrinsicSize.Min)
            .width(IntrinsicSize.Min)
    ) {
        Box(
            modifier = Modifier
                .height(10.dp)
                .fillMaxWidth()
                .background(color = item.color)
        )




        Row(modifier = Modifier
            .padding(start = 5.dp)
            .height(IntrinsicSize.Min)) {
            Column(modifier = Modifier) {
                cmyk.forEach {
                    CircularProgressIndicator(
                        modifier = Modifier.padding(vertical = 5.dp),
                        progress = it.toFloat()
                    )
                }
            }

            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Text(
                    modifier = Modifier.rotate(90f),
                    text = item.id, style = TextStyle()
                )


                Spacer(modifier = Modifier.weight(1f))


                item.name.forEach {
                    Text(
                        modifier = Modifier.padding(start = 3.dp),
                        text = it.toString(), style = TextStyle()
                    )
                }


            }

        }

        Row(modifier = Modifier
            .padding(start = 5.dp)
            .height(IntrinsicSize.Min)) {
            Text(
                modifier = Modifier.rotate(90f),
                text = item.name, style = TextStyle()
            )
            Row(modifier = Modifier) {
                cmyk.forEach {
                    LinearProgressIndicator(
                        modifier = Modifier
                            .padding(horizontal = 1.dp)
                            .width(60.dp)
                            .rotate(90f),
                        progress = it.toFloat()
                    )
                }
            }


            Text(
                modifier = Modifier.rotate(90f),
                text = item.intro, style = TextStyle()
            )


        }

    }

}


@Preview
@Composable
fun Preview() {
    ChPage()
}


@Composable
fun LockScreenOrientation(orientation: Int) {
    val context = LocalContext.current
    DisposableEffect(Unit) {
        val activity = context.findActivity() ?: return@DisposableEffect onDispose {}
        val originalOrientation = activity.requestedOrientation
        activity.requestedOrientation = orientation
        onDispose {
            // restore original orientation when view disappears
            activity.requestedOrientation = originalOrientation
        }
    }
}

fun Context.findActivity(): Activity? = when (this) {
    is Activity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}