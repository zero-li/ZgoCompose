@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.cookbook.ui.layout

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.zgo.cookbook.data.CookWidget
import com.zgo.cookbook.ui.layout.list.BoxExample
import com.zgo.cookbook.ui.layout.list.GridListExample
import com.zgo.cookbook.ui.layout.list.HorizontalListExample
import com.zgo.cookbook.ui.layout.list.VerticalListExample
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/16
 */
fun NavGraphBuilder.layoutNaviGraph(onBack: () -> Unit, navigate: (routeName: String) -> Unit) {

    layoutWidgets.forEach { widget ->
        composable(widget.title) {
            ZgoScaffold(title = widget.title, onBackClick = onBack) {
                Surface(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 5.dp),
                    content = widget.content
                )

            }

        }
    }

}


val layoutWidgets = listOf(
    CookWidget("VerticalList") { VerticalListExample() },
    CookWidget("HorizontalList") { HorizontalListExample() },
    CookWidget("GridList") { GridListExample() },
    CookWidget("Box") { BoxExample() },
)