package com.zgo.lib.data.http

import android.util.Log
import okhttp3.Interceptor
import okhttp3.MediaType
import okhttp3.Request
import okhttp3.Response
import okio.Buffer
import java.io.IOException
import java.nio.charset.Charset
import java.nio.charset.UnsupportedCharsetException

/**
 * desc:
 * author: zhhli
 * 2020/1/13
 */
class HttpLogInterceptor : Interceptor {
    private val UTF8 = Charset.forName("UTF-8")

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val reqDetail = getRequestDetail(request)
        val response: Response = chain.proceed(request)
        val responseDetail = getResponseDetail(response)
        val head = """
            HttpLogInterceptor 
            发送请求url：${request.url}
            发送请求 method：${request.method}
            发送请求 body：$reqDetail
            收到响应 code: ${response.code}
            响应结果: """.trimIndent() + "\n"
        //Timber.tag(TAG).d(head)

        val detail = head + responseDetail.trimIndent()

        detail.chunked(1024).forEach {
            Log.d(TAG, it)
        }

        return response
    }

    private fun getRequestDetail(request: Request): String {
        val requestBody = request.newBuilder().build().body ?: return ""
        var bodyDetail = ""
        if (isParseable(requestBody.contentType())) {
            val buffer = Buffer()
            try {
                requestBody.writeTo(buffer)
            } catch (e: IOException) {
                e.printStackTrace()
            }
            var charset = UTF8
            val contentType = requestBody.contentType()
            if (contentType != null) {
                charset = contentType.charset(UTF8)
            }
            bodyDetail = buffer.readString(charset!!)
        }
        return bodyDetail
    }

    @Throws(IOException::class)
    private fun getResponseDetail(response: Response): String {
        val responseBody = response.body ?: return ""
        var bodyDetail = ""
        if (isParseable(responseBody.contentType())) {
            val source = responseBody.source()
            source.request(Long.MAX_VALUE)
            val buffer = source.buffer
            var charset = UTF8
            val contentType = responseBody.contentType()
            if (contentType != null) {
                try {
                    charset = contentType.charset(UTF8)
                } catch (e: UnsupportedCharsetException) {
                    e.printStackTrace()
                }
            }
            bodyDetail = buffer.clone().readString(charset!!)
            bodyDetail = decode(bodyDetail)
        }
        return bodyDetail
    }

    companion object {
        private const val TAG = "HttpLog"
        fun decode(`in`: String): String {
            var working = `in`
            var index: Int
            index = working.indexOf("\\u")
            while (index > -1) {
                val length = working.length
                if (index > length - 6) break
                val numStart = index + 2
                val numFinish = numStart + 4
                val substring = working.substring(numStart, numFinish)
                val stringStart = working.substring(0, index)
                val stringEnd = working.substring(numFinish)
                try {
                    // 十六进制
                    val number = substring.toInt(16)
                    working = stringStart + number.toChar() + stringEnd
                    index = working.indexOf("\\u")
                } catch (e: Exception) {
                    index = working.indexOf("\\u", numFinish)
                }
            }
            return working.replace("\\", "")
        }

        /**
         * 是否可以解析
         *
         * @param mediaType [MediaType]
         * @return `true` 为可以解析
         */
        private fun isParseable(mediaType: MediaType?): Boolean {
            if (mediaType == null) {
                return false
            }
            val type = mediaType.toString().lowercase()

            return type.contains("text")
                    || type.contains("html")
                    || type.contains("plain")
                    || type.contains("json")
                    || type.contains("xml")
                    || type.contains("x-www-form-urlencoded")
        }


    }
}