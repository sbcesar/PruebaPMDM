package com.example.a1pruebapmdm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.a1pruebapmdm.navigation.AppScreen
import com.example.a1pruebapmdm.R


@Composable
fun FirstScreen(navController: NavController) {
    FirstBody(navController)
}

@Composable
fun FirstBody(navController: NavController) {
    Surface(
        color = colorResource(R.color.background_color)
    ) {
        var emailText by remember { mutableStateOf("") }
        var passwordText by remember { mutableStateOf("") }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {

            Text(
                text = "Introduzca sus datos para iniciar sesion",
                color = Color.Magenta,
                fontSize = 25.sp,
                modifier = Modifier.padding(bottom = 25.dp),
            )

            TextFieldContent(
                value = emailText,
                onChange = { emailText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                placeholder = "Email"
            )

            TextFieldContent(
                value = passwordText,
                onChange = { passwordText = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = "Password"
            )

            // Llama a la funcion solo si las dos casillas están completas
            if (checkValues(emailText,passwordText)) {
                ErrorText()
            }

            Spacer(modifier = Modifier.height(30.dp))

            // El botón solo se habilita si las dos casillas están completas
            Button(
                onClick = { navController.navigate(route = AppScreen.SecondScreen.route + "/" + emailText + " " + passwordText) },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta),
                enabled = !checkValues(emailText, passwordText)
            ) {
                Text(
                    text = "Send",
                    color = Color.White,
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class) // Esto solo es para usar textFieldColors
@Composable
fun TextFieldContent(
    value: String,
    onChange: (String) -> Unit,
    modifier: Modifier,
    placeholder: String
) {
    TextField(
        value = value,
        onValueChange = onChange,
        modifier = modifier,
        placeholder = { Text(placeholder) },
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Magenta,
            focusedTextColor = Color.Magenta,
            unfocusedTextColor = Color.Magenta
        )
    )
}

@Composable
fun ErrorText() {
    Text(
        text = "Por favor, rellena los campos previos",
        color = Color.Red,
    )
}

fun checkValues(emailText: String, passwordText: String): Boolean {
    return (emailText.isBlank() || passwordText.isBlank())
}