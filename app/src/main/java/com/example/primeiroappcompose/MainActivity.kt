package com.example.primeiroappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeiroappcompose.ui.theme.PrimeiroAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeiroAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NomeSubNomeApp("Meu 1º App Android","Usando Compose")
                }
            }
        }
    }
}

@Composable
fun NomeSubNomeApp(appName: String, subName: String) {
    Column {
        Text(text = "$appName!")
        Text(text = "$subName!")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PrimeiroAppComposeTheme {
        NomeSubNomeApp("Meu 1º App Android","Usando Compose")
    }
}