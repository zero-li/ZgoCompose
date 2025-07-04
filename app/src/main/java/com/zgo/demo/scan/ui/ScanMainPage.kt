@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.scan.ui

import android.net.Uri
import androidx.compose.foundation.layout.PaddingValues
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
import com.zgo.cookbook.ui.main.WidgetsPage
import com.zgo.demo.scan.ui.scanner.ScannerPage
import com.zgo.demo.scan.ui.setting.SettingPage
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
            modifier = Modifier.padding(PaddingValues(bottom = innerPadding.calculateBottomPadding()))

        ) {
            composable(BottomNavItem.Scanner.screen_route) {
                ScannerPage() {
                    val json = Uri.encode(it)
                    navigate("scan_result/$json")
                }
            }
            composable(BottomNavItem.History.screen_route) {
                HistoryPage {
                    val json = Uri.encode(it.toJson().toString())
                    navigate("scan_result/$json")

                }
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
