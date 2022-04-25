package com.zgo.demo.data.fun_android.bean

import androidx.annotation.Keep

/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */

@Keep
data class Banner(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)