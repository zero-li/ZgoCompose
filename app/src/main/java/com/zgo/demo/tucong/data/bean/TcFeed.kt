package com.zgo.demo.tucong.data.bean


import com.google.gson.annotations.SerializedName

data class TcFeed(
    @SerializedName("author_id")
    var authorId: String = "", // 2670585
    @SerializedName("collected")
    var collected: Boolean = false, // false
    @SerializedName("comment_list_prefix")
    var commentListPrefix: List<Any> = listOf(),
    @SerializedName("comments")
    var comments: Int = 0, // 1485
    @SerializedName("content")
    var content: String = "", // 卧梅又闻花🙄🙄。春暖花开，气温回升，园林里的梅花也逐渐开始绽放，怡园的大橘似乎对春天特别向往，扒拉一枝梅花感受春天的气息😂😂 📷尼康z5 镜头 z85 1.8s 
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("data_type")
    var dataType: String = "", // post
    @SerializedName("delete")
    var delete: Boolean = false, // false
    @SerializedName("event_tags")
    var eventTags: List<String> = listOf(),
    @SerializedName("excerpt")
    var excerpt: String = "", // 卧梅又闻花🙄🙄。春暖花开，气温回升，园林里的梅花也逐渐开始绽放，怡园的大橘似乎对春天特别向往，扒拉一枝梅花感受春天的气息😂😂 📷尼康z5 镜头 z85 1.8s 
    @SerializedName("favorite_list_prefix")
    var favoriteListPrefix: List<Any> = listOf(),
    @SerializedName("favorites")
    var favorites: Int = 0, // 4896
    @SerializedName("image_count")
    var imageCount: Int = 0, // 10
    @SerializedName("images")
    var images: List<TcImage> = listOf(),
    @SerializedName("is_favorite")
    var isFavorite: Boolean = false, // false
    @SerializedName("parent_comments")
    var parentComments: String = "", // 1473
    @SerializedName("passed_time")
    var passedTime: String = "", // 02月21日
    @SerializedName("post_id")
    var postId: Int = 0, // 109073225
    @SerializedName("published_at")
    var publishedAt: String = "", // 2022-02-21 08:39:30
    @SerializedName("recom_type")
    var recomType: String = "", // 热门
    @SerializedName("recommend")
    var recommend: Boolean = false, // true
    @SerializedName("reward_list_prefix")
    var rewardListPrefix: List<Any> = listOf(),
    @SerializedName("rewardable")
    var rewardable: Boolean = false, // true
    @SerializedName("rewards")
    var rewards: String = "", // 46
    @SerializedName("rqt_id")
    var rqtId: String = "", // 67444be782f78bdde4691c6dd3156934
    @SerializedName("shares")
    var shares: Int = 0, // 1006
    @SerializedName("site")
    var site: TcSite = TcSite(),
    @SerializedName("site_id")
    var siteId: String = "", // 2670585
    @SerializedName("sites")
    var sites: List<Any> = listOf(),
    @SerializedName("tags")
    var tags: List<String> = listOf(),
    @SerializedName("title")
    var title: String = "",
    @SerializedName("title_image")
    var titleImage: Any = Any(), // null
    @SerializedName("type")
    var type: String = "", // multi-photo
    @SerializedName("update")
    var update: Boolean = false, // false
    @SerializedName("url")
    var url: String = "", // https://tuchong.com/2670585/109073225/
    @SerializedName("views")
    var views: Int = 0 // 193561
)