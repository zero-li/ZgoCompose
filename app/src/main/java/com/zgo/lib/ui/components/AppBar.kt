package com.zgo.lib.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.statusBarsPadding
import com.zgo.lib.ui.theme.AppTheme


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/18
 */


@Composable
fun ZgoAppBar(
    title: String,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    onBack: (() -> Unit)? = null,
    onThemeClick: () -> Unit = {},
) {

    var moreMenuExpanded by remember { mutableStateOf(false) }
    val backgroundColors = TopAppBarDefaults.smallTopAppBarColors()
    val backgroundColor = backgroundColors.containerColor(
        scrollFraction = scrollBehavior?.scrollFraction ?: 0f
    ).value
    val foregroundColors = TopAppBarDefaults.smallTopAppBarColors(
        navigationIconContentColor = MaterialTheme.colorScheme.primaryContainer
    )

    val foregroundColors_my = TopAppBarDefaults.smallTopAppBarColors(
        containerColor = MaterialTheme.colorScheme.primary,
        titleContentColor = MaterialTheme.colorScheme.primaryContainer,
    )


    // Wrapping in a Surface to handle window insets
    // https://issuetracker.google.com/issues/183161866
//    Surface(color = backgroundColor) {
//
//    }


    SmallTopAppBar(
        title = {
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },

        actions = {
            Box {
                Row {
                    IconButton(onClick = onThemeClick) {
                        Icon(
                            Icons.Filled.Palette,
                            contentDescription = null
                        )
                    }
                    IconButton(onClick = { moreMenuExpanded = true }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = null
                        )
                    }
                }
            }
        },

        navigationIcon = {
            if (onBack != null) {
                IconButton(onClick = onBack) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "??????",
                        tint = MaterialTheme.colorScheme.onBackground

                    )
                }
            }
        },

        scrollBehavior = scrollBehavior,
//        colors = foregroundColors,
        modifier = Modifier
            .statusBarsPadding()
            .navigationBarsPadding(bottom = false)
    )

}


@Preview
@Composable
fun ZgoAppBarPreview() {
    AppTheme(useDarkTheme = false) {

        ZgoAppBar(
            title = "Preview",
            onBack = {},
        )
    }
}