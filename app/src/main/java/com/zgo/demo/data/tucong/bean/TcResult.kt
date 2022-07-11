package com.zgo.demo.data.tucong.bean


import com.google.gson.annotations.SerializedName
import com.zgo.lib.data.http.IBaseResult
import com.zgo.lib.data.http.paging.IPageWrapper

data class TcResult<T>(
    @SerializedName("counts")
    var counts: Int = 0, // 10
//    @SerializedName("feedList")
//    var feedList: List<TcFeed> = listOf(),
    @SerializedName("is_history")
    var isHistory: Boolean = false, // false
    @SerializedName("message")
    var message: String = "", // 添加成功
    @SerializedName("more")
    var more: Boolean = false, // true
    @SerializedName("result")
    var result: String = "", // SUCCESS,
    @SerializedName("feedList")
    override var data: T?

) : IBaseResult<T> {
    override val code: Int
        get() = 1
    override val msg: String
        get() = message

    override val isSuccess: Boolean
        get() = "SUCCESS" == result
}


class TcWrapper<T>(
    override val curPage: Int,
    override val list: List<T>,
    override val pageCount: Int,
    override val pageSize: Int,
    override val total: Int,
    override val isEnd: Boolean
) : IPageWrapper<T>