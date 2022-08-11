package com.zgo.demo.fun_android.data.bean

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName


/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */


@Keep
data class UserInfo(
    @SerializedName("admin")
    var admin: Boolean = false, // false
    @SerializedName("chapterTops")
    var chapterTops: List<Any> = listOf(),
    @SerializedName("coinCount")
    var coinCount: Int = 0, // 36662
    @SerializedName("collectIds")
    var collectIds: List<Long> = listOf(),
    @SerializedName("email")
    var email: String = "", // 623565791@qq.com
    @SerializedName("icon")
    var icon: String = "",
    @SerializedName("id")
    var id: Int = 0, // 2
    @SerializedName("nickname")
    var nickname: String = "", // 鸿洋
    @SerializedName("password")
    var password: String = "",
    @SerializedName("publicName")
    var publicName: String = "", // 鸿洋
    @SerializedName("token")
    var token: String = "",
    @SerializedName("type")
    var type: Int = 0, // 0
    @SerializedName("username")
    var username: String = "" // xiaoyang
)

@Keep
data class MyUserInfo(
    @SerializedName("coinInfo")
    var coinInfo: CoinInfo = CoinInfo(),
    @SerializedName("userInfo")
    var userInfo: UserInfo = UserInfo()
)
