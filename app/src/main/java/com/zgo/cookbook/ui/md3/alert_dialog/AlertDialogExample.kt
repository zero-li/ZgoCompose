@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.cookbook.ui.md3.alert_dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/29
 */

@Composable
fun AlertDialogExample(
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        val openDialog = remember { mutableStateOf(false) }
        val openDialog1 = remember { mutableStateOf(false) }
        val openDialog2 = remember { mutableStateOf(false) }

        Button(onClick = {
            openDialog.value = true
        }) {
            Text("带Icon")
        }

        Button(onClick = {
            openDialog1.value = true

        }) {
            Text("不带Icon")
        }
        Button(onClick = {

            openDialog2.value = true
        }) {
            Text("不带Icon-居中")
        }

        if (openDialog.value) {
            Dialog(openDialog) { Icon(Icons.Filled.Favorite, contentDescription = null) }
        }

        if (openDialog1.value) {
            Dialog(openDialog1)
        }

        if (openDialog2.value) {
            Dialog(openDialog2) { }
        }


    }

}


@Composable
private fun Dialog(
    openDialog: MutableState<Boolean> = remember {
        mutableStateOf(false)
    },
    icon: @Composable (() -> Unit)? = null,
) {
    AlertDialog(
        onDismissRequest = {
            // 实现点击外部，关闭dialog
            openDialog.value = false
        },
        icon = icon,
        title = {
            Text(text = "标题")
        },
        text = {
            Text(
                "内容文本"
            )
        },
        confirmButton = {
            TextButton(
                onClick = {
                    openDialog.value = false
                }
            ) {
                Text("确认")
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    openDialog.value = false
                }
            ) {
                Text("取消")
            }
        }
    )

}
