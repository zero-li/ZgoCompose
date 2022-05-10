@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.cookbook.ui.md3.surface


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.zgo.lib.ui.theme.md_theme_light_background

/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/10
 */

@Composable
fun SurfaceExample() {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { SurfaceSample() }
        item { ClickableSurfaceSample() }

    }

}


@Composable
fun SurfaceSample() {
    Surface(color = md_theme_light_background) {
        Text("Text on Surface")
    }
}

@Composable
fun ClickableSurfaceSample() {
    var count by remember { mutableStateOf(0) }
    Surface(
        onClick = { count++ },
    ) {
        Text("Clickable Surface. Count: $count")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectableSurfaceSample() {
    var selected by remember { mutableStateOf(false) }
    Surface(
        selected = selected,
        onClick = { selected = !selected },
    ) {
        Text(
            text = if (selected) "Selected" else "Not Selected",
            textAlign = TextAlign.Center
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToggleableSurfaceSample() {
    var checked by remember { mutableStateOf(false) }
    Surface(
        checked = checked,
        onCheckedChange = { checked = !checked },
        color = if (checked) {
            MaterialTheme.colorScheme.surfaceVariant
        } else {
            MaterialTheme.colorScheme.surface
        }
    ) {
        Text(
            text = if (checked) "ON" else "OFF",
            textAlign = TextAlign.Center
        )
    }
}