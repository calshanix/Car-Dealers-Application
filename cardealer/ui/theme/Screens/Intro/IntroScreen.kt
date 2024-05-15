package com.example.greatcardealers.Screens.Intro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardealer.navigations.LOGIN_URL
//import com.example.greatcardealers.navigations.LOGIN_URL

@Composable
fun Intro(navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Welcome",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(25.dp, end = 25.dp),
            textAlign = TextAlign.Justify)

        Text(text = "To The Great Car Dealer",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(25.dp, end = 25.dp),
            textAlign = TextAlign.Justify
            )

        Spacer(modifier = Modifier.height(35.dp))

        Text(text = "With us you can purchase your dream car at the comfort of your house even without attending the show rooms. ",
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(15.dp, end = 15.dp))

        Spacer(modifier = Modifier.height(70.dp))

        Button(onClick = {
            navController.navigate(LOGIN_URL)

        },
            modifier = Modifier.size(200.dp, height = 60.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text(text = "Get Started")

        }


    }
}

@Preview(showBackground = true)
@Composable
fun IntroPreview(){
    Intro(rememberNavController())
}
