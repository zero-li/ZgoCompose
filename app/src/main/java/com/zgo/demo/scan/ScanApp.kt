package com.zgo.demo.scan

import androidx.compose.runtime.Composable
import com.google.accompanist.insets.ProvideWindowInsets
import com.zgo.lib.ui.theme.AppTheme


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/28
 */
@Composable
fun ScanApp() {
    ProvideWindowInsets {
        AppTheme {
            ScanNavGraph()

        }
    }


}
