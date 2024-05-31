package com.gmail.pashkovich.al.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

internal class NewsMainViewModel: ViewModel() {

    private val _state = MutableStateFlow(State.None)
    val state: StateFlow<State>
        get() = _state.asStateFlow()
}

internal sealed class State{

    data object None: State()
    class Loading: State()
    class Error: State()
    class Success(val articles: List<ArticleUI>) : State()

}
