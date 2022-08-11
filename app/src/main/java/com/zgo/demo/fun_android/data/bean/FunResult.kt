package com.zgo.demo.fun_android.data.bean

import com.google.gson.annotations.SerializedName
import com.zgo.lib.data.http.IBaseResult


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
class FunResult<T>(
    @SerializedName("errorCode")
    override var code: Int = -1, // 0
    @SerializedName("errorMsg")
    override var msg: String = "", // 操作成功
    @SerializedName("data")
    override var data: T?
) : IBaseResult<T> {
    override val isSuccess: Boolean
        get() = code == 0

}