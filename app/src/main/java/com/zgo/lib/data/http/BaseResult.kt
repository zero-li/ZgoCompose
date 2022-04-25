package com.zgo.lib.data.http

import com.google.gson.annotations.SerializedName


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/2/16
 */
class BaseResult<T>(
    @SerializedName("code")
    override var code: Int = -1, // 0
    @SerializedName("msg")
    override var msg: String = "", // 操作成功
    @SerializedName("data")
    override var data: T?
) : IBaseResult<T> {
    override val isSuccess: Boolean
        get() = code == 5001

}