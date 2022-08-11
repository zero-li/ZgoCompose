package com.zgo.demo.fun_android.data.home

import com.zgo.demo.fun_android.data.home.paging.HomeArticleSource
import com.zgo.lib.ui.base.BaseViewModel


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/25
 */
class FunViewModel : BaseViewModel() {

    var pagingHomeArticle = pager {
        HomeArticleSource()
    }


}