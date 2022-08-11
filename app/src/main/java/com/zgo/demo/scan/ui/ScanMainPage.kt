@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.scan.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.QrCodeScanner
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.navigationBarsPadding
import com.zgo.lib.ui.components.AbsBottomNavItem
import com.zgo.lib.ui.components.ZgoBottomNavigation
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * scan 主页
 * @author: zhhli
 * @date: 22/4/28
 */
@Composable
fun ScanMainPage(
    navigate: (routeName: String) -> Unit,
) {

    val navBottomBar = rememberNavController()

    ZgoScaffold(
        modifier = Modifier.navigationBarsPadding(),
        bottomBar = {
            val items = listOf(
                BottomNavItem.Scanner,
                BottomNavItem.History,
                BottomNavItem.Settings,
            )
            ZgoBottomNavigation(navBottomBar = navBottomBar, items = items)
        }
    ) { innerPadding ->

        NavHost(
            navController = navBottomBar,
            startDestination = BottomNavItem.Scanner.screen_route,
            Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Scanner.screen_route) {
                ScannerPage(navigate)
            }
            composable(BottomNavItem.History.screen_route) {
                HistoryPage(navigate)
            }
            composable(BottomNavItem.Settings.screen_route) {
                SettingPage(navigate)
            }


        }


    }

}


private sealed class BottomNavItem(title: String, icon: ImageVector, screen_route: String) :
    AbsBottomNavItem(title, icon, screen_route) {
    object Scanner : BottomNavItem("扫描", Icons.Filled.QrCodeScanner, "Scanner")
    object History : BottomNavItem("历史", Icons.Filled.History, "History")
    object Settings : BottomNavItem("设置", Icons.Filled.Settings, "Settings")

}
