package com.example.a1pruebapmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import com.example.a1pruebapmdm.navigation.AppNavigation
import com.example.a1pruebapmdm.ui.theme._1PruebaPMDMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)   // Respeta el status bar y el navigation bar del sistema
        setContent {
            _1PruebaPMDMTheme {
                AppNavigation()
            }
        }
    }
}

