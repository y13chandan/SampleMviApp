package com.example.mviapp.ui.feature.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mviapp.DestinationScreen
import com.example.mviapp.R
import navigateTo
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight()
                .verticalScroll(
                    rememberScrollState()
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val nameState = remember {
                mutableStateOf(TextFieldValue())
            }
            val numberState = remember {
                mutableStateOf(TextFieldValue())
            }
            val emailState = remember {
                mutableStateOf(TextFieldValue())
            }
            val passwordState = remember {
                mutableStateOf(TextFieldValue())
            }
            val focus = LocalFocusManager.current
            Image(
                painter = painterResource(id = R.drawable.chat_box),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .padding(top = 20.dp)
                    .padding(8.dp)
            )

            Text(
                text = "Sign Up",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Medium
            )

            OutlinedTextField(
                value = nameState.value, onValueChange = {
                    nameState.value = it
                },
                label = { Text(text = "Name") },
                modifier = Modifier.padding(8.dp)
            )
            OutlinedTextField(
                value = numberState.value, onValueChange = {
                    nameState.value = it
                },
                label = { Text(text = "Number") },
                modifier = Modifier.padding(8.dp)
            )
            OutlinedTextField(
                value = passwordState.value, onValueChange = {
                    nameState.value = it
                },
                label = { Text(text = "Email") },
                modifier = Modifier.padding(8.dp)
            )
            OutlinedTextField(
                value = emailState.value, onValueChange = {
                    nameState.value = it
                },
                label = { Text(text = "Password") },
                modifier = Modifier.padding(8.dp)
            )

            Button(onClick = {

            }, modifier = Modifier.padding(8.dp)) {
                Text(
                    text = "Sign Up",
                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 10.dp)
                )
            }

            Text(text = "Already a User? Go to Login ->",
                color = Color.Blue,
                modifier = Modifier
                    .padding(8.dp)
                    .clickable {
                        navigateTo(navController = navController, DestinationScreen.Login.route)
                    })
        }
    }
}
