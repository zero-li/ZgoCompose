package com.zgo.lib.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
//import androidx.compose.material.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/19
 */
@Composable
fun ZgoDivider(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onSurface.copy(0.12f),
    thickness: Dp = 0.4.dp,
    startIndent: Dp = 0.dp

) {
//    Divider(
//        modifier, color, thickness, startIndent
//    )
    val indentMod = if (startIndent.value != 0f) {
        Modifier.padding(start = startIndent)
    } else {
        Modifier
    }
    Box(
        modifier
            .then(indentMod)
            .fillMaxWidth()
            .height(thickness)
            .background(color = color)
    )

}