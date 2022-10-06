package com.example.rickandmortycompose.features.showCharacters.data.network.responses

data class InfoResponse(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)