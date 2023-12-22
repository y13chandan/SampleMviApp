package com.example.mviapp.network

import com.example.mviapp.model.JokeResponse
import retrofit2.http.GET

interface ApiInterface {
    @GET("random_joke")
    suspend fun getRandomJoke(): JokeResponse
}