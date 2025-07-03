package com.zgo.demo.chat

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zgo.cookbook.ui.layout.layoutNaviGraph
import com.zgo.cookbook.ui.main.CookMainPage
import com.zgo.cookbook.ui.md3.md3NaviGraph
import com.zgo.cookbook.ui.third.thirdNaviGraph
import com.zgo.demo.chat.ui.ChatMainPage


/*
 * 
 * 
 * @author: zgo
 */
@Composable
fun ChatNavGraph() {
    val navCtrl = rememberNavController()

    val onBack = {
        navCtrl.navigateUp()
        Unit
    }


    NavHost(navController = navCtrl, startDestination = "chat_main") {

        composable("chat_main") {
            ChatMainPage()
        }

        md3NaviGraph(onBack) {
            navCtrl.navigate(it)
        }

        layoutNaviGraph(onBack) {
            navCtrl.navigate(it)
        }

        thirdNaviGraph(onBack) {
            navCtrl.navigate(it)
        }

    }


}
