package com.example.mviapp.network

import com.example.mviapp.model.JokeResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiRepository @Inject constructor(private val apiInterface: ApiInterface) {
    suspend fun getRandomJoke(): JokeResponse = apiInterface.getRandomJoke()
}