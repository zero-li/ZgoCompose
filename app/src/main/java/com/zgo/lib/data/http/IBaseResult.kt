package com.zgo.lib.data.http


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/2/16
 */
interface IBaseResult<T> {
    val code: Int
    val msg: String
    val data: T?
    val isSuccess: Boolean
}

