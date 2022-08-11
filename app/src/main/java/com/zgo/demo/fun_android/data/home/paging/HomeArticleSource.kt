package com.zgo.demo.fun_android.data.home.paging

import com.zgo.demo.fun_android.data.ApiFunAndroid
import com.zgo.demo.fun_android.data.bean.Article
import com.zgo.lib.data.http.KResults
import com.zgo.lib.data.http.paging.BasePagingSource
import com.zgo.lib.data.http.paging.IPageWrapper


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/25
 */
class HomeArticleSource : BasePagingSource<Article>() {
    override suspend fun httpLoadData(page: Int, perPage: Int): KResults<IPageWrapper<Article>> {
        return ApiFunAndroid.fetchTopArticles(page, perPage)
    }
}