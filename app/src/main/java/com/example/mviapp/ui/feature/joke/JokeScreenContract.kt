package com.example.mviapp.ui.feature.joke

import com.example.mviapp.model.JokeResponse

class JokeScreenContract {
    data class State(
        val response: JokeResponse?,
        val isLoading: Boolean = false
    )

    sealed class Effect {
        object DataWasLoaded : Effect()
    }
}