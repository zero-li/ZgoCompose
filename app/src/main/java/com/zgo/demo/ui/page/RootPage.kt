@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.ui.page

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/29
 */
@Composable
fun RootPage(
    navigate: (routeName: String) -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        OutlinedCard(modifier = Modifier
            .padding(8.dp)
            .height(60.dp)
            .fillMaxWidth(),
            onClick = {
                navigate("cook_book")
            }) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)

            ) {
                Text(
                    text = "CookBook",
                    modifier = Modifier.weight(1f)
                )
//                Spacer(modifier = Modifier.height(1.dp))
                Icon(
                    Icons.Filled.NavigateNext,
                    contentDescription = null,
                    modifier = Modifier
                        .height(24.dp)
                        .width(24.dp)
                )

            }

        }

        OutlinedCard(modifier = Modifier
            .padding(8.dp)
            .height(60.dp)
            .fillMaxWidth(),
            onClick = {
                navigate("main_page")
            }) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)

            ) {
                Text(
                    text = "Demo",
                    modifier = Modifier.weight(1f)
                )
//                Spacer(modifier = Modifier.height(1.dp))
                Icon(
                    Icons.Filled.NavigateNext,
                    contentDescription = null,
                    modifier = Modifier
                        .height(24.dp)
                        .width(24.dp)
                )

            }

        }

    }

}

@Preview
@Composable
fun Preview() {
    RootPage(navigate = {})
}

