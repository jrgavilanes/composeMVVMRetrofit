package com.example.rickandmortycompose.features.showCharacters.data

import com.example.rickandmortycompose.features.showCharacters.data.network.ShowCharactersService
import com.example.rickandmortycompose.features.showCharacters.data.network.responses.CharactersResponse

class ShowCharactersRepository {
    private val api = ShowCharactersService()
    suspend fun showCharacters(): CharactersResponse? {
        return api.showCharacters()
    }
}