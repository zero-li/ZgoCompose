package com.zgo.lib.ui.base


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/5/5
 */
sealed class UiState {
    object SignedOut : UiState()
    object InProgress : UiState()
    object Error : UiState()
    object SignIn : UiState()
}

