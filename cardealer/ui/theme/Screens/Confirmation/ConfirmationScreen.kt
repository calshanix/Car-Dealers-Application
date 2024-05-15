package com.example.greatcardealers.Screens.Confirmation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Confirmation(navController: NavHostController){
    Column {
        Text(text = "Thank you for trusting us....you shall be notified when you will receive your order")

    }
}

@Preview(showBackground = true)
@Composable
fun ConfirmationPreview(){
    Confirmation(rememberNavController())
}