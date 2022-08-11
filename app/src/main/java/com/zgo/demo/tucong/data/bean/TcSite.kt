package com.zgo.demo.tucong.data.bean


import com.google.gson.annotations.SerializedName

data class TcSite(
    @SerializedName("description")
    var description: String = "", // 资深风光摄影师
    @SerializedName("domain")
    var domain: String = "",
    @SerializedName("followers")
    var followers: Int = 0, // 27831
    @SerializedName("has_everphoto_note")
    var hasEverphotoNote: Boolean = false, // true
    @SerializedName("icon")
    var icon: String = "", // https://p1-tuchong.byteimg.com/obj/tuchong-avatar/ll_2670585_2
    @SerializedName("is_bind_everphoto")
    var isBindEverphoto: Boolean = false, // true
    @SerializedName("is_following")
    var isFollowing: Boolean = false, // false
    @SerializedName("name")
    var name: String = "", // 薛巍
    @SerializedName("site_id")
    var siteId: String = "", // 2670585
    @SerializedName("type")
    var type: String = "", // user
    @SerializedName("url")
    var url: String = "", // https://tuchong.com/2670585/
    @SerializedName("verification_list")
    var verificationList: List<TcVerification> = listOf(),
    @SerializedName("verifications")
    var verifications: Int = 0, // 1
    @SerializedName("verified")
    var verified: Boolean = false, // true
    @SerializedName("videos")
    var videos: Int = 0 // 3
)