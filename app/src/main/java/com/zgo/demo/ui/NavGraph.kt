package com.zgo.demo.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.cookbook.CookbookApp
import com.zgo.demo.ui.page.DemoListPage
import com.zgo.demo.ui.page.RootPage
import com.zgo.demo.ui.page.demoListNaviGraph
import com.zgo.lib.ui.base.addFirstGraph


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph() {

    val navCtrl = rememberNavController()

    val onBack = {
        navCtrl.navigateUp()
        Unit
    }



    NavHost(
        navController = navCtrl,
        startDestination = "root"
    ) {

        composable("root") {
            RootPage() {
                navCtrl.navigate(it)
            }
        }

        composable("cook_book") {
            CookbookApp()
        }



        composable("demo") {
            DemoListPage(onBack = onBack) {
                navCtrl.navigate(it)
            }
        }

        demoListNaviGraph(onBack) {
            navCtrl.navigate(it)
        }


        addFirstGraph(onBack) {
            navCtrl.navigate(it)
        }


    }

}
