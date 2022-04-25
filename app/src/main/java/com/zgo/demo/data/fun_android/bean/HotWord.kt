package com.zgo.demo.data.fun_android.bean

import androidx.annotation.Keep

/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
data class HotWord(
    val id: Int,
    val link: String,
    val order: Int,
    val name: String,
    val visible: Int
)