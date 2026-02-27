package com.example.composenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.screens.*

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Sunday : Screen("sunday")
    object Monday : Screen("monday")
    object Tuesday : Screen("tuesday")
    object Wednesday : Screen("wednesday")
    object Thursday : Screen("thursday")
    object Friday : Screen("friday")
    object Saturday : Screen("saturday")
}

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.Sunday.route) {
            SundayScreen(navController = navController)
        }
        composable(Screen.Monday.route) {
            MondayScreen(navController = navController)
        }
        composable(Screen.Tuesday.route) {
            TuesdayScreen(navController = navController)
        }
        composable(Screen.Wednesday.route) {
            WednesdayScreen(navController = navController)
        }
        composable(Screen.Thursday.route) {
            ThursdayScreen(navController = navController)
        }
        composable(Screen.Friday.route) {
            FridayScreen(navController = navController)
        }
        composable(Screen.Saturday.route) {
            SaturdayScreen(navController = navController)
        }
    }
}
