package com.zgo.lib.ui.base

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.zgo.lib.data.http.paging.BasePagingSource
import kotlinx.coroutines.flow.Flow


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/2/16
 */
open class BaseViewModel : ViewModel() {

    private val _uiState = mutableStateOf<UiState>(UiState.SignedOut)
    val uiState: State<UiState>
        get() = _uiState


    fun <T : Any> pager(
        config: PagingConfig = PagingConfig(
            pageSize = 10,
            prefetchDistance = 4,
            initialLoadSize = 10
        ), source: () -> BasePagingSource<T>
    ): Flow<PagingData<T>> {
        return Pager(config) {
            source()
        }.flow.cachedIn(viewModelScope)
    }


    private fun <T : Any> pager_crash_refresh(source: BasePagingSource<T>): Flow<PagingData<T>> {
        return Pager(
            PagingConfig(
                pageSize = 20,
                prefetchDistance = 4,
                initialLoadSize = 20
            )
        ) {
            source
        }.flow.cachedIn(viewModelScope)
    }


}