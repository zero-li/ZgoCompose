@file:OptIn(ExperimentalFoundationApi::class)

package com.zgo.cookbook.ui.layout.list

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zgo.lib.ui.base.ZgoColorItem
import com.zgo.lib.ui.base.zgoColorRandomList


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


        items(zgoColorRandomList) { item ->
            ZgoColorItem(item)
        }


    }

}
