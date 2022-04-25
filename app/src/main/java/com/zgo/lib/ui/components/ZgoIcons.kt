package com.zgo.lib.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/21
 */
@Composable
fun IconNavRight(modifier: Modifier = Modifier) {
    Icon(Icons.Filled.ChevronRight, contentDescription = null, modifier = modifier)
}