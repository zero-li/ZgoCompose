package com.zgo.lib.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Indication
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/20
 */

@Composable
@NonRestartableComposable
fun Card(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: Shape = RoundedCornerShape(CornerSize(4.dp)),
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
    contentColor: Color = contentColorFor(backgroundColor),
    border: BorderStroke? = null,
    elevation: CardElevation = CardDefaults.cardElevation(),
    indication: Indication? = LocalIndication.current,
    enabled: Boolean = true,
    onClickLabel: String? = null,
    role: Role? = null,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier.clickable {
            onClick()
        },
        shape = shape,
        color = backgroundColor,
        contentColor = contentColor,
        border = border,
        content = content
    )


}