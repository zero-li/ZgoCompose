@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.ui.page.main.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.google.accompanist.insets.systemBarsPadding
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer
import com.zgo.demo.fun_android.data.bean.Article
import com.zgo.demo.fun_android.data.home.FunViewModel
import com.zgo.lib.ui.components.IconNavRight
import com.zgo.lib.ui.components.SwipeRefreshList
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
@Composable
fun HomePage(
    navigate: (routeName: String) -> Unit,
) {

    val viewmodel = FunViewModel()

    val lazyItem = viewmodel.pagingHomeArticle.collectAsLazyPagingItems()

    ZgoScaffold(
        modifier = Modifier
            .statusBarsPadding(),
        topBar = {
            SmallTopAppBar(title = {
                Text(text = "首页")
            })
        }) {

        SwipeRefreshList(lazyItem, modifier = Modifier.padding(paddingValues = it)) {

            items(lazyItem) { item ->

                item?.apply {
                    Item(
                        this, Modifier.placeholder(
                            visible = false,
                            highlight = PlaceholderHighlight.shimmer(),
                        )
                    )
                }


            }

        }


    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Item(data: Article? = null, childModifier: Modifier) {

    Card(modifier = Modifier
        .wrapContentHeight()
//        .height(160.dp)
        .padding(top = 10.dp, start = 15.dp, end = 15.dp)
        .clickable { }
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(vertical = 16.dp)
        ) {
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                data!!.shareUser,
                style = TextStyle(fontSize = 16.sp),
                modifier = childModifier
                    .weight(1f)
                    .padding(start = 30.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))


            Text(
                data.niceDate,
                style = TextStyle(fontSize = 16.sp),
                textAlign = TextAlign.Center,
                modifier = childModifier
                    .widthIn(min = 45.dp)
                    .padding(end = 40.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))


            IconNavRight(modifier = childModifier)
            Spacer(modifier = Modifier.width(5.dp))


        }

    }

}
