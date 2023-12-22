package com.example.mviapp.usecase

import com.example.mviapp.model.JokeResponse
import com.example.mviapp.network.ApiRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiUseCase @Inject constructor(private val repository: ApiRepository) {

    suspend fun getRandomJoke() : JokeResponse = withContext(Dispatchers.IO) {
        return@withContext repository.getRandomJoke()
    }
}