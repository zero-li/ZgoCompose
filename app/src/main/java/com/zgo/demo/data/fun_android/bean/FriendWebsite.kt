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
data class FriendWebsite(
    @SerializedName("category")
    var category: String = "", // 源码
    @SerializedName("icon")
    var icon: String = "",
    @SerializedName("id")
    var id: Int = 0, // 22
    @SerializedName("link")
    var link: String = "", // https://www.androidos.net.cn/sourcecode
    @SerializedName("name")
    var name: String = "", // androidos
    @SerializedName("order")
    var order: Int = 0, // 11
    @SerializedName("visible")
    var visible: Int = 0 // 1
)

