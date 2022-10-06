package com.example.rickandmortycompose.features.showCharacters.domain

import com.example.rickandmortycompose.features.showCharacters.data.ShowCharactersRepository
import com.example.rickandmortycompose.features.showCharacters.data.network.responses.CharactersResponse

class ShowCharactersUseCase {
    private val repository = ShowCharactersRepository()
    suspend operator fun invoke(): CharactersResponse? {
        return repository.showCharacters()
    }
}
