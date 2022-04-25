@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.ui.page.main.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.systemBarsPadding
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
@Composable
fun HomePage(
    navigate: (routeName: String) -> Unit,) {

    ZgoScaffold(
        modifier = Modifier.systemBarsPadding(),
        topBar ={
            SmallTopAppBar(title = {
                Text(text = "首页")
            })
        } ) {


    }

}
