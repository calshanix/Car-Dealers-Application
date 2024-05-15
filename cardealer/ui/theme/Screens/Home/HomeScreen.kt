package com.example.greatcardealers.Screens.Home

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardealer.R
import com.example.cardealer.navigations.CARS_URL
//import com.example.greatcardealers.R
//import com.example.greatcardealers.navigations.CARS_URL

@Composable
fun Home(navController: NavHostController) {
    Column {
        Row {
            Column {
                Card(
                    modifier = Modifier.align(alignment=Alignment.CenterHorizontally)
                        .clickable { navController.navigate(CARS_URL) }
                        .height(100.dp)
                        .width(160.dp)


                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.personal),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds
                        )
                    }
                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "personal car"
                )

                Spacer(modifier = Modifier.height(2.dp))

            }
            Column {
                Card(
                    modifier = Modifier
                        .clickable { navController.navigate(CARS_URL) }
                        .height(100.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.schoolbus
                            ),
                            contentDescription =null,
                            contentScale = ContentScale.FillBounds
                        )
                    }
                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "School bus",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

            }
            Column {
                Card(
                    modifier = Modifier
                        .clickable { navController.navigate(CARS_URL) }
                        .height(100.dp)
                        .width(160.dp)

                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lorry),
                            contentDescription =null,
                            contentScale = ContentScale.FillBounds
                        )
                    }
                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "lorry"
                )

                Spacer(modifier = Modifier.height(2.dp))

            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home(rememberNavController())
}