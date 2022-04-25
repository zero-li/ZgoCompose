package com.zgo.lib.ui.base

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zgo.lib.ui.components.Card
import com.zgo.lib.ui.components.ZgoScaffold
import com.zgo.lib.ui.theme.color.ChColor
import com.zgo.lib.ui.theme.color.NipponColor


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/23
 */


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColorPage() {
    ZgoScaffold(title = "色彩",
        onBackClick = { })
    {

        LazyColumn {


            val items = NipponColor.list
            items(items.size) { index ->
                val item = items[index]
                Card(
                    backgroundColor = item.color,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 5.dp)
                        .heightIn(80.dp)
                ) {
                    Text(text = item.name)
                }
            }



            item {
                Card(
                    backgroundColor = ChColor.fengyehong_250.color,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 5.dp)
                        .heightIn(80.dp)
                ) {
                    Text(text = ChColor.xingrenhuang_1.name)
                }
            }


        }

    }
}

@Preview
@Composable
fun PreviewC() {
    ColorPage()
}


