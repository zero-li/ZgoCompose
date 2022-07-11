package com.zgo.demo.data.tucong

import com.zgo.demo.data.tucong.bean.TcFeed
import com.zgo.lib.data.http.KResults
import com.zgo.lib.data.http.paging.BasePagingSource
import com.zgo.lib.data.http.paging.IPageWrapper
import com.zgo.lib.ui.base.BaseViewModel


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/20
 */
class TuCongViewModel : BaseViewModel() {

    val list = pager {
        TcPagingSource()
    }

}

class TcPagingSource : BasePagingSource<TcFeed>() {
    override suspend fun httpLoadData(page: Int, perPage: Int): KResults<IPageWrapper<TcFeed>?> {
        return ApiTuCong.fetchImages(page, pageSize = perPage)
    }

}