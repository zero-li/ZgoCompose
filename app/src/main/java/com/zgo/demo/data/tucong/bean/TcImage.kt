package com.zgo.demo.data.tucong.bean


import com.google.gson.annotations.SerializedName

data class TcImage(
    @SerializedName("description")
    var description: String = "",
    @SerializedName("excerpt")
    var excerpt: String = "",
    @SerializedName("height")
    var height: Int = 0, // 2880
    @SerializedName("img_id")
    var imgId: Int = 0, // 943007731
    @SerializedName("img_id_str")
    var imgIdStr: String = "", // 943007731
    @SerializedName("title")
    var title: String = "", // 5803124
    @SerializedName("user_id")
    var userId: Int = 0, // 2670585
    @SerializedName("width")
    var width: Int = 0 // 2160
) {
    val url: String get() = "https://photo.tuchong.com/$userId/f/$imgIdStr.jpg"
}