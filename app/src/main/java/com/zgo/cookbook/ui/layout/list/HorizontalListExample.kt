package com.zgo.cookbook.ui.layout.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun HorizontalListExample() {

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top,
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
