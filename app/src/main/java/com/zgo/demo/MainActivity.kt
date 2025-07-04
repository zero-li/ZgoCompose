package com.zgo.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.zgo.demo.ui.MyApp
import com.zgo.lib.utils.Utils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.init(this)

        // Enable edge-to-edge display
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // This app draws behind the system bars, so we want to handle fitting system windows
        //WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MyApp()
//            CookbookApp()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}