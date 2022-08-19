@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.zgo.cookbook.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BusinessCenter
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Widgets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.lib.ui.components.AbsBottomNavItem
import com.zgo.lib.ui.components.ZgoBottomNavigation
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 主页
 * @author: zhhli
 * @date: 22/4/28
 */
@Composable
fun CookMainPage(
    navigate: (routeName: String) -> Unit,
) {

    val navBottomBar = rememberNavController()

    ZgoScaffold(
        modifier = Modifier
            .statusBarsPadding(),
        bottomBar = {
            val items = listOf(
                BottomNavItem.Widgets,
                BottomNavItem.Tools,
                BottomNavItem.Expand,
            )
            ZgoBottomNavigation(navBottomBar = navBottomBar, items = items)
        }
    ) { innerPadding ->

        NavHost(
            navController = navBottomBar,
            startDestination = BottomNavItem.Widgets.screen_route,
            // fix bottom padding
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Widgets.screen_route) {
                WidgetsPage(navigate)
            }
            composable(BottomNavItem.Tools.screen_route) {
                WidgetsPage(navigate)
            }
            composable(BottomNavItem.Expand.screen_route) {
                WidgetsPage(navigate)
            }


        }


    }

}


private sealed class BottomNavItem(title: String, icon: ImageVector, screen_route: String) :
    AbsBottomNavItem(title, icon, screen_route) {
    object Widgets : BottomNavItem("组件", Icons.Filled.Widgets, "Widgets")
    object Tools : BottomNavItem("工具箱", Icons.Filled.BusinessCenter, "PanTool")
    object Expand : BottomNavItem("扩展", Icons.Filled.Science, "Expand")

}
