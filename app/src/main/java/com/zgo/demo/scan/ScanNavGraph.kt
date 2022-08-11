package com.zgo.demo.scan

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.demo.scan.ui.ScanMainPage


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/28
 */
@Composable
fun ScanNavGraph() {
    val navCtrl = rememberNavController()

    val onBack = {
        navCtrl.navigateUp()
        Unit
    }


    NavHost(navController = navCtrl, startDestination = "scan_main") {

        composable("scan_main") {
            ScanMainPage() {
                navCtrl.navigate(it)
            }
        }

    }


}
