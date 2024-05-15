package com.example.greatcardealers.Screens.Info

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardealer.navigations.ORDER_URL
//import com.example.greatcardealers.navigations.ORDER_URL

@Composable
fun Info(navController: NavHostController){
    Column {
        Row {
            Column {
                Card (modifier = Modifier
                    .clickable { navController.navigate(ORDER_URL) }
                    .height(50.dp)
                    .width(70.dp))
                {
                    Card (modifier = Modifier.fillMaxSize())
                    {
                        Text(text = "BRAND :TOYOTA")
                        Text(text = "COUNTRY OF ORIGIN:GERMANY")



                    }

                }
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun InfoPreview(){
    Info(rememberNavController())
}