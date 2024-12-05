package com.example.screens.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


@Composable
fun SecondScreen(navController: NavController, text: String?) {
    SecondBody(navController = navController, text)
}

@Composable
fun SecondBody(navController: NavController, text: String?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Adioo!!")

        Button(
            onClick = { navController.popBackStack() }
        ) {
            Text(text = "De vuelta", color = Color.White)
        }

        text?.let {
            Text(it)
        }
    }
}