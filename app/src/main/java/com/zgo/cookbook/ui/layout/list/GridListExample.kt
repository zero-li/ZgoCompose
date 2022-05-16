@file:OptIn(ExperimentalFoundationApi::class)

package com.zgo.cookbook.ui.layout.list

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zgo.lib.ui.base.ZgoColorItem
import com.zgo.lib.ui.theme.color.ChColor
import com.zgo.lib.ui.theme.color.ChKindColor


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/16
 */
@Composable
fun GridListExample() {

    LazyVerticalGrid(
        cells = GridCells.Adaptive(minSize = 100.dp),
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Center,
    ) {


        val colors = ChKindColor.list.sortedBy { it.id }
        items(colors.size) { index ->
            ZgoColorItem(colors[index])
        }

        val items = ChColor.list.sortedBy { it.pinyin }
        items(items.size) { index ->
            ZgoColorItem(items[index])
        }


    }

}
