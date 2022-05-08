package com.chenyuan.iminkandroid

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.chenyuan.iminkandroid.home.ui.BattlesScreen
import com.chenyuan.iminkandroid.home.ui.HomeScreen
import com.chenyuan.iminkandroid.me.ui.MeScreen
import com.chenyuan.iminkandroid.salmonrun.ui.SalmonRunScreen

sealed class Screen(
    val route: String
) {
    object Home : Screen("home")
    object Battles : Screen("battles")
    object SalmonRun : Screen("salmonRun")
    object Me : Screen("me")
}
@Composable
fun AppNavigation(
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Battles.route) {
            BattlesScreen()
        }
        composable(Screen.SalmonRun.route) {
            SalmonRunScreen()
        }
        composable(Screen.Me.route) {
            MeScreen()
        }
    }
}
