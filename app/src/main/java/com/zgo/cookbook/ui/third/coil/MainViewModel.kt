package com.zgo.cookbook.ui.third.coil


import android.content.Context
import androidx.annotation.ColorInt
import androidx.annotation.Px
import androidx.compose.ui.geometry.Size
import androidx.core.graphics.toColorInt
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.memory.MemoryCache
import coil.request.Parameters
import com.zgo.lib.utils.Utils
import com.zgo.lib.utils.randomColor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okio.buffer
import okio.source
import org.json.JSONArray
import kotlin.math.roundToInt


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/12
 */
enum class AssetType(val fileName: String) {
    JPG("jpgs.json"),
    GIF("gifs.json");
//    SVG("svgs.json"),
//    MP4("video.mp4");


    fun next(): AssetType {
        val values = AssetType.values()
        return values[(values.indexOf(this) + 1) % values.size]
    }
}

data class Image(
    val uri: String,
    @ColorInt val color: Int,
    @Px val width: Int,
    @Px val height: Int,
    val parameters: Parameters = Parameters.EMPTY,
) {
    fun calculateScaledSize(context: Context, numColumns: Int): Size {
        val displayWidth = context.resources.displayMetrics.widthPixels
        val columnWidth = (displayWidth / numColumns.toDouble()).roundToInt()
        val scale = columnWidth / width.toDouble()
        return Size(columnWidth.toFloat(), (scale * height).roundToInt().toFloat())
    }
}


sealed class Screen {

    object List : Screen()

    data class Detail(
        val image: Image,
        val placeholder: MemoryCache.Key?,
    ) : Screen()
}


class MainViewModel : ViewModel() {

    private val _images: MutableStateFlow<List<Image>> = MutableStateFlow(emptyList())
    val images: StateFlow<List<Image>> get() = _images

    val assetType: MutableStateFlow<AssetType> = MutableStateFlow(AssetType.JPG)
    val screen: MutableStateFlow<Screen> = MutableStateFlow(Screen.List)

    init {
        viewModelScope.launch {
            assetType.collect { _images.value = loadImagesAsync(it) }
        }
    }

    fun onBackPressed(): Boolean {
        if (screen.value is Screen.Detail) {
            screen.value = Screen.List
            return true
        }
        return false
    }

    private suspend fun loadImagesAsync(assetType: AssetType) = withContext(Dispatchers.IO) {
        loadImages(assetType)
    }


    private fun loadImages(assetType: AssetType): List<Image> {
        val json =
            JSONArray(Utils.context.assets.open(assetType.fileName).source().buffer().readUtf8())
        return List(json.length()) { index ->
            val image = json.getJSONObject(index)

            val url: String
            val color: Int
            if (assetType == AssetType.JPG) {
                url = image.getJSONObject("urls").getString("regular")
                color = image.getString("color").toColorInt()
            } else {
                url = image.getString("url")
                color = randomColor()
            }

            Image(
                uri = url,
                color = color,
                width = image.getInt("width"),
                height = image.getInt("height")
            )
        }
    }
}