@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)

package com.zgo.cookbook.ui.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.systemBarsPadding
import com.zgo.cookbook.data.CookWidget
import com.zgo.cookbook.data.Md3Widgets
import com.zgo.cookbook.data.ThirdWidgets
import com.zgo.cookbook.ui.layout.layoutWidgets
import com.zgo.lib.ui.components.ZgoScaffold
import com.zgo.lib.ui.components.gridItems


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/28
 */
@Composable
fun WidgetsPage(
    navigate: (routeName: String) -> Unit,
) {
    ZgoScaffold(modifier = Modifier.systemBarsPadding(),
        topBar = {
            SmallTopAppBar(title = {
                Text(text = "组件")
            })
        }) {
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            stickyHeader {
                TitleItem("Md3组件")
            }
            gridItems(Md3Widgets, 2) { widget ->
                WidgetItem(widgetData = widget, navigate)
            }

            stickyHeader {
                TitleItem("布局")
            }
            gridItems(layoutWidgets, 2) { widget ->
                WidgetItem(widgetData = widget, navigate)
            }

            stickyHeader {
                TitleItem("自定义组件")
            }
            gridItems(ThirdWidgets, 2) { widget ->
                WidgetItem(widgetData = widget, navigate)
            }

        }


    }
}


@Composable
fun TitleItem(title: String) {
    Text(
        title, style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(vertical = 4.dp)
    )


}

@Composable
fun WidgetItem(
    widgetData: CookWidget,
    navigate: (routeName: String) -> Unit,
) {
    OutlinedCard(
        modifier = Modifier
            .padding(3.dp)
            .heightIn(min = 60.dp),
        onClick = {
            navigate(widgetData.title)
        }
    ) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                widgetData.image,
                contentDescription = widgetData.title,
                modifier = Modifier
                    .width(28.dp)
                    .height(28.dp),
            )


            Text(
                widgetData.title,
                modifier = Modifier.padding(top = 5.dp)
            )
        }
    }


}

@Preview
@Composable
fun Preview() {
    WidgetItem(widgetData = CookWidget("Button") {}, navigate = {

    })
}


