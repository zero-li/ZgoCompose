package com.zgo.lib.data.http.paging

import com.google.gson.annotations.SerializedName

/*
 * 
 * 
 * @author: zhhli
 * @date: 22/2/16
 */

interface IPageWrapper<T> {
    val curPage: Int // 当前页
    val list: List<T> // 数据
    val pageCount: Int // 最后一页
    val pageSize: Int // 每页大小
    val total: Int // 总页数,
    val isEnd: Boolean
}

private class PageWrapper<T>(
    @SerializedName("current_page")
    override val curPage: Int, // 当前页
    @SerializedName("data")
    override val list: List<T> = listOf(), // 数据
    @SerializedName("last_page")
    override val pageCount: Int, // 最后一页
    @SerializedName("per_page")
    override val pageSize: Int, // 每页大小
    @SerializedName("total")
    override val total: Int // 总页数
): IPageWrapper<T>{
    override val isEnd: Boolean
        get() = list.size <pageSize

}



