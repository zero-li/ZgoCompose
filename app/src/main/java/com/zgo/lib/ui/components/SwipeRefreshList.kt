package com.zgo.lib.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults.buttonElevation
import androidx.compose.material3.ButtonDefaults.textButtonColors
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.zgo.demo.R
import kotlinx.coroutines.launch


/*
 * 分页加载
 * 
 * @author: zhhli
 * @date: 22/2/17
 */
@Composable
fun <T : Any> SwipeRefreshList(
 collectAsLazyPagingItems: LazyPagingItems<T>,
 listContent: LazyListScope.() -> Unit,
) {
 val rememberSwipeRefreshState = rememberSwipeRefreshState(isRefreshing = false)

 SwipeRefresh(
  state = rememberSwipeRefreshState,
  onRefresh = { collectAsLazyPagingItems.refresh() }
 ) {
  val lazyListState = rememberLazyListState()

  val coroutineScope = rememberCoroutineScope()

  rememberSwipeRefreshState.isRefreshing =
   collectAsLazyPagingItems.loadState.refresh is LoadState.Loading

  LazyColumn(
   state = lazyListState,
   modifier = Modifier
    .fillMaxWidth()
    .fillMaxHeight(),

   ) {
   listContent()
   collectAsLazyPagingItems.apply {
    when {
     loadState.append is LoadState.Loading -> {
      //加载更多，底部loading
      item { LoadingItem() }
     }
     loadState.append is LoadState.Error -> {
      //加载更多异常
      item {
       ErrorMoreRetryItem {
        collectAsLazyPagingItems.retry()
       }
      }
     }

     loadState.append == LoadState.NotLoading(endOfPaginationReached = true) -> {
      // 已经没有更多数据了
      item {
       NoMoreDataFindItem(onClick = {
        coroutineScope.launch {
         lazyListState.animateScrollToItem(0)
        }
       })
      }
     }

     loadState.refresh is LoadState.Error -> {
      if (collectAsLazyPagingItems.itemCount <= 0) {
       //刷新的时候，如果itemCount小于0，第一次加载异常
       item {
        ErrorContent {
         collectAsLazyPagingItems.retry()
        }
       }
      } else {
       item {
        ErrorMoreRetryItem {
         collectAsLazyPagingItems.retry()
        }
       }
      }
     }
     loadState.refresh is LoadState.Loading -> {
      // 第一次加载且正在加载中
      if (collectAsLazyPagingItems.itemCount == 0) {
      }
     }
    }
   }
  }
 }
}

/**
 * 底部加载更多失败处理
 * */
@Composable
fun ErrorMoreRetryItem(retry: () -> Unit) {
 TextButton(
  modifier = Modifier
   .padding(top = 5.dp)
   .fillMaxWidth()
   .height(35.dp),
  onClick = { retry() },
  shape = RoundedCornerShape(0.dp),
  contentPadding = PaddingValues(3.dp),
  colors = textButtonColors(containerColor = MaterialTheme.colorScheme.errorContainer),
//   elevation = buttonElevation(
//    defaultElevation = 2.dp,
//    pressedElevation = 4.dp,
//   ),
 ) {
  Text(text = "请重试", color = MaterialTheme.colorScheme.onErrorContainer)
 }
}

@Composable
fun NoMoreDataFindItem(onClick: () -> Unit) {
 TextButton(
  onClick = { onClick() },
  modifier = Modifier
   .padding(top = 5.dp)
   .fillMaxWidth()
   .height(35.dp),
  shape = RoundedCornerShape(0.dp),
  contentPadding = PaddingValues(3.dp),
  colors = textButtonColors(containerColor = MaterialTheme.colorScheme.onSurfaceVariant),
  elevation = buttonElevation(
   defaultElevation = 2.dp,
   pressedElevation = 4.dp,
  ),
 ) {
  Text(text = "已经没有更多数据啦 ~~ Click to top", color = MaterialTheme.colorScheme.surfaceVariant)
 }
}


/**
 * 页面加载失败处理
 * */
@Composable
fun ErrorContent(retry: () -> Unit) {
 Column(
  modifier = Modifier
   .fillMaxSize()
   .background(color = MaterialTheme.colorScheme.surfaceVariant)
   .padding(top = 100.dp),
  verticalArrangement = Arrangement.Center,
  horizontalAlignment = Alignment.CenterHorizontally
 ) {
  Image(
   modifier = Modifier.padding(top = 80.dp),
   painter = painterResource(id = R.drawable.ic_launcher_foreground),
   contentDescription = null
  )
  Text(text = "请求失败，请检查网络", modifier = Modifier.padding(8.dp))
  TextButton(
   onClick = { retry() },
   modifier = Modifier
    .padding(20.dp)
    .width(80.dp)
    .height(30.dp),
   shape = RoundedCornerShape(10.dp),
   contentPadding = PaddingValues(5.dp),
   colors = textButtonColors(containerColor = MaterialTheme.colorScheme.primary),
   elevation = buttonElevation(
    defaultElevation = 2.dp,
    pressedElevation = 4.dp,
   )
   //colors = ButtonDefaults
  ) { Text(text = "重试", color = MaterialTheme.colorScheme.onPrimary) }
 }
}

/**
 * 底部加载更多正在加载中...
 * */
@Composable
fun LoadingItem() {
 Row(
  modifier = Modifier
   .padding(5.dp)
   .height(35.dp)
   .fillMaxWidth()
   .background(color = MaterialTheme.colorScheme.surfaceVariant),
  horizontalArrangement = Arrangement.Center
 ) {
  CircularProgressIndicator(
   modifier = Modifier
    .size(24.dp),
   color = MaterialTheme.colorScheme.onSurfaceVariant,
   strokeWidth = 2.dp
  )
  Text(
   text = "加载中...",
   color = MaterialTheme.colorScheme.onSurfaceVariant,
   modifier = Modifier
    .fillMaxHeight()
    .padding(start = 20.dp),
  )
 }
}

@Preview
@Composable
fun Preview2() {

 Column {

// ErrorContent(retry = {})
  ErrorMoreRetryItem(retry = {})
  NoMoreDataFindItem(onClick = {})


  LoadingItem()

 }


}

