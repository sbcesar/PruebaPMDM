package com.example.screens.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.screens.Navigation.AppScreen


@Composable
fun FirstScreen(navController: NavController) {
    FirstBody(navController = navController)
}

@Composable
fun FirstBody(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var text by remember { mutableStateOf("") }

        Text("Hola!!")

        OutlinedTextField(value = text, onValueChange = { text = it })

        Button(
            onClick = { navController.navigate(route = AppScreen.SecondScreen.route + "/" + text) }
        ) {
            Text(text = "Amonoooo!!", color = Color.White)
        }
    }
}