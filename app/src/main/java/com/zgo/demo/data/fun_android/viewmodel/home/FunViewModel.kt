package com.zgo.demo.data.fun_android.viewmodel.home

import com.zgo.demo.data.fun_android.viewmodel.home.paging.HomeArticleSource
import com.zgo.lib.ui.base.BaseViewModel


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/25
 */
class FunViewModel : BaseViewModel(){

    var pagingHomeArticle = pager {
        HomeArticleSource()
    }


}