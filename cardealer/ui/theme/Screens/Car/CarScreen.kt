package com.example.greatcardealers.Screens.Car

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardealer.R
import com.example.cardealer.navigations.INFO_URL
//import com.example.greatcardealers.R
//import com.example.greatcardealers.navigations.INFO_URL

@Composable
fun Cars(navController: NavHostController){
    Column {
        Row {
            Column {
                Card(
                    modifier = Modifier
                        .clickable { navController.navigate(INFO_URL) }
                        .height(20.dp)
                        .width(20.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                }
                Image(painter = painterResource(id = R.drawable.toyotabz4x),
                    contentDescription =null,
                    contentScale = ContentScale.FillBounds
                )

            }

        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Column {
                Card(
                    modifier = Modifier
                        .clickable { navController.navigate(INFO_URL) }
                        .height(20.dp)
                        .width(20.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                }
                Image(painter = painterResource(id = R.drawable.toyotabz4x),
                    contentDescription =null, )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Column {
                Card(
                    modifier = Modifier
                        .clickable { navController.navigate(INFO_URL) }
                        .height(20.dp)
                        .width(20.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize())
                }
                Image(painter = painterResource(id = R.drawable.personal) ,
                    contentDescription = null,)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CarsPreview(){
    Cars(rememberNavController())
}