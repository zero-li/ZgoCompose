package com.zgo.demo.fun_android.data.bean

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.zgo.lib.data.http.paging.IPageWrapper

/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
data class FunWrapper<T>(
    @SerializedName("curPage")
    override val curPage: Int,
    @SerializedName("datas")
    override val list: List<T> = listOf(),
    @SerializedName("pageCount")
    override val pageCount: Int,
    @SerializedName("size")
    override val pageSize: Int,
    @SerializedName("total")
    override val total: Int,

    @SerializedName("offset")
    var offset: Int = 0, // 0

    @SerializedName("over")
    var over: Boolean = false, // false
) : IPageWrapper<T> {
    override val isEnd: Boolean
        get() = curPage - 1 == pageCount

}