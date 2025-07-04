package com.zgo.demo.fun_android.data.bean

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.zgo.lib.data.http.paging.IPageWrapper
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
@Serializable
data class FunWrapper<T>(
    @SerializedName("curPage")
    @SerialName("curPage")
    override val curPage: Int,
    @SerializedName("datas")
    @SerialName("datas")
    override val list: List<T> = listOf(),
    @SerializedName("pageCount")
    @SerialName("pageCount")
    override val pageCount: Int,
    @SerializedName("size")
    @SerialName("size")
    override val pageSize: Int,
    @SerializedName("total")
    @SerialName("total")
    override val total: Int,

    @SerializedName("offset")
    @SerialName("offset")
    var offset: Int = 0, // 0

    @SerializedName("over")
    @SerialName("over")
    var over: Boolean = false, // false
) : IPageWrapper<T> {
    override val isEnd: Boolean
        get() = curPage - 1 == pageCount

}