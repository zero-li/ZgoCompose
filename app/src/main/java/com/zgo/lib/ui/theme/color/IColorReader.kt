package com.zgo.lib.ui.theme.color

import android.content.Context
import androidx.compose.ui.graphics.Color
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/22
 */

abstract class ZgoColor(
    val id: String,
    val name: String,
    val hex: String = "#ffb3a7",
    val color: Color = Color.Transparent,
    val intro: String = "",
) {
    abstract override fun toString(): String
}

interface IColorReader {


    val json: String get


    val String.color
        get() = Color(android.graphics.Color.parseColor(this))


    // var colorList: List<ChKindColor> = listOf()
    fun getColorList(context: Context): List<ZgoColor>

    fun getJsonString(context: Context): String {
        val stringBuilder = StringBuilder()
        try {
            val assetManager = context.assets
            val br = BufferedReader(InputStreamReader(assetManager.open(json)))
            var line: String?
            while (br.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return stringBuilder.toString()
    }


}