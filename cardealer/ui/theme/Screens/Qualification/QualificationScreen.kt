package com.example.greatcardealers.Screens.Qualification

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

@Composable
fun Qualification(navController: NavHostController){
    Column {
        Text(text = "DUE TO SAFETY PURPOSES ONE SHOULD MEET THE FOLLOWING QUALIFICATIONS:")


    }
}

@Preview(showBackground = true)
@Composable
fun QualificationPreview(){
    Qualification(rememberNavController())
}