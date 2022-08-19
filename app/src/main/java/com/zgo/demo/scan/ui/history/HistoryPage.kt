@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class,
    ExperimentalLayoutApi::class
)

package com.zgo.demo.scan.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CrueltyFree
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.systemBarsPadding
import com.zgo.cookbook.ui.main.TitleItem
import com.zgo.demo.scan.data.db.ScanHistory
import com.zgo.demo.scan.ui.history.HistoryViewModel
import com.zgo.lib.ui.components.ListItem
import com.zgo.lib.ui.components.ZgoDivider
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/11
 */

@Composable
fun HistoryPage(
    navigateScanResult: (history: ScanHistory) -> Unit,
) {

    val viewModel = remember {
        HistoryViewModel()
    }
    val list = viewModel.getAll().collectAsState(initial = listOf())

    ZgoScaffold(
        modifier = Modifier.statusBarsPadding(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "历史")
                },
                //error
                //  modifier = Modifier.statusBarsPadding(),
            )
        }) { paddingValues ->

        LazyColumn(
            contentPadding = PaddingValues(
                horizontal = 20.dp,
                vertical = 8.dp
            ),
            modifier = Modifier
                .padding(paddingValues)
                .consumedWindowInsets(paddingValues)
            ,
        ) {
            stickyHeader {
                TitleItem("自定义组件")
            }
            items(list.value) { history ->
                HistoryItem(history = history) {
                    navigateScanResult(history)
                }
            }
        }

    }
}


@Composable
fun HistoryItem(history: ScanHistory, onclick: () -> Unit) {

    Column {
        ListItem(
            modifier = Modifier.clickable { onclick() },
            icon = {
                Icon(
                    modifier = Modifier.size(40.dp),
                    imageVector = Icons.Filled.CrueltyFree, contentDescription = "icon"
                )

            },
            overlineText = {
                Text(text = history.id.toString())
            },
            secondaryText = {
                Text(text = history.format)
            },
            trailing = {
                Icon(imageVector = Icons.Filled.NavigateNext, contentDescription = "icon")
            },
        ) {
            Text(text = history.code)
        }
        ZgoDivider()
    }


}


@Preview
@Composable
fun Preview() {

    HistoryItem(history = ScanHistory(code = "12345", format = "qrcode", type = "8")) {}

}

