package com.example.screens.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.screens.Screens.FirstScreen
import com.example.screens.Screens.SecondScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreen.FirstScreen.route
    ) {
        composable(AppScreen.FirstScreen.route) {
            FirstScreen(navController)
        }

        composable(
            route = AppScreen.SecondScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text") { type = NavType.StringType }
            )
        ) {
            SecondScreen(navController, it.arguments?.getString("text"))
        }
    }
}