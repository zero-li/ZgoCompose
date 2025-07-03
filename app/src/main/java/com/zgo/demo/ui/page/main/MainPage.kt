package com.zgo.demo.ui.page.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CrueltyFree
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.demo.fun_android.data.home.FunViewModel
import com.zgo.demo.tucong.ui.page.TuCongPage
import com.zgo.demo.ui.page.main.home.HomePage
import com.zgo.demo.ui.page.main.mine.MinePage
import com.zgo.lib.ui.base.ColorPage
import com.zgo.lib.ui.components.ZgoScaffold
import com.zgo.lib.ui.theme.AppTheme


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(navigate: (routeName: String) -> Unit) {
    val navBottomBar = rememberNavController()


    ZgoScaffold(

        modifier = Modifier.navigationBarsPadding(),

        bottomBar = {
            BottomNavigation(navBottomBar)
        }) { innerPadding ->
        // Apply the padding globally to the whole BottomNavScreensController
        Box(
            //实现底部Padding，否则会被挡住
            modifier = Modifier.padding(PaddingValues(bottom = innerPadding.calculateBottomPadding()))
            //.systemBarsPadding()
        ) {
            NavHost(
                navController = navBottomBar,
                startDestination = BottomNavItem.Home.screen_route
            ) {
                composable(BottomNavItem.Home.screen_route) {
                    HomePage(navigate)
                }

                composable(BottomNavItem.TuCong.screen_route) {
                    TuCongPage(navigate)
                }
                composable(BottomNavItem.Mine.screen_route) {
                    MinePage(navigate)
                }

                composable(BottomNavItem.Color.screen_route) {
                    ColorPage()
                }

            }
        }

    }

}

@Composable
fun BottomNavigation(navHostController: NavHostController) {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.TuCong,
        BottomNavItem.Mine,
        BottomNavItem.Color,
    )

    NavigationBar {
//        val navBackStackEntry by navHostController.currentBackStackEntryAsState()
//        val currentRoute = navBackStackEntry?.destination?.route

        items.forEachIndexed { index, item ->
            NavigationBarItem(
                label = { Text(item.title) },
                icon = { Icon(item.icon, contentDescription = item.title) },
//                selected = currentRoute == item.screen_route,
                selected = index == selectedItem,
                onClick = {
                    selectedItem = index


                    navHostController.navigate(item.screen_route) {

                        navHostController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }

                },
                alwaysShowLabel = true
            )
        }

    }
}


private sealed class BottomNavItem(
    var title: String,
    var icon: ImageVector,
    var screen_route: String
) {
    object Home : BottomNavItem("首页", Icons.Filled.Home, "drawable_home")
    object TuCong : BottomNavItem("图虫", Icons.Filled.CrueltyFree, "tu_cong")
    object Mine : BottomNavItem("我的", Icons.Filled.Person, "mine")
    object Color : BottomNavItem("色彩", Icons.Filled.Palette, "color")

}


@ExperimentalMaterial3Api
@Preview
@Composable
fun ZgoScaffoldPreview() {
    AppTheme(useDarkTheme = false) {
        MainPage {

        }
    }

}
