package com.example.mviapp.ui.feature.joke

sealed class JokeIntent {
    object getJoke : JokeIntent()
}