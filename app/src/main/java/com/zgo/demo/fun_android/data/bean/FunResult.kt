package com.zgo.demo.fun_android.data.bean

import com.google.gson.annotations.SerializedName
import com.zgo.lib.data.http.IBaseResult
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
// {
//    "data": ...,
//    "errorCode": 0,
//    "errorMsg": ""
// }
// errorCode = 0 代表执行成功
@Serializable
class FunResult<T>(
    @SerializedName("errorCode")
    @SerialName("errorCode")
    override var code: Int = -1, // 0
    @SerializedName("errorMsg")
    @SerialName("errorMsg")
    override var msg: String = "", // 操作成功
    @SerializedName("data")
    @SerialName("data")
    override var data: T?
) : IBaseResult<T> {
    override val isSuccess: Boolean
        get() = code == 0

}