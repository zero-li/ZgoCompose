package com.zgo.cookbook.ui.layout.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
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

    val chColor = ChColor.list.sortedBy { it.pinyin }

    val chKindColor = ChKindColor.list.sortedBy { it.id }
    val nipponColor = NipponColor.list.sortedBy { it.name }

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {


        items(chKindColor.size) { index ->
            ZgoColorItem(chKindColor[index])
        }

        gridItems(chColor, 3) { item ->
            ZgoColorItem(item)
        }

        items(nipponColor.size) { index ->
            ZgoColorItem(nipponColor[index])
        }


    }


}
