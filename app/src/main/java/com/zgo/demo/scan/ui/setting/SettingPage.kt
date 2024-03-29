@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.scan.ui.setting

import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/8/11
 */


@Composable
fun SettingPage(
    navigate: (routeName: String) -> Unit,
) {

    ZgoScaffold(
        modifier = Modifier.statusBarsPadding(),
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(text = "设置")
            },

                )
        }) {


    }

}
