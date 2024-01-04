package com.example.mviapp.ui.feature.joke

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mviapp.usecase.ApiUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JokeViewModel @Inject constructor(private val useCase: ApiUseCase): ViewModel() {

    var state by mutableStateOf(JokeScreenContract.State(
        response = null,
        isLoading = true
    ))

    var effects = Channel<JokeScreenContract.Effect>(Channel.UNLIMITED)
        private set

    init {
        viewModelScope.launch {
            getJoke()
        }
    }

    fun handleIntent(intent: JokeIntent) {
        viewModelScope.launch {
            when(intent) {
                is JokeIntent.getJoke -> {
                    getJoke()
                }
            }
        }
    }

    private suspend fun getJoke() {
        val joke = useCase.getRandomJoke()
        viewModelScope.launch {
            state = state.copy(response = joke, isLoading = false)
            effects.send(JokeScreenContract.Effect.DataWasLoaded)
        }
    }
}