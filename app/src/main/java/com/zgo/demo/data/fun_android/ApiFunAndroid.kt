package com.zgo.demo.data.fun_android

import com.zgo.demo.data.fun_android.bean.Article
import com.zgo.demo.data.fun_android.bean.FunWrapper
import com.zgo.lib.data.http.KNetwork
import com.zgo.lib.data.http.KResults
import com.zgo.lib.data.http.ServiceCreator


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */
object ApiFunAndroid : KNetwork(){
    private const val url = "https://www.wanandroid.com"
    private var service: FunAndroidService = ServiceCreator.init(url).create()

    suspend fun fetchTopArticles(page:Int, pageSize: Int): KResults<FunWrapper<Article>>{
        return processApi {
            service.homeArticleList(page, pageSize)
        }
    }




}