package com.example.greatcardealers.Screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cardealer.R
import com.example.cardealer.navigations.HOME_URL
import com.example.cardealer.navigations.SIGNUP_URL
//import com.example.greatcardealers.R
//import com.example.greatcardealers.navigations.HOME_URL
//import com.example.greatcardealers.navigations.SIGNUP_URL

@Composable
fun Login(navController: NavHostController) {
    var email by remember { mutableStateOf(TextFieldValue(""))}
    var pass by remember { mutableStateOf(TextFieldValue("")) }
        
    val context = LocalContext .current
    
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.lorry),
            contentDescription =null,
            contentScale = ContentScale.FillBounds
            )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Text(text = "login here",
                color = Color.Blue,
                fontSize = 22.sp)
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value =email ,
                onValueChange ={ email = it},
                label = { Text(text = " enter email")},
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .padding(8.dp)

                )


            Spacer(modifier = Modifier.height(20.dp))


            OutlinedTextField(
                value =pass ,
                onValueChange ={ pass = it},
                label = { Text(text = "enter password")},
                keyboardOptions = KeyboardOptions.Default.copy( imeAction = ImeAction.Next),
                modifier = Modifier
//                    .fillMaxSize()
                    .padding(8.dp)
                )
            Spacer(modifier = Modifier.height(20.dp))
            
            
            Button(onClick = { navController.navigate(SIGNUP_URL)}) {
                Text(text = "dont have an account, sign up")
            }
            Spacer(modifier = Modifier.height(17.dp))
            Button(onClick = { navController.navigate(HOME_URL) }) {
                Text(text = "login")
                
            }
        }
        
        
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview(){
    Login(rememberNavController())
}