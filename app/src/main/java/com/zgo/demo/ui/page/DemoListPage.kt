@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.ui.page

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.zgo.demo.scan.ScanApp
import com.zgo.demo.ui.page.main.MainPage
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/11
 */

private open class Demo(val title: String) {
    object main : Demo("main")
    object fun_android : Demo("fun_android")
    object scan : Demo("scan")
    object tucong : Demo("tucong")

}


fun NavGraphBuilder.demoListNaviGraph(onBack: () -> Unit, navigate: (routeName: String) -> Unit) {

    composable(Demo.main.title) {
        MainPage(navigate = navigate)
    }
    composable(Demo.fun_android.title) {
        MainPage(navigate = navigate)
    }
    composable(Demo.scan.title) {
        ScanApp()
    }
    composable(Demo.tucong.title) {
        MainPage(navigate = navigate)
    }


}


@Composable
fun DemoListPage(
    onBack: () -> Unit,
    navigate: (routeName: String) -> Unit,
) {
    ZgoScaffold(title = "DemoList", onBackClick = onBack) {


        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {


            val list = listOf(
                Demo.main,
                Demo.fun_android,
                Demo.scan,
                Demo.tucong,
            )

            items(list) { demo ->
                DemoItem(title = demo.title) {
                    navigate(demo.title)
                }
            }


        }

    }


}

@Composable
fun DemoItem(
    title: String,
    onClick: () -> Unit,
) {

    OutlinedCard(
        modifier = Modifier
            .padding(8.dp)
            .height(60.dp)
            .fillMaxWidth(),
        onClick = onClick
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)

        ) {
            Text(
                text = title,
                modifier = Modifier.weight(1f)
            )
            Icon(
                Icons.Filled.NavigateNext,
                contentDescription = null,
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp)
            )

        }

    }

}