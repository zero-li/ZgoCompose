package com.zgo.demo.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.demo.ui.page.main.MainPage
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
        startDestination = "main_page"
    ) {
        composable("main_page") {
            MainPage {
                navCtrl.navigate(it)
            }
        }


        addFirstGraph(onBack) {
            navCtrl.navigate(it)
        }


    }

}
