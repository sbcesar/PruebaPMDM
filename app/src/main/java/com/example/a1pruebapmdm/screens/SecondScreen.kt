package com.example.a1pruebapmdm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a1pruebapmdm.R
import com.example.a1pruebapmdm.navigation.AppScreen

@Composable
fun SecondScreen(navController: NavController, text: String) {
    SecondBody(navController, text)
}

@Composable
fun SecondBody(navController: NavController, text: String) {
    Surface(
        color = colorResource(R.color.background_color)
    ) {

        val shownText = if (text.isBlank()) "No hay datos recibidos" else "Texto Anterior --> $text"

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            Text(
                text = shownText,
                color = Color.White,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Button(
                onClick = { navController.popBackStack() },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
            ) {
                Text(
                    text = "Back",
                    color = Color.White
                )
            }
        }
    }
}