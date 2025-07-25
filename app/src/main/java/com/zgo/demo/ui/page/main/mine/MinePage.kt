package com.zgo.demo.ui.page.main.mine

import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MinePage(
    navigate: (routeName: String) -> Unit,) {
    ZgoScaffold(
        modifier = Modifier.systemBarsPadding(),
        topBar ={
            TopAppBar(title = {
                Text(text = "我的")
            })
        } ) {


    }

}