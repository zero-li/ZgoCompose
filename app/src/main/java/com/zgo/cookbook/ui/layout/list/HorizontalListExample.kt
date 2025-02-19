package com.zgo.cookbook.ui.layout.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.zgo.lib.ui.base.ZgoColorItem
import com.zgo.lib.ui.base.zgoColorRandomList


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/16
 */
@Composable
fun HorizontalListExample() {

    Column {
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top,
        ) {


            items(zgoColorRandomList) { item ->
                ZgoColorItem(item)
            }

            items(zgoColorRandomList.size) { index ->
                ZgoColorItem(zgoColorRandomList[index])
            }


        }

        // Display 10 items
        val pagerState = rememberPagerState(pageCount = {
            zgoColorRandomList.size
        })
        HorizontalPager(state = pagerState) { page ->
            // Our page content
            ZgoColorItem(zgoColorRandomList[page])
        }
    }

}
