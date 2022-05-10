package com.zgo.cookbook.ui.third

import android.os.Build
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.regex.Pattern
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


/*
 * 雷达图
 * 
 * @author: zhhli
 * @date: 22/5/7
 *
 * https://github.com/Loren-Moon/ComposeRadar.git
 * https://mp.weixin.qq.com/s/iNPIfY2XtPHGOGflihOwCA
 */

data class RadarBean(
    val text: String,
    val value: Float
)

@Composable
fun ComposeRadar(
    modifier: Modifier,
    data: List<RadarBean>,
    specialHandle: Boolean = false
) {
    val CIRCLE_TURN = 3
    val colors =
        arrayOf(
            Color(0xffeff3fe),
            Color(0xffe8eefd),
            Color(0xffdee6fc),
            Color(0xffd8e0fa),
            Color(0xffc3d0f7),
            Color(0x5989A3F0),
            Color(0xff3a65e6)
        )
    var enable by remember {
        mutableStateOf(false)
    }
    val progress by animateFloatAsState(if (enable) 1f else 0f, animationSpec = tween(2000))
    Canvas(modifier = modifier
        .border(1.dp, colors[6])
        .drawWithCache {
            val center = Offset(size.width / 2, size.height / 2)
            val textNeedRadius = 25.dp.toPx()
            val radarRadius = center.x - textNeedRadius
            val turnRadius = radarRadius / CIRCLE_TURN

            val itemAngle = 360 / data.size
            val startAngle = if (data.size % 2 == 0) {
                -90 - itemAngle / 2
            } else {
                -90
            }
            val textPaint = TextPaint().apply {
                isAntiAlias = true
                textSize = 10.sp.toPx()
                color = colors[6].toArgb()
            }
            val path = Path()
            onDrawWithContent {
                path.reset()
                // 绘制圆形
                for (turn in 0 until CIRCLE_TURN) {
                    drawCircle(colors[turn], radius = turnRadius * (CIRCLE_TURN - turn))
                    drawCircle(
                        colors[3],
                        radius = turnRadius * (CIRCLE_TURN - turn),
                        style = Stroke(2f)
                    )
                }

                for (index in data.indices) {
                    // 绘制虚线
                    val currentAngle = startAngle + itemAngle * index
                    val xy = inCircleOffset(center, progress * radarRadius, currentAngle)
                    drawLine(
                        colors[4],
                        center,
                        xy,
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f))
                    )

                    // 绘制文字
                    val textPointRadius = progress * radarRadius + 10f
                    val offset = inCircleOffset(center, textPointRadius, currentAngle)
                    val text = data[index].text
                    wrapText(
                        text,
                        textPaint,
                        size.width,
                        offset,
                        currentAngle,
                        if (specialHandle) textPaint.textSize * 2 else null
                    )

                    // 绘制连接范围
                    val pointData = data[index]
                    val pointRadius = progress * radarRadius * pointData.value / 100
                    val fixPoint = inCircleOffset(center, pointRadius, currentAngle)
                    if (index == 0) {
                        path.moveTo(fixPoint.x, fixPoint.y)
                    } else {
                        path.lineTo(fixPoint.x, fixPoint.y)
                    }
                }
                path.close()
                drawPath(path, colors[5])
                drawPath(path, colors[6], style = Stroke(5f))
            }
        }
        .onGloballyPositioned {
            enable = it.boundsInRoot().top >= 0 && it.boundsInRoot().right > 0
        }) {}
}


fun DrawScope.inCircleOffset(center: Offset, radius: Float, angle: Int): Offset {
    return Offset(
        (center.x + radius * cos(angle * PI / 180)).toFloat(),
        (center.y + radius * sin(angle * PI / 180)).toFloat()
    )
}

/**
 * 绘制换行文字
 */
fun DrawScope.wrapText(
    text: String,
    textPaint: TextPaint,
    width: Float,
    offset: Offset,
    currentAngle: Int,
    chineseWrapWidth: Float? = null // 用来处理UI需求中文每两个字符换行
) {
    val quadrant = quadrant(currentAngle)
    var textMaxWidth = width
    when (quadrant) {
        0 -> {
            textMaxWidth = width / 2
        }
        -1, 1, 2 -> {
            textMaxWidth = size.width - offset.x
        }
        -2, 3, 4 -> {
            textMaxWidth = offset.x
        }
    }
    // 需要特殊处理换行&&包含中文字符&&文本绘制一行的宽度>文本最大宽度
    if (chineseWrapWidth != null && isContainChinese(text) && textPaint.measureText(text) > textMaxWidth) {
        textMaxWidth = chineseWrapWidth
    }
    val staticLayout = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        StaticLayout.Builder.obtain(text, 0, text.length, textPaint, textMaxWidth.toInt()).apply {
            this.setAlignment(Layout.Alignment.ALIGN_NORMAL)
        }.build()
    } else {
        StaticLayout(
            text,
            textPaint,
            textMaxWidth.toInt(),
            Layout.Alignment.ALIGN_NORMAL,
            1.0f,
            0f,
            false
        )
    }
    val textHeight = staticLayout.height
    val lines = staticLayout.lineCount
    val isWrap = lines > 1
    val textTrueWidth = if (isWrap) staticLayout.getLineWidth(0) else textPaint.measureText(text)
    drawContext.canvas.nativeCanvas.save()
    when (quadrant) {
        0 -> {
            drawContext.canvas.nativeCanvas.translate(
                offset.x - textTrueWidth / 2,
                offset.y - textHeight
            )
        }
        -1 -> {
            drawContext.canvas.nativeCanvas.translate(offset.x, offset.y - textHeight / 2)
        }
        -2 -> {
            drawContext.canvas.nativeCanvas.translate(
                offset.x - textTrueWidth,
                offset.y - textHeight / 2
            )
        }
        1 -> {
            drawContext.canvas.nativeCanvas.translate(
                offset.x,
                if (!isWrap) offset.y - textHeight / 2 else offset.y - (textHeight - textHeight / lines / 2)
            )
        }
        2 -> {
            drawContext.canvas.nativeCanvas.translate(
                offset.x,
                if (!isWrap) offset.y - textHeight / 2 else offset.y - textHeight / lines / 2
            )
        }
        3 -> {
            drawContext.canvas.nativeCanvas.translate(
                offset.x - textTrueWidth,
                if (!isWrap) offset.y - textHeight / 2 else offset.y - textHeight / lines / 2
            )
        }
        4 -> {
            drawContext.canvas.nativeCanvas.translate(
                offset.x - textTrueWidth,
                if (!isWrap) offset.y - textHeight / 2 else offset.y - (textHeight - textHeight / lines / 2)
            )
        }
    }
    staticLayout.draw(drawContext.canvas.nativeCanvas)
    drawContext.canvas.nativeCanvas.restore()
}

private fun isContainChinese(str: String): Boolean {
    val p = Pattern.compile("[\u4e00-\u9fa5]")
    val m = p.matcher(str)
    return m.find()
}

private fun quadrant(angle: Int): Int {
    return if (angle == -90 || angle == 90) {
        0 // 垂直
    } else if (angle == 0) {
        -1 // 水平右边
    } else if (angle == 180) {
        -2 // 水平左边
    } else if (angle > -90 && angle < 0) {
        1
    } else if (angle > 0 && angle < 90) {
        2
    } else if (angle > 90 && angle < 180) {
        3
    } else {
        4
    }
}
