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

package androidx.compose.material.catalog.ui.specification

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpecificationTopAppBar(
    title: String,
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    val backgroundColor = lerp(
        MaterialTheme.colorScheme.surface,
        MaterialTheme.colorScheme.surfaceColorAtElevation(elevation = 3.dp),
        FastOutLinearInEasing.transform(scrollBehavior?.state?.overlappedFraction ?: 0f)
    )

    val foregroundColors = TopAppBarDefaults.centerAlignedTopAppBarColors(
        containerColor = Color.Transparent,
        scrolledContainerColor = Color.Transparent
    )
    // Wrapping in a Surface to handle window insets
    // https://issuetracker.google.com/issues/183161866
    Surface(color = backgroundColor) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = title,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            },
            scrollBehavior = scrollBehavior,
            colors = foregroundColors,
            modifier = Modifier.windowInsetsPadding(
                WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top)
            )
        )
    }
}
