@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.cookbook.ui.md3

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.zgo.cookbook.data.Md3Widgets
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/29
 */

fun NavGraphBuilder.md3NaviGraph(onBack: () -> Unit, navigate: (routeName: String) -> Unit) {

    Md3Widgets.forEach { widget ->
        composable(widget.title) {
            ZgoScaffold(title = widget.title, onBackClick = onBack) {
                widget.content()
            }

        }
    }

}
