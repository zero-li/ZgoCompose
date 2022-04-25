package com.zgo.lib.data.http

import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type
import java.util.*


/*
 * 
 * gson 解析适配器
 *
 * @author: zhhli
 * @date: 21/12/22
 */


/**
 * 处理 list解析错误
 * 类型错误时，返回 EMPTY_LIST
 */
class ArraySecurityAdapter : JsonDeserializer<List<*>> {
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): List<*> {

        return if (json.isJsonArray) {
            val newGson = Gson()
            newGson.fromJson(json, typeOfT)
        } else {
            // 类型错误时，返回 EMPTY_LIST
            Collections.EMPTY_LIST
        }
    }
}