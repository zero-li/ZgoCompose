package com.zgo.lib.utils

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import androidx.annotation.ColorInt
import kotlin.random.Random


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/12
 */
@SuppressLint("StaticFieldLeak")
object Utils {
    lateinit var context: Context
    fun init(context: Context) {
        this.context = context.applicationContext
    }
}


@ColorInt
fun randomColor(): Int {
    return Color.argb(128, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
}