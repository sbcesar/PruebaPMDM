package com.example.screens.Navigation

sealed class AppScreen(
    val route: String
) {
    object FirstScreen: AppScreen("FirstScreen")
    object SecondScreen: AppScreen("SecondScreen")
}