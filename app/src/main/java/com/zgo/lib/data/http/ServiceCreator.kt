package com.zgo.lib.data.http

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * desc:
 * author: zhhli
 * 2020/5/30
 */
object ServiceCreator {
    private const val DEBUG = true
    private var BASE_URL = "https://api.github.com/"

    private fun getOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(5, TimeUnit.SECONDS)

        if (DEBUG) {
            builder.addInterceptor(HttpLogInterceptor())
        }

        return builder.build()
    }

    val gson = GsonBuilder()
        .registerTypeHierarchyAdapter(List::class.java, ArraySecurityAdapter())
        .create()

    private lateinit var retrofit: Retrofit

    fun init(baseUrl :String): ServiceCreator{
        BASE_URL = baseUrl

        retrofit = Retrofit.Builder()
            .client(getOkHttpClient())
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        return  this
    }

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)
}