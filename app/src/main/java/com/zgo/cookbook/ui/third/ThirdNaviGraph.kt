@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.cookbook.ui.third

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.zgo.cookbook.data.ThirdWidgets
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/29
 */

fun NavGraphBuilder.thirdNaviGraph(onBack: () -> Unit, navigate: (routeName: String) -> Unit) {

    ThirdWidgets.forEach { widget ->
        composable(widget.title) {
            ZgoScaffold(title = widget.title, onBackClick = onBack) {
                widget.content()
            }

        }
    }

}
