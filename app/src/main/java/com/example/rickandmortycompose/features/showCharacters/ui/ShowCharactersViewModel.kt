package com.example.rickandmortycompose.features.showCharacters.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortycompose.features.showCharacters.data.network.responses.CharactersResponse
import com.example.rickandmortycompose.features.showCharacters.domain.ShowCharactersUseCase
import kotlinx.coroutines.launch

class ShowCharactersViewModel : ViewModel() {
    private val showCharactersUseCase = ShowCharactersUseCase()

    private val _charactersReponse = MutableLiveData<CharactersResponse>()
    val characterResponse: LiveData<CharactersResponse> = _charactersReponse

    fun showCharacters() {
        viewModelScope.launch {
            val response = showCharactersUseCase()
            _charactersReponse.value = response
            Log.i("janrax", "Llega: $response")
        }
    }
}
