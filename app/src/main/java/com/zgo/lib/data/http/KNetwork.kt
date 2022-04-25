package com.zgo.lib.data.http

import android.net.ParseException
import android.util.Log
import com.google.gson.JsonParseException
import com.google.gson.stream.MalformedJsonException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import org.json.JSONException
import retrofit2.HttpException
import java.io.IOException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.net.ssl.SSLException

/**
 * desc:
 * author: zhhli
 * 2020/5/30
 */
open class KNetwork {

    suspend fun <T> processApi(block: suspend () -> IBaseResult<T>): KResults<T> {
        return withContext(Dispatchers.IO) {
            try {
                val iBaseResult = block()

                if (iBaseResult.isSuccess) {
                    KResults.success(iBaseResult.data)
                } else {
                    KResults.failure(Exception(iBaseResult.msg), iBaseResult.code, iBaseResult.msg)
                }
            } catch (e: Exception) {
                e.printStackTrace()
                val exceptionHandle = KErrors.handleException(e)
                KResults.failure<T>(exceptionHandle, exceptionHandle.code, exceptionHandle.desc)
            }
        }
    }


    open suspend fun <T> flowApi(block: suspend () -> IBaseResult<out T>): Flow<KResults<T>> {
        return flow {
            val kResults = try {
                val iBaseResult = block()

                if (iBaseResult.isSuccess) {
                    KResults.success(iBaseResult.data)
                } else {
                    KResults.failure(Exception(iBaseResult.msg), iBaseResult.code, iBaseResult.msg)
                }

            } catch (e: Exception) {
                e.printStackTrace()
                val exceptionHandle = KErrors.handleException(e)
                KResults.failure<T>(exceptionHandle, exceptionHandle.code, exceptionHandle.desc)
            }

            emit(kResults)

        }.flowOn(Dispatchers.IO)

    }


}

sealed class KResults<out T> {

    companion object {
        fun <T> success(result: T?): KResults<T> = Success(result)
        fun <T> failure(error: Throwable, code: Int = 1, msg: String = ""): KResults<T> =
            Failure(error, code, msg)
    }

    data class Failure(val error: Throwable, val code: Int = 1, val msg: String = "") :
        KResults<Nothing>()

    data class Success<out T>(val data: T?, val msg: String = "") : KResults<T>()

    val isSuccess: Boolean
        get() = this is Success


    fun onSuccess(success: (data: T?) -> Unit) {
        if (this is Success) {
            try {
                success.invoke(data)
            } catch (e: Exception) {
                if (data == null) {
                    Log.e("https", "data=null 请使用 onSuccessEmpty")
                }

                e.printStackTrace()
            }

        }

    }

    fun onSuccessEmpty(success: () -> Unit) {
        if (this is Success) {
            success()
        }
    }

    fun onFailed(error: (code: Int, msg: String) -> Unit) {
        if (this is Failure) {
            error(code, msg)
        }
    }

}

sealed class KErrors : Throwable() {
    data class NetworkError(val error: Throwable, var code: Int = -1, var desc: String = "") :
        KErrors()

    object EmptyInputError : KErrors()
    object EmptyResultsError : KErrors()
    object SingleError : KErrors()


    companion object {
        fun handleException(e: Throwable): NetworkError {
            val error = NetworkError(e)

            if (e is HttpException) {
                val httpException: HttpException = e
                when (httpException.code()) {
                    401 -> error.desc = "操作未授权"
                    403 -> error.desc = "请求被拒绝"
                    404 -> error.desc = "资源不存在"
                    408 -> error.desc = "服务器执行超时"
                    500 -> error.desc = "服务器内部错误"
                    503 -> error.desc = "服务器不可用"
                    else -> error.desc = "网络错误"
                }
                error.code = httpException.code()
            } else if (e is JsonParseException
                || e is JSONException
                || e is ParseException || e is MalformedJsonException
            ) {
                error.desc = "解析错误"
                error.code = -1001
            } else if (e is ConnectException) {
                error.desc = "连接失败"
                error.code = -1002
            } else if (e is SSLException) {
                error.code = -1003
                error.desc = "证书验证失败"
            } else if (e is IOException) {
                error.desc = "连接超时"
                error.code = -1004
            } else if (e is SocketTimeoutException) {
                error.desc = "连接超时"
                error.code = -1004
            } else if (e is UnknownHostException) {
                error.desc = "主机地址未知"
                error.code = -1004
            } else {
                error.desc = "未知错误"
                error.code = -1000
            }

            return error

        }
    }


}

