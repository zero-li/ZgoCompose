package com.zgo.demo.data.fun_android.bean

import androidx.annotation.Keep
import com.zgo.demo.data.fun_android.bean.Article
import com.google.gson.annotations.SerializedName


/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
data class NaviWeb(
    @SerializedName("articles")
    var articles: List<Article> = listOf(),
    @SerializedName("cid")
    var cid: Int = 0, // 528
    @SerializedName("name")
    var name: String = "" // 优秀的博客
)