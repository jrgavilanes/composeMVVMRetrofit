package com.example.rickandmortycompose.features.showCharacters.data.network

import com.example.rickandmortycompose.features.showCharacters.data.network.responses.CharactersResponse
import retrofit2.Response
import retrofit2.http.GET

interface ShowCharactersClient {
    @GET("/api/character")
    suspend fun getCharacters(): Response<CharactersResponse>
}
