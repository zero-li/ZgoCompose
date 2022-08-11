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
data class Category(
    @SerializedName("children")
    var children: List<Category> = listOf(),
    @SerializedName("courseId")
    var courseId: Int = 0, // 13
    @SerializedName("id")
    var id: Int = 0, // 该id在获取该分类下项目时需要用到
    @SerializedName("name")
    var name: String = "", // 完整项目
    @SerializedName("order")
    var order: Int = 0, // 145000
    @SerializedName("parentChapterId")
    var parentChapterId: Int = 0, // 293
    @SerializedName("visible")
    var visible: Int = 0 // 0
)