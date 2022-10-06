package com.example.rickandmortycompose.features.showCharacters.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import com.example.rickandmortycompose.core.ui.theme.RickAndMortyComposeTheme
import com.example.rickandmortycompose.features.showCharacters.data.network.responses.CharactersResponse

@Composable
fun ShowCharactersScreen(name: String, viewModel: ShowCharactersViewModel) {
    val message: CharactersResponse? by viewModel.characterResponse.observeAsState(initial = null)
    Column() {
        Text(text = "Hello $name!")
        Button(onClick = { viewModel.showCharacters() }) {
            Text("Trae peña")
        }
        Text("LLega $message")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RickAndMortyComposeTheme {
        ShowCharactersScreen("Android", ShowCharactersViewModel())
    }
}
