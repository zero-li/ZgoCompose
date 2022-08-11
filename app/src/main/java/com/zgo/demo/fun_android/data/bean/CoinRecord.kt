package com.zgo.demo.fun_android.data.bean

import androidx.annotation.Keep

/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
data class CoinRecord(
    val coinCount: Int,
    val date: Long,
    val desc: String,
    val id: Int,
    val reason: String,
    val type: Int,
    val userId: Int,
    val userName: String
)