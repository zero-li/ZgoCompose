package com.zgo.demo.data.tucong

import com.zgo.demo.data.tucong.bean.TcFeed
import com.zgo.demo.data.tucong.bean.TcResult
import retrofit2.http.GET


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */



interface TuCongService {


    // ******************************************************
    // 1.首页相关
    //1.1 首页文章列表
    @GET("/feed-app")
    suspend fun feedImages(): TcResult<List<TcFeed>>


}