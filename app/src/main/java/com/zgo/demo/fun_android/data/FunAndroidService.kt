package com.zgo.demo.fun_android.data

import com.zgo.demo.fun_android.data.bean.*
import retrofit2.http.*


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/4/24
 */



interface FunAndroidService {


    // ******************************************************
    // 1.首页相关
    //1.1 首页文章列表
    @GET("/article/list/{page}/json")
    suspend fun homeArticleList(
        @Path("page") page: Int,
        @Query("page_size") pageSize: Int
    ): FunResult<FunWrapper<Article>>

    // 1.2 首页banner
    @GET("banner/json")
    suspend fun homeBannerList(): FunResult<List<Banner>>


    //1.3 常用网站
    @GET("friend/json")
    suspend fun homeFriendWebsiteList(): FunResult<List<FriendWebsite>>

    // 1.4 搜索热词
    //即目前搜索最多的关键词。
    @GET("hotkey/json")
    suspend fun homeHotWordList(): FunResult<List<HotWord>>

    // 1.5 置顶文章
    //https://www.wanandroid.com/article/top/json
    @GET("/article/top/json")
    suspend fun homeHopArticleList(): FunResult<List<Article>>

    // ******************************************************
    // 2. 体系
    //2.1 体系数据
    // https://www.wanandroid.com/tree/json
    @GET("tree/json")
    suspend fun categoryTree(): FunResult<List<Category>>


    // 2.2 知识体系下的文章
    //https://www.wanandroid.com/article/list/0/json?cid=60
    @GET("article/list/{page}/json")
    suspend fun articleListByCid(
        @Path("page") page: Int,
        @Query("cid") cid: Int
    ): FunResult<FunWrapper<Article>>


    @GET("article/list/{page}/json")
    suspend fun articleListByAuthor(
        @Path("page") page: Int,
        @Query("author") author: String
    ): FunResult<FunWrapper<Article>>


    // ******************************************************
    // 3. 导航
    //3.1 导航数据
    //https://www.wanandroid.com/navi/json
    @GET("navi/json")
    suspend fun naviWebList(): FunResult<List<NaviWeb>>


    // ******************************************************
    //4. 项目
    //4.1 项目分类
    //https://www.wanandroid.com/project/tree/json
    @GET("project/tree/json")
    suspend fun projectTree(): FunResult<List<Category>>


    // 4.2 项目列表数据
    //某一个分类下项目列表数据，分页展示
    //https://www.wanandroid.com/project/list/1/json?cid=294
    @GET("project/list/{page}/json")
    suspend fun projectListByCid(
        @Path("page") page: Int,
        @Query("cid") cid: Int
    ): FunResult<FunWrapper<Article>>

    // ******************************************************
    //5. 登录与注册
    //5.1 登录
    //https://www.wanandroid.com/user/login
    @FormUrlEncoded
    @POST("user/login")
    suspend fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): FunResult<UserInfo>

    // 5.2 注册
    //https://www.wanandroid.com/user/register
    @FormUrlEncoded
    @POST("user/register")
    suspend fun register(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("repassword") repassword: String
    ): FunResult<UserInfo>

    //5.3 退出
    //https://www.wanandroid.com/user/logout/json
    @GET("user/logout/json")
    suspend fun logout(): FunResult<List<Category>>


    // ******************************************************
    //6 收藏
    // 6.1 收藏文章列表
    //https://www.wanandroid.com/lg/collect/list/0/json
    @GET("lg/collect/list/{page}/json")
    suspend fun collectList(@Path("page") page: Int): FunResult<FunWrapper<Article>>

    // 6.2 收藏站内文章
    //https://www.wanandroid.com/lg/collect/1165/json
    @POST("lg/collect/{id}/json")
    suspend fun collectById(@Path("id") id: Long): FunResult<Article>

    // 6.3 收藏站外文章
    //https://www.wanandroid.com/lg/collect/add/json
    @POST("lg/collect/add/json")
    suspend fun collectAddByLink(
        @Field("title") title: String,
        @Field("author") author: String,
        @Field("link") link: String,
    ): FunResult<Article>

    // [新增] 编辑收藏的文章，支持站内，站外
    // https://wanandroid.com/lg/collect/user_article/update/ 文章 id/json
    //方法：POST请求
    //参数
    //	文章 id:拼接在 url 上
    //	title: 文章标题
    //	link: 文章 url
    //	author: 作者
    @FormUrlEncoded
    @POST("lg/collect/user_article/update/{id}")
    suspend fun collectUpdate(
        @Path("id") aId: Long,
        @Field("title") title: String,
        @Field("author") author: String,
        @Field("link") link: String,
    ): FunResult<Article>

    // 6.5 收藏网站列表
    //https://www.wanandroid.com/lg/collect/usertools/json

    // 6.6 收藏网址
    //https://www.wanandroid.com/lg/collect/addtool/json
    //
    //方法：POST
    //参数：
    //	name,link


    //6.7 编辑收藏网站
    //https://www.wanandroid.com/lg/collect/updatetool/json
    //
    //方法：POST
    //参数：
    //	id,name,link


    //6.8 删除收藏网站
    //https://www.wanandroid.com/lg/collect/deletetool/json
    //
    //方法：POST
    //参数：
    //	id

    // 7. 搜索
    //7.1 搜索
    //https://www.wanandroid.com/article/query/0/json
    //
    //方法：POST
    //参数：
    //	页码：拼接在链接上，从0开始。
    //	k ： 搜索关键词
    @FormUrlEncoded
    @POST("article/query/{page}/json")
    suspend fun search(
        @Field("k") key: String,
        @Path("page") page: Int
    ): FunResult<FunWrapper<Article>>


    // 9.积分 API 2019-08-25
    // 积分排行榜接口
    //https://www.wanandroid.com/coin/rank/1/json

    @GET("coin/rank/{page}/json")
    suspend fun coinRank(@Path("page") page: Int): FunResult<FunWrapper<CoinInfo>>

    //获取个人积分，需要登录后访问
    //https://www.wanandroid.com/lg/coin/userinfo/json
    @GET("lg/coin/userinfo/json")
    suspend fun coinUser(): FunResult<CoinInfo>

    // 获取个人积分获取列表，需要登录后访问
    //https://www.wanandroid.com//lg/coin/list/1/json

    @GET("lg/coin/list/{page}/json")
    suspend fun coinRecord(@Path("page") page: Int): FunResult<FunWrapper<CoinRecord>>


    // 10. 广场 2019-10-02
    //10.1 广场列表数据
    // https://wanandroid.com/user_article/list/0/json
    @GET("/user_article/list/{page}/json")
    suspend fun userArticleList(@Path("page") page: Int): FunResult<FunWrapper<Article>>


    // 10.2 分享人对应列表数据
    //这个展示的文章数据都是审核通过的，一般是点击分享人然后展示的列表。
    //就像：https://www.wanandroid.com/user/2/share_articles/1/json
    @GET("user/2/share_articles/{id}/json")
    suspend fun user2ShareArticle(@Path("id") uid: Int): FunResult<User2Articles>

    // 10.3 自己的分享的文章列表
    //https://wanandroid.com/user/lg/private_articles/1/json
    @GET("user/lg/private_articles/{page}/json")
    suspend fun myArticleList(@Path("page") page: Int): FunResult<Shared>

    // 10.4 删除自己分享的文章
    //https://wanandroid.com/lg/user_article/delete/9475/json
    @POST("lg/user_article/delete/{id}/json")
    suspend fun myArticleDelete(@Path("id") id: Long): FunResult<Any>

    // 10.5 分享文章
    //https://www.wanandroid.com/lg/user_article/add/json
    @POST("lg/user_article/add/json")
    suspend fun myArticleAdd(
        @Field("title") title: String,
        @Field("link") link: String,
    ): FunResult<Article>


    // 12. 个人信息接口
    //https://wanandroid.com/user/lg/userinfo/json
    @GET("user/lg/userinfo/json")
    suspend fun myUserinfo(): FunResult<MyUserInfo>


    // 15 公众号Tab | 2018-10-13
    //增加微信公众号 Tab，查看公众号文章，支持搜索，。
    //
    //15.1 获取公众号列表
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    suspend fun wechatCategories(): FunResult<List<Category>>

    // 15.2 查看某个公众号历史数据
    //https://wanandroid.com/wxarticle/list/408/1/json
    //方法：GET
    //参数：
    //	公众号 ID：拼接在 url 中，eg:405
    //	公众号页码：拼接在url 中，eg:1
    @GET("wxarticle/list/{id}/{page}/json")
    suspend fun wechatArticleList(
        @Path("page") page: Int,
        @Path("id") id: Int
    ): FunResult<FunWrapper<Article>>

    // 15.3 在某个公众号中搜索历史文章
    //https://wanandroid.com/wxarticle/list/405/1/json?k=Java
    @GET("wxarticle/list/{id}/{page}/json")
    suspend fun wechatArticleListBySearch(
        @Path("page") page: Int,
        @Path("id") id: Int,
        @Field("k") key: String,
    ): FunResult<FunWrapper<Article>>

    // 16. 最新项目 Tab
    // 16.1 最新项目tab (首页的第二个tab)
    // 按时间分页展示所有项目。
    @GET("/article/listproject/{page}/json")
    suspend fun listProjectOrderTime(@Path("page") page: Int): FunResult<FunWrapper<Article>>


}