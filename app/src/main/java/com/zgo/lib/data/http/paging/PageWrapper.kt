package com.zgo.lib.data.http.paging

import com.google.gson.annotations.SerializedName

/*
 * 
 * 
 * @author: zhhli
 * @date: 22/2/16
 */
class PageWrapper<T>(
    @SerializedName("current_page")
    val currentPage: Int, // 当前页
    @SerializedName("data")
    val list: List<T>, // 数据
    @SerializedName("last_page")
    val lastPage: Int, // 最后一页
    @SerializedName("per_page")
    val perPage: Int, // 每页大小
    @SerializedName("total")
    val total: Int // 总页数
)