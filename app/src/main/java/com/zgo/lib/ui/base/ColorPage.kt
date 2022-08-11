@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.lib.ui.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zgo.demo.R
import com.zgo.lib.ui.components.ZgoScaffold
import com.zgo.lib.ui.theme.color.ChColor
import com.zgo.lib.ui.theme.color.ChKindColor
import com.zgo.lib.ui.theme.color.NipponColor
import com.zgo.lib.ui.theme.color.ZgoColor


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

        LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {


            val items = zgoColorRandomList


            items(items.size) { index ->
                val item = items[index]
                ZgoColorItem(item = item)
            }


        }

    }

}

val zgoColorRandomList: List<ZgoColor>
    get() {
        val items = mutableListOf<ZgoColor>()

        items.addAll(ChColor.list.shuffled())
        items.addAll(ChKindColor.list.shuffled())
        items.addAll(NipponColor.list.shuffled())

        return items
    }


@Composable
fun ZgoColorItem(
    item: ZgoColor,
) {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 5.dp, vertical = 5.dp)
            .height(100.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(item.color),
        contentAlignment = Alignment.Center

    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_color_item),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )

        ZgoColorCircleBox(item)

    }
}


@Composable
fun ZgoColorCircleBox(item: ZgoColor, size: Dp = 80.dp) {

    Box(
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .background(item.color),
        contentAlignment = Alignment.Center

    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(
                text = item.name,
                color = Color.White,
                fontSize = 16.sp,

                )

            Text(
                text = item.hex,
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier,

                )


        }

    }
}


@Preview
@Composable
fun PreviewC() {
    ColorPage()
}


