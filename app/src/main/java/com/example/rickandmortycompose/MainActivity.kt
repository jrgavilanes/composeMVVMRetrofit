package com.example.rickandmortycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.rickandmortycompose.core.ui.theme.RickAndMortyComposeTheme
import com.example.rickandmortycompose.features.showCharacters.ui.ShowCharactersScreen
import com.example.rickandmortycompose.features.showCharacters.ui.ShowCharactersViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickAndMortyComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowCharactersScreen("Android", ShowCharactersViewModel())
                }
            }
        }
    }
}



