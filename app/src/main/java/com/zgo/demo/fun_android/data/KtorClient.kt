package com.zgo.demo.fun_android.data

import android.util.Log
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

object KtorClient {

    val instance: HttpClient by lazy {
        HttpClient(OkHttp) { // 使用 OkHttp 引擎

            // Content Negotiation (用于处理 JSON 等)
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true // 序列化时忽略数据类中没有的 JSON 字段
                })
            }

            // Logging (可选，用于调试)
            install(Logging) {
                logger = object : Logger {
                    override fun log(message: String) {
                         Log.v("KtorLogger", message) // 使用 Android Log
//                        println("KtorLogger: $message") // 或者直接打印
                    }
                }
                level = LogLevel.ALL // 可以选择 NONE, HEADERS, BODY, ALL
            }

            // Default request configuration (可选)
            // install(DefaultRequest) {
            //     header(HttpHeaders.ContentType, ContentType.Application.Json)
            // }

            // Engine specific configuration (OkHttp)
            engine {
                // config {
                //     // 配置 OkHttp 客户端，例如添加拦截器
                //     addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
                //     connectTimeout(30, TimeUnit.SECONDS)
                //     readTimeout(30, TimeUnit.SECONDS)
                // }
            }
        }
    }
}