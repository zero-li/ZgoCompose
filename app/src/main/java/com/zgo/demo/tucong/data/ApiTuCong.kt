package com.zgo.demo.tucong.data

import com.zgo.demo.tucong.data.bean.TcFeed
import com.zgo.demo.tucong.data.bean.TcResult
import com.zgo.demo.tucong.data.bean.TcWrapper
import com.zgo.lib.data.http.KNetwork
import com.zgo.lib.data.http.KResults
import com.zgo.lib.data.http.ServiceCreator


/*
 * 图虫API
 * https://github.com/huanghui0906/API/blob/master/Tuchong.md
 *
 * @author: zhhli
 * @date: 22/4/24
 */
object ApiTuCong : KNetwork() {
    private const val url = "https://api.tuchong.com"
    private var service: TuCongService = ServiceCreator.init(url).create()

    suspend fun fetchImages(page: Int, pageSize: Int): KResults<TcWrapper<TcFeed>> {
        return processApi {
            val result = service.feedImages()

            val wrapper = TcWrapper(
                page,
                result.data!!,
                Int.MAX_VALUE,
                pageSize,
                Int.MAX_VALUE,
                !result.more
            )




            TcResult(
                result.counts,
                result.isHistory,
                result.message,
                result.more,
                result.result,
                wrapper
            )


        }
    }


}