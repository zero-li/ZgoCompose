package com.zgo.cookbook

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.cookbook.ui.main.CookMainPage
import com.zgo.cookbook.ui.md3.md3NaviGraph
import com.zgo.cookbook.ui.third.thirdNaviGraph


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/28
 */
@Composable
fun CookNavGraph() {
    val navCtrl = rememberNavController()

    val onBack = {
        navCtrl.navigateUp()
        Unit
    }


    NavHost(navController = navCtrl, startDestination = "cook_main") {

        composable("cook_main") {
            CookMainPage() {
                navCtrl.navigate(it)
            }
        }

        md3NaviGraph(onBack) {
            navCtrl.navigate(it)
        }

        thirdNaviGraph(onBack) {
            navCtrl.navigate(it)
        }

    }


}
