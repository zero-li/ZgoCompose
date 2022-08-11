package com.zgo.lib.ui.theme.color

import android.content.Context
import androidx.compose.ui.graphics.Color
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.regex.Pattern


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


    open fun toRGB(): List<Int> {
        if (!Pattern.matches("^#[0-9a-f[A-F]]{6}", hex)) {
            return listOf(0, 0, 0)
        }
        val red = hex.substring(1, 3).toInt(radix = 16)
        val blue = hex.substring(3, 5).toInt(radix = 16)
        val green = hex.substring(5).toInt(radix = 16)


        return listOf(red, blue, green)
    }


    // The R,G,B values are divided by 255 to change the range from 0..255 to 0..1:
    //
    //R' = R/255
    //G' = G/255
    //B' = B/255
    //The black key (K) color is calculated from the red (R'), green (G') and blue (B') colors:
    //K = 1-max(R', G', B')
    //
    //The cyan color (C) is calculated from the red (R') and black (K) colors:
    //C = (1-R'-K) / (1-K)
    //
    //The magenta color (M) is calculated from the green (G') and black (K) colors:
    //M = (1-G'-K) / (1-K)
    //
    //The yellow color (Y) is calculated from the blue (B') and black (K) colors:
    //Y = (1-B'-K) / (1-K)
    open fun toCMYK(): List<Int> {
        val rgb = toRGB()

        val red = rgb[0] / 255f
        val green = rgb[1] / 255f
        val blue = rgb[2] / 255f

        val k = 1 - maxOf(red, green, blue)

        val cyan = (1f - red - k) / (1 - k)
        val magenta = (1f - green - k) / (1 - k)
        val yellow = (1f - blue - k) / (1 - k)
        val black = k


        return listOf(cyan.paresInt(), magenta.paresInt(), yellow.paresInt(), black.paresInt())
    }

    private fun Float.paresInt(): Int {
        return (this * 100 + 0.5).toInt()
    }


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