package com.zgo.demo.chat.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BusinessCenter
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.Widgets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.cookbook.ui.main.WidgetsPage
import com.zgo.lib.ui.base.ColorPage
import com.zgo.lib.ui.components.AbsBottomNavItem
import com.zgo.lib.ui.components.ZgoBottomNavigation
import com.zgo.lib.ui.components.ZgoScaffold


@Composable
fun ChatMainPage() {
    val navBottomBar = rememberNavController()

    ZgoScaffold(
        bottomBar = {

            val items = listOf(
                BottomNavItem.Widgets,
                BottomNavItem.Tools,
                BottomNavItem.Expand,
            )
            ZgoBottomNavigation(navBottomBar, items)
        }) { inner ->
        Box(
            modifier = Modifier.padding(PaddingValues(bottom = inner.calculateBottomPadding()))
        ) {
            NavHost(
                navController = navBottomBar,
                startDestination = BottomNavItem.Widgets.screen_route,

                ) {
                composable(BottomNavItem.Widgets.screen_route) {
                    ColorPage(10)
                }
                composable(BottomNavItem.Tools.screen_route) {
                    ColorPage(12)
                }
                composable(BottomNavItem.Expand.screen_route) {
                    WidgetsPage {

                    }

                }
            }
        }

    }
}


private sealed class BottomNavItem(title: String, icon: ImageVector, screen_route: String) :
    AbsBottomNavItem(title, icon, screen_route) {
    object Widgets : BottomNavItem("组件2", Icons.Filled.Widgets, "Widgets")
    object Tools : BottomNavItem("工具箱", Icons.Filled.BusinessCenter, "PanTool")
    object Expand : BottomNavItem("扩展", Icons.Filled.Science, "Expand")

}