package com.zgo.cookbook.ui.md3.text


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.zgo.lib.ui.theme.color.ChColor


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/9
 */
@Composable
fun TextExample() {
    LazyColumn(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { TextStyleSample() }
        item { BaselineShiftAnnotatedStringSample() }

        item { ParagraphStyleSample() }
        item { ParagraphStyleAnnotatedStringsSample() }

        item { SpanStyleSample() }

        item { TextDecorationCombinedSample() }

        item { TextOverflowClipSample() }
        item { Spacer(modifier = Modifier.height(5.dp)) }

        item { TextOverflowEllipsisSample() }
        item { TextOverflowVisibleFixedSizeSample() }
        item { TextOverflowVisibleMinHeightSample() }

    }

}


@Composable
fun TextStyleSample() {
    Text(
        text = "Demo Text",
        style = TextStyle(
            color = Color.Red,
            fontSize = 16.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.W800,
            fontStyle = FontStyle.Italic,
            letterSpacing = 0.5.em,
            background = Color.LightGray,
            textDecoration = TextDecoration.Underline
        )
    )
}


@Composable
fun BaselineShiftAnnotatedStringSample() {
    val annotatedString = buildAnnotatedString {
        append("Text ")
        withStyle(SpanStyle(baselineShift = BaselineShift.Superscript)) {
            append("Demo")
        }
    }
    Text(text = annotatedString)
}


@Composable
fun ParagraphStyleSample() {
    val textStyle = TextStyle(
        textAlign = TextAlign.Justify,
        lineHeight = 20.sp,
        textIndent = TextIndent(firstLine = 14.sp, restLine = 3.sp)
    )
    Text(
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua.\nUt enim ad minim veniam, quis " +
                "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
        style = textStyle
    )
}

@Composable
fun ParagraphStyleAnnotatedStringsSample() {
    val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua.\nUt enim ad minim veniam, quis " +
            "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."

    val paragraphStyle1 = ParagraphStyle(
        textIndent = TextIndent(firstLine = 14.sp)
    )
    val paragraphStyle2 = ParagraphStyle(
        lineHeight = 30.sp
    )

    Text(
        text = buildAnnotatedString {
            append(text)
            addStyle(paragraphStyle1, 0, text.indexOf('\n') + 1)
            addStyle(paragraphStyle2, text.indexOf('\n') + 1, text.length)
        }
    )
}


@Composable
fun SpanStyleSample() {
    Text(
        fontSize = 16.sp,
        text = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Red)) {
                append("Hello")
            }
            withStyle(SpanStyle(color = Color.Blue)) {
                append(" World")
            }
        }
    )
}


@Composable
fun TextDecorationCombinedSample() {
    Text(
        text = "Demo Text",
        textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
    )
}


@Composable
fun TextOverflowClipSample() {
    Text(
        text = "TextOverflow.Clip",
        modifier = Modifier
            .size(100.dp, 100.dp)
            .background(ChColor.lvhui_469.color),
        fontSize = 35.sp,
        overflow = TextOverflow.Clip
    )
}

@Composable
fun TextOverflowEllipsisSample() {
    Text(
        text = "Ellipsis Overflow",
        modifier = Modifier
            .width(200.dp)
            .background(ChColor.fengyehong_250.color),
        fontSize = 35.sp,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1
    )
}

@Composable
fun TextOverflowVisibleFixedSizeSample() {
    val background = remember { mutableStateOf(ChColor.huanglianhuang_18.color) }
    Box(modifier = Modifier.size(100.dp, 100.dp)) {
        Text(
            text = "Hello ".repeat(2),
            modifier = Modifier
                .size(100.dp, 70.dp)
                .background(background.value)
                .clickable {
                    background.value = if (background.value == ChColor.huanglianhuang_18.color) {
                        ChColor.honggonghong_207.color
                    } else {
                        ChColor.huanglianhuang_18.color
                    }
                },
            fontSize = 35.sp,
            overflow = TextOverflow.Visible
        )
    }
}

@Composable
fun TextOverflowVisibleMinHeightSample() {
    val background = remember { mutableStateOf(ChColor.baoshilan_380.color) }
    val count = remember { mutableStateOf(1) }
    Box(modifier = Modifier.size(100.dp, 100.dp)) {
        Text(
            text = "Hello".repeat(count.value),
            modifier = Modifier
                .width(100.dp)
                .heightIn(min = 70.dp)
                .background(background.value)
                .clickable {
                    background.value =
                        if (background.value == ChColor.baoshilan_380.color) ChColor.fengyehong_250.color else ChColor.baoshilan_380.color
                    count.value = if (count.value == 1) 2 else 1
                },
            fontSize = 35.sp,
            overflow = TextOverflow.Visible
        )
    }
}
