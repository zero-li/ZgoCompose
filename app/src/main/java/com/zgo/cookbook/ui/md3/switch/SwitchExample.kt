package com.zgo.cookbook.ui.md3.switch

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/10
 */
@Composable
fun SwitchExample() {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { SwitchSample() }
        item { SwitchWithThumbIconSample() }

    }

}


@Composable
fun SwitchSample() {
    var checked by remember { mutableStateOf(true) }
    Switch(checked = checked, onCheckedChange = { checked = it })
}

@Composable
fun SwitchWithThumbIconSample() {
    var checked by remember { mutableStateOf(true) }
    val icon: (@Composable () -> Unit)? = if (checked) {
        {
            Icon(
                imageVector = Icons.Filled.Check,
                contentDescription = null,
//                modifier = Modifier.size(SwitchDefaults.IconSize),
            )
        }
    } else {
        null
    }

    Switch(checked = checked, onCheckedChange = { checked = it } /*thumbContent = icon*/)
}