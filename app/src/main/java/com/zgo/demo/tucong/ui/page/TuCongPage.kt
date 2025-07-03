@file:OptIn(ExperimentalMaterial3Api::class)

package com.zgo.demo.tucong.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.paging.compose.collectAsLazyPagingItems
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.request.Parameters
import com.zgo.demo.tucong.data.TuCongViewModel
import com.zgo.demo.tucong.data.bean.TcFeed
import com.zgo.lib.ui.components.SwipeRefreshList
import com.zgo.lib.ui.components.ZgoScaffold


/*
 *
 * 
 * @author: zhhli
 * @date: 22/5/20
 */
@Composable
fun TuCongPage(
    navigate: (routeName: String) -> Unit,
) {

    val viewModel = remember {
        TuCongViewModel()
    }

    val lazyItems = viewModel.list.collectAsLazyPagingItems()

    ZgoScaffold(modifier = Modifier.systemBarsPadding(),
        topBar = {
            TopAppBar(title = {
                Text(text = "图虫")
            })
        }) { it ->

        SwipeRefreshList(lazyItems, modifier = Modifier.padding(paddingValues = it)) {

            items(lazyItems.itemCount) { index ->
                lazyItems[index]?.apply {
                    if(this.images.isNotEmpty()){
                        ImageCard(feed = this)
                    }
                }

            }
        }


    }


}


@Composable
fun ImageCard(feed: TcFeed) {
//    val url = "https://photo.tuchong.com/2721193/f/1041442208.jpg"
//    val icon = "https://p3-tuchong.byteimg.com/obj/tuchong-avatar/ll_1590877_1"

    val url = feed.images[0].url
    val icon = feed.site.icon
    val name = feed.site.name


    val modifier = Modifier

    Column(
        modifier = Modifier
            .padding(all = 15.dp)
            .clip(RoundedCornerShape(5.dp))
//            .background(MaterialTheme.colorScheme.surface)
            .background(Color.White)
            .clickable {

            }
    ) {


        Surface(
            modifier = modifier
                .fillMaxWidth()
                .aspectRatio(16 / 9f)
        ) {
            AsyncImage(
                model = imageRequest(url = url),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentScale = ContentScale.Crop
            )
        }




        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .padding(top = 8.dp, bottom = 4.dp)
        ) {
            AsyncImage(
                model = imageRequest(url = icon),
                contentDescription = null,
                modifier = modifier
                    .size(48.dp)
                    .clip(CircleShape)
            )

            Text(
                text = name,
                modifier = modifier
                    .weight(1f)
                    .padding(start = 5.dp)
            )

        }

    }

}

@Composable
fun imageRequest(url: String): ImageRequest = ImageRequest.Builder(LocalContext.current)
    .data(url)
    .parameters(Parameters.EMPTY)
    .placeholderMemoryCacheKey(url)
    .build()


