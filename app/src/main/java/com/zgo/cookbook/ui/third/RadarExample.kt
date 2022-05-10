package com.zgo.cookbook.ui.third

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/*
 * 雷达图
 * 
 * @author: zhhli
 * @date: 22/5/7
 */
@Composable
fun RadarExample() {
    val list = listOf(
        RadarBean("基本财务", 43f),
        RadarBean("基本财务财务", 90f),
        RadarBean("基", 90f),
        RadarBean("基本财务财务", 90f),
        RadarBean("基本财务", 83f),
        RadarBean("技术择时择时", 50f),
        RadarBean("景气行业行业", 83f)
    )

    Row(modifier = Modifier
        .padding(top = 16.dp)
        .horizontalScroll(rememberScrollState())) {
        ComposeRadar(
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(180.dp),
            list.take(3)
        )
        ComposeRadar(
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(180.dp),
            list.take(4)
        )
        ComposeRadar(
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(180.dp),
            list.take(5),
            specialHandle = true
        )
        ComposeRadar(
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(180.dp),
            list.take(6)
        )
        ComposeRadar(
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(180.dp),
            list
        )
    }

}