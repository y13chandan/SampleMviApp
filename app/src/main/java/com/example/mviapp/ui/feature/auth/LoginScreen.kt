package com.example.mviapp.ui.feature.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.mviapp.DestinationScreen
import navigateTo

@Composable
fun LoginScreen(navController: NavController) {
    Text(text = "Hi This is my login screen",
    modifier = Modifier
        .background(Color.Blue)
        .fillMaxSize()
        .clickable {
            navigateTo(navController, DestinationScreen.SignUp.route)
        })

}