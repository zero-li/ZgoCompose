@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.zgo.lib.ui.base

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.zgo.lib.ui.components.ZgoScaffold


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/18
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstPage(
    onBack: () -> Unit,
    navigate: (routeName: String) -> Unit,
) {

    ZgoScaffold(title = "1", onBack) {
        TextButton(onClick = {
            //navigateTo.invoke("second_page")
            navigate("second_page")
        }) {
            Text(text = "FirstPage")
        }
    }


}

@Preview
@Composable
fun Preview() {
    FirstPage({}) {

    }
}


@Composable
fun SecondPage(
    onBack: () -> Unit,
    navigate: (routeName: String) -> Unit,) {

    ZgoScaffold(title = "2", onBack) {
        TextButton(onClick = {
            navigate("third_page")
        }) {
            Text(text = "SecondPage")
        }
    }

}

@Composable
fun ThirdPage(
    onBack: () -> Unit,
    navigate: (routeName: String) -> Unit,) {

    ZgoScaffold(title = "3", onBack) {
        TextButton(onClick = {
            navigate("first_page")

        }) {
            Text(text = "ThirdPage")
        }
    }

}




fun NavGraphBuilder.addFirstGraph(onBack: () -> Unit, navigate: (routeName: String) -> Unit) {

    composable("first_page") {
        SecondPage(onBack, navigate)
    }
    composable("second_page") {
        SecondPage(onBack, navigate)
    }
    composable("third_page") {
        ThirdPage(onBack, navigate)
    }
}
