@file:OptIn(ExperimentalFoundationApi::class)

package com.zgo.cookbook.ui.md3.button

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/29
 */
@Composable
fun ButtonsExample() {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {
            Button(onClick = { /* Do something! */ }) { Text("Button") }
        }

        item {
            ElevatedButton(onClick = { /* Do something! */ }) { Text("Elevated Button") }

        }
        item {
            FilledTonalButton(onClick = { /* Do something! */ }) { Text("Filled Tonal Button") }

        }
        item {
            OutlinedButton(onClick = { /* Do something! */ }) { Text("Outlined Button") }

        }
        item {
            TextButton(onClick = { /* Do something! */ }) { Text("Text Button") }

        }
        item {
            Button(onClick = { /* Do something! */ }) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )
                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                Text("Like")

            }

        }


    }

}

