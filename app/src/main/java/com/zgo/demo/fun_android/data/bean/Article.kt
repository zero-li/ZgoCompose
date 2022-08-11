package com.zgo.demo.fun_android.data.bean

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName


/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
data class Article(
    @SerializedName("apkLink")
    var apkLink: String = "",
    @SerializedName("audit")
    var audit: Int = 0, // 1
    @SerializedName("author")
    var author: String = "", // TxcA
    @SerializedName("canEdit")
    var canEdit: Boolean = false, // false
    @SerializedName("chapterId")
    var chapterId: Int = 0, // 539
    @SerializedName("chapterName")
    var chapterName: String = "", // 未分类
    @SerializedName("collect")
    var collect: Boolean = false, // false
    @SerializedName("courseId")
    var courseId: Int = 0, // 13
    @SerializedName("desc")
    var desc: String = "", // :confetti_ball: Android Spannable 扩展，简单易用，支持Kotlin\Java。
    @SerializedName("descMd")
    var descMd: String = "",
    @SerializedName("envelopePic")
    var envelopePic: String = "", // https://www.wanandroid.com/blogimgs/f66d7fb0-aa7f-4282-b1a2-3ba53e3c5dac.png
    @SerializedName("fresh")
    var fresh: Boolean = false, // false
    @SerializedName("host")
    var host: String = "",
    @SerializedName("id")
    var id: Int = 0, // 22419
    @SerializedName("link")
    var link: String = "", // https://www.wanandroid.com/blog/show/3355
    @SerializedName("niceDate")
    var niceDate: String = "", // 2022-04-13 22:57
    @SerializedName("niceShareDate")
    var niceShareDate: String = "", // 2022-04-13 22:57
    @SerializedName("origin")
    var origin: String = "",
    @SerializedName("prefix")
    var prefix: String = "",
    @SerializedName("projectLink")
    var projectLink: String = "", // https://github.com/TxcA/SpannableX
    @SerializedName("publishTime")
    var publishTime: Long = 0, // 1649861827000
    @SerializedName("realSuperChapterId")
    var realSuperChapterId: Int = 0, // 293
    @SerializedName("selfVisible")
    var selfVisible: Int = 0, // 0
    @SerializedName("shareDate")
    var shareDate: Long = 0, // 1649861827000
    @SerializedName("shareUser")
    var shareUser: String = "",
    @SerializedName("superChapterId")
    var superChapterId: Int = 0, // 294
    @SerializedName("superChapterName")
    var superChapterName: String = "", // 开源项目主Tab
    @SerializedName("tags")
    var tags: List<Tag> = listOf(),
    @SerializedName("title")
    var title: String = "", // SpannableX
    @SerializedName("type")
    var type: Int = 0, // 0
    @SerializedName("userId")
    var userId: Int = 0, // -1
    @SerializedName("visible")
    var visible: Int = 0, // 1
    @SerializedName("zan")
    var zan: Int = 0 // 0
)