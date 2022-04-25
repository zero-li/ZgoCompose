package com.zgo.demo.data.fun_android.bean

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName


/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
data class CoinInfo(
    @SerializedName("coinCount")
    var coinCount: Int = 0, // 20
    @SerializedName("level")
    val level: Int = 0,
    @SerializedName("rank")
    var rank: Int = 0, // 1
    @SerializedName("userId")
    var userId: Int = 0, // 2
    @SerializedName("username")
    var username: String = "" // x**oyang
)

@Keep
data class User2Articles(
    @SerializedName("coinInfo")
    val coinInfo: CoinInfo = CoinInfo(),
    @SerializedName("shareArticles")
    val shareArticles: FunWrapper<Article>
)


