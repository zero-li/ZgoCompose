@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)

package com.zgo.lib.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zgo.lib.ui.theme.AppTheme


/*
 * https://github.dev/androidx/androidx/blob/androidx-main/compose/material3/material3/src/commonMain/kotlin/androidx/compose/material3/ListItem.kt
 * 
 * @author: zhhli
 * @date: 22/1/18
 */

@Composable
fun ZgoScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    containerColor: Color = MaterialTheme.colorScheme.background,
    contentColor: Color = contentColorFor(containerColor),
    content: @Composable (PaddingValues) -> Unit

) {

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = topBar,
        bottomBar = bottomBar,
        snackbarHost = snackbarHost,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = floatingActionButtonPosition,
        contentColor = contentColor,
        content = content



    )
//    {
//        Box(modifier =Modifier.padding(horizontal = 16.dp,vertical = 8.dp)) { content }
//
//    }


}

@Composable
fun ZgoScaffold(
    title: String,
    onBackClick: () -> Unit,
    content: @Composable (PaddingValues) -> Unit
) {
    ZgoScaffold(
        //modifier = Modifier.statusBarsPadding(),
        topBar = {
            ZgoAppBar(title = title, onBack = onBackClick)
        },
        content = {
            Box(
                modifier = Modifier
                    .consumedWindowInsets(it)
                    .padding(it)
            ) {
                content(it)
            }
        }
    )

}

@Preview
@Composable
fun ZgoScaffoldPreview() {
    AppTheme(useDarkTheme = false) {


        ZgoScaffold(
            title = "Preview",
            onBackClick = {},
            content = {
                Surface(modifier = Modifier.padding(0.dp)) {

                    LazyColumn(
                        state = rememberLazyListState(),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(100) {
                            Text("123")
                            ZgoDivider()

                        }
                    }

                }
            }
        )


    }
}

