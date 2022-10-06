package com.example.rickandmortycompose.features.showCharacters.data.network

import com.example.rickandmortycompose.core.network.RetrofitHelper
import com.example.rickandmortycompose.features.showCharacters.data.network.responses.CharactersResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ShowCharactersService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun showCharacters(): CharactersResponse? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(ShowCharactersClient::class.java).getCharacters()
            response.body()
        }
    }
}
