package com.zgo.lib.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/28
 */
@Composable
fun ZgoBottomNavigation(navBottomBar: NavController, items: List<AbsBottomNavItem>) {
    var selectedItem by remember { mutableStateOf(0) }


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


                    navBottomBar.navigate(item.screen_route) {

                        navBottomBar.graph.startDestinationRoute?.let { screen_route ->
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

abstract class AbsBottomNavItem(val title: String, val icon: ImageVector, val screen_route: String)
