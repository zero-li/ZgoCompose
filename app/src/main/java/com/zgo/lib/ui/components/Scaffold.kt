package com.zgo.lib.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zgo.lib.ui.theme.AppTheme


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/18
 */

@OptIn(ExperimentalMaterial3Api::class)
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
    val scrollBehavior = remember { TopAppBarDefaults.pinnedScrollBehavior() }

    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
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

@ExperimentalMaterial3Api
@Composable
fun ZgoScaffold(
    title: String,
    onBackClick: () -> Unit,
    content: @Composable (PaddingValues) -> Unit
) {
    ZgoScaffold(
        topBar = {
            ZgoAppBar(title = title, onBack = onBackClick)
        },
        content = content
    )

}

@ExperimentalMaterial3Api
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

