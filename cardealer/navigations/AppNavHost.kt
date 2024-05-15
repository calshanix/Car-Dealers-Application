package com.example.cardealer.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greatcardealers.Screens.Car.Cars
import com.example.greatcardealers.Screens.Confirmation.Confirmation
import com.example.greatcardealers.Screens.Home.Home
import com.example.greatcardealers.Screens.Info.Info
import com.example.greatcardealers.Screens.Intro.Intro
import com.example.greatcardealers.Screens.Order.Order
import com.example.greatcardealers.Screens.Qualification.Qualification
import com.example.greatcardealers.Screens.login.Login


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = INTRO_URL) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(LOGIN_URL){
            Login(navController = navController)
        }
        composable(CARS_URL){
            Cars(navController = navController)
        }
        composable(INTRO_URL){
            Intro(navController = navController)
        }
        composable(INFO_URL){
            Info(navController = navController)
        }
        composable(ORDER_URL){
            Order(navController = navController)
        }
        composable(QUALIFICATION_URL){
            Qualification(navController = navController)
        }
        composable(CONFIRMATION_URL){
            Confirmation(navController = navController)
        }
        composable(HOME_URL){
            Home(navController = navController)
        }


    }
}