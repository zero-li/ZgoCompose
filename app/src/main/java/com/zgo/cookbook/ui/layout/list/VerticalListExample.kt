package com.zgo.cookbook.ui.layout.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.zgo.lib.ui.base.ZgoColorItem
import com.zgo.lib.ui.components.gridItems
import com.zgo.lib.ui.theme.color.ChColor
import com.zgo.lib.ui.theme.color.ChKindColor
import com.zgo.lib.ui.theme.color.NipponColor


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/16
 */
@Composable
fun VerticalListExample() {



    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        items(ChKindColor.list.shuffled()) { item ->
            ZgoColorItem(item)
        }



        gridItems(ChColor.list.shuffled(), 3) { item ->
            ZgoColorItem(item)
        }


        items(NipponColor.list.shuffled()) { item ->
            ZgoColorItem(item)
        }


    }


}
