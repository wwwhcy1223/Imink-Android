package com.chenyuan.iminkandroid.home.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.chenyuan.iminkandroid.AppNavigation
import com.chenyuan.iminkandroid.Screen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            MainBottomScreen(
                modifier = Modifier.fillMaxWidth(),
                onNavigationSelected = { screen ->
                    navController.navigate(screen.route) {
                    }
                }
            )
        }
    ) {
        AppNavigation(Modifier.padding(it), navController)
    }
}

@Composable
fun MainBottomScreen(
    modifier: Modifier,
    onNavigationSelected: (Screen) -> Unit
) {
    BottomNavigation() {
        BottomNavigationItem(
            selected = true,
            onClick = { onNavigationSelected(Screen.Home) },
            label = { Text("Home") },
            icon = { Icon(Icons.Filled.Home, contentDescription = null) },
        )
        BottomNavigationItem(
            selected = true,
            onClick = { onNavigationSelected(Screen.Battles) },
            label = { Text("Battles") },
            icon = { Icon(Icons.Filled.Face, contentDescription = null) },
        )
        BottomNavigationItem(
            selected = true,
            onClick = { onNavigationSelected(Screen.SalmonRun) },
            label = { Text("Salmon Run") },
            icon = { Icon(Icons.Filled.ThumbUp, contentDescription = null) },
        )
        BottomNavigationItem(
            selected = true,
            onClick = { onNavigationSelected(Screen.Me) },
            label = { Text("Me") },
            icon = { Icon(Icons.Filled.Email, contentDescription = null) },
        )
    }
}
