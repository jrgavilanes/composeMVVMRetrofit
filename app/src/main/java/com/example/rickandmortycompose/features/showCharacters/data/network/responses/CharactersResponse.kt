package com.example.rickandmortycompose.features.showCharacters.data.network.responses

import com.google.gson.annotations.SerializedName

data class CharactersResponse(
    @SerializedName("info") val info: InfoResponse,
    @SerializedName("results") val results: List<Result>
)
