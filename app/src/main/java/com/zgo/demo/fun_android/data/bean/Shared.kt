package com.zgo.demo.fun_android.data.bean

import androidx.annotation.Keep

/*
 *
 *
 * @author: zhhli
 * @date: 22/4/24
 */
@Keep
data class Shared(
    val coinInfo: CoinInfo,
    val shareArticles: FunWrapper<Article>
)