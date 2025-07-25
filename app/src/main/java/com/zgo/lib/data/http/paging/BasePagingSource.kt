package com.zgo.lib.data.http.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.zgo.lib.data.http.KResults


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/2/16
 */
abstract class BasePagingSource<T : Any> : PagingSource<Int, T>() {

    override fun getRefreshKey(state: PagingState<Int, T>): Int? {

        Log.d("zgo", "state: $state")

        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            Log.d("zgo", "anchorPosition: $anchorPosition  === anchorPage: $anchorPage")

            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    abstract suspend fun httpLoadData(page: Int, perPage: Int): KResults<IPageWrapper<T>?>


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, T> {
        val nextPage = params.key ?: 1

        Log.d("zgo", "nextPage: $nextPage")

        val results = httpLoadData(nextPage, params.loadSize)

        return when (results) {
            is KResults.Success -> {

                val list: List<T> = results.data?.list ?: emptyList()
                val noNextPage = results.data?.isEnd ?: true


                LoadResult.Page(
                    data = list,
                    prevKey = if (nextPage == 1) null else nextPage - 1,
                    nextKey = if (noNextPage) null else results.data!!.curPage + 1,
                )


//    if(results.data != null){
//     val data = results.data
//
//     // 是否有下一页
//     val noNextPage = data.list.size < params.loadSize
//     LoadResult.Page(
//      data = results.data.list ,
//      prevKey = if (nextPage == 1) null else nextPage - 1,
//      nextKey = if (noNextPage) null else results.data.currentPage + 1
//     )
//    }else{
//     LoadResult.Error(KErrors.EmptyResultsError)
//    }

            }
            is KResults.Failure -> LoadResult.Error(results.error)
        }

    }

}