package com.example.rickandmortycompose.features.showCharacters.data.network.responses

data class Result(
    val id: Int,
    val name: String,
    val image: String,
    val gender: String,
    val location: Location,
    val origin: Origin,
    val species: String,
    val status: String,
    val url: String,
    val type: String,
    val episode: List<String>,
    val created: String
)
