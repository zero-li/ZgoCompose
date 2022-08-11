package com.zgo.lib.data

import androidx.compose.runtime.Composable


/*
 * 
 * 页面实体类
 * https://github.com/androidx/androidx/blob/androidx-main/compose/material3/material3/integration-tests/material3-catalog/src/main/java/androidx/compose/material3/catalog/library/model/Examples.kt
 * @author: zhhli
 * @date: 22/4/29
 */
open class ZgoPage(
    open val title: String,
    open val content: @Composable () -> Unit
)