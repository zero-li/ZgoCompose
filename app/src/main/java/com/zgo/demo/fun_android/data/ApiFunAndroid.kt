package com.zgo.demo.fun_android.data

import com.zgo.demo.fun_android.data.bean.Article
import com.zgo.demo.fun_android.data.bean.FunResult
import com.zgo.demo.fun_android.data.bean.FunWrapper
import com.zgo.lib.data.http.KNetwork
import com.zgo.lib.data.http.KResults
import com.zgo.lib.data.http.ServiceCreator
import io.ktor.client.call.body
import io.ktor.client.request.get


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
object ApiFunAndroid : KNetwork() {
    private const val url = "https://www.wanandroid.com"
    private var service: FunAndroidService = ServiceCreator.init(url).create()

    private val kClient = KtorClient.instance

    suspend fun fetchTopArticlesR(page: Int, pageSize: Int): KResults<FunWrapper<Article>> {
        return processApi {
            service.homeArticleList(page, pageSize)
        }
    }


    suspend fun fetchTopArticles(page: Int, pageSize: Int): KResults<FunWrapper<Article>> {
        return processApi {
            kClient.get("$url/article/list/${page}/json")
                .body<FunResult<FunWrapper<Article>>>()
        }
    }


}