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
data class Tag(
    @SerializedName("name")
    var name: String = "", // 项目
    @SerializedName("url")
    var url: String = "" // /project/list/1?cid=539
)