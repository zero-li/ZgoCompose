/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.material.catalog.library.ui.example

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.catalog.library.model.Example
import androidx.compose.material.catalog.library.ui.common.BorderWidth
import androidx.compose.material.catalog.library.ui.common.compositeBorderColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ExampleItem(
    example: Example,
    onClick: (example: Example) -> Unit
) {
    Card(
        elevation = 0.dp,
        border = BorderStroke(
            width = BorderWidth,
            color = compositeBorderColor()
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .clickable { onClick(example) }
                .padding(ExampleItemPadding)
        ) {
            Column(modifier = Modifier.weight(1f, fill = true)) {
                Text(
                    text = example.name,
                    style = MaterialTheme.typography.subtitle2
                )
                Spacer(modifier = Modifier.height(ExampleItemTextPadding))
                CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                    Text(
                        text = example.description,
                        style = MaterialTheme.typography.caption
                    )
                }
            }
            Spacer(modifier = Modifier.width(ExampleItemPadding))
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }
}

private val ExampleItemPadding = 16.dp
private val ExampleItemTextPadding = 8.dp
