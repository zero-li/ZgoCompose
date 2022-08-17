package com.zgo.demo.scan

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.zgo.demo.scan.data.db.ScanHistory
import com.zgo.demo.scan.data.db.ZgoParcelableType
import com.zgo.demo.scan.ui.ScanMainPage
import com.zgo.demo.scan.ui.scanner.ScanResultPage


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


        // https://stackoverflow.com/questions/65610003/pass-parcelable-argument-with-compose-navigation
        // https://stackoverflow.com/questions/69059149/how-pass-parcelable-argument-with-new-version-of-compose-navigation
        composable("scan_result/{history}",
            arguments = listOf(navArgument("history") {
                type = ZgoParcelableType(ScanHistory::class.java)

//                type = ScanHistoryType()
            }
            )
        ) {
            val history = it.arguments?.getParcelable<ScanHistory>("history")
//            val history = ScanHistory.fromJson(json!!)
            ScanResultPage(history!!, onBack)
        }

    }


}
