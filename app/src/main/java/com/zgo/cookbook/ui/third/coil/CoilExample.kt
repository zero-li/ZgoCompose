package com.zgo.cookbook.ui.third.coil

import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpSize
import coil.compose.AsyncImage
import coil.memory.MemoryCache
import coil.request.ImageRequest
import com.zgo.lib.ui.components.LazyStaggeredGrid
import com.zgo.lib.ui.components.items
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.lang.Math.ceil


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/12
 */


@Composable
fun CoilExample() {
    val viewModel = MainViewModel()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        AssetTypeButton(viewModel.assetType)
        Content(
            assetTypeFlow = viewModel.assetType,
            screenFlow = viewModel.screen,
            imagesFlow = viewModel.images
        )
    }


    BackHandler { viewModel.onBackPressed() }


}


@Composable
private fun AssetTypeButton(assetTypeFlow: MutableStateFlow<AssetType>) {
    val assetType by assetTypeFlow.collectAsState()
    Button(
        onClick = { assetTypeFlow.value = assetType.next() }
    ) {
        Text(text = assetType.name)
    }
}

@Composable
private fun Content(
    assetTypeFlow: StateFlow<AssetType>,
    screenFlow: MutableStateFlow<Screen>,
    imagesFlow: StateFlow<List<Image>>
) {
    val context = LocalContext.current
    val numColumns = remember(context) { numberOfColumns(context) }

    // Reset the scroll position when assetType changes.
    val assetType by assetTypeFlow.collectAsState()
    val listStates = List(numColumns) {
        rememberSaveable(assetType, saver = LazyListState.Saver) { LazyListState() }
    }

    when (val screen = screenFlow.collectAsState().value) {
        is Screen.Detail -> DetailScreen(screen)
        is Screen.List -> ListScreen(numColumns, listStates, screenFlow, imagesFlow)
    }
}

@Composable
private fun DetailScreen(screen: Screen.Detail) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(screen.image.uri)
            .parameters(screen.image.parameters)
            .placeholderMemoryCacheKey(screen.placeholder)
            .build(),
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
private fun ListScreen(
    numColumns: Int,
    listStates: List<LazyListState>,
    screenFlow: MutableStateFlow<Screen>,
    imagesFlow: StateFlow<List<Image>>
) {
    val images by imagesFlow.collectAsState()

    LazyStaggeredGrid(
        columnCount = numColumns,
        states = listStates
    ) {
        items(images) { image ->
            // Scale the image to fit the width of a column.
            val size = with(LocalDensity.current) {
                image
                    .calculateScaledSize(LocalContext.current, numColumns)
                    .run { DpSize(width.toDp(), height.toDp()) }
            }

            // Intentionally not a `State` object to avoid recomposition.
            var placeholder: MemoryCache.Key? = null

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(image.uri)
                    .parameters(image.parameters)
                    .build(),
                placeholder = ColorPainter(Color(image.color)),
                error = ColorPainter(Color.Red),
                onSuccess = { placeholder = it.result.memoryCacheKey },
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(size)
                    .clickable { screenFlow.value = Screen.Detail(image, placeholder) }
            )
        }
    }
}

fun numberOfColumns(context: Context): Int {
    val displayWidth = context.resources.displayMetrics.widthPixels
    val maxColumnWidth = 320 * context.resources.displayMetrics.density
    return ceil(displayWidth.toDouble() / maxColumnWidth).toInt().coerceAtLeast(4)
}