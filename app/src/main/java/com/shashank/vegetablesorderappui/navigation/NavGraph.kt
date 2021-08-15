package com.shashank.vegetablesorderappui.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shashank.vegetablesorderappui.view.dashboard.Dashboard
import com.shashank.vegetablesorderappui.view.dashboard.VegetableDetail
import com.shashank.vegetablesorderappui.view.welcome.OnBoardingScreenView
import com.shashank.vegetablesorderappui.view.welcome.SplashScreenView

@ExperimentalMaterialApi
@Composable
fun NavGraph() {
    val navController = rememberNavController()
    val actions = remember(navController) { MainActions(navController) }

    NavHost(navController, startDestination = Screen.Splash.route) {

        //Splash Screen
        composable(Screen.Splash.route) {
            SplashScreenView(actions)
        }

        //OnBoarding Screen
        composable(Screen.OnBoarding.route) {
            OnBoardingScreenView(actions)
        }

        //Dashboard
        composable(Screen.Dashboard.route) {
            Dashboard(actions)
        }

        //Vegetable Detail
        composable(Screen.VegetableDetail.route) {
            VegetableDetail(actions)
        }
    }
}

class MainActions(private val navController: NavHostController) {

    val popBackStack: () -> Unit = {
        navController.popBackStack()
    }

    val upPress: () -> Unit = {
        navController.navigateUp()
    }

    val gotoOnBoarding: () -> Unit = {
        navController.popBackStack()
        navController.navigate(Screen.OnBoarding.route)
    }

    val gotoOnDashboard: () -> Unit = {
        navController.popBackStack()
        navController.navigate(Screen.Dashboard.route)
    }

    val gotoVegetableDetail: () -> Unit = {
        navController.navigate(Screen.VegetableDetail.route)
    }
}