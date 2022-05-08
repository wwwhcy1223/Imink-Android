package com.chenyuan.iminkandroid.home.ui

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun HomeScreen() {

    Scaffold(
        bottomBar = {
            MainBottomScreen()
        }
    ) {

    }
}

@Composable
fun MainBottomScreen() {
    BottomNavigation() {
       BottomNavigationItem(
           selected = true,
           onClick = { /*TODO*/ },
           label = { Text("Home")},
           icon = { Icon(Icons.Filled.Home, contentDescription = null) },
       )
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            label = { Text("Battles")},
            icon = { Icon(Icons.Filled.Face, contentDescription = null) },
        )
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            label = { Text("Salmon Run")},
            icon = { Icon(Icons.Filled.ThumbUp, contentDescription = null) },
        )
        BottomNavigationItem(
            selected = true,
            onClick = { /*TODO*/ },
            label = { Text("Me")},
            icon = { Icon(Icons.Filled.Email, contentDescription = null) },
        )
    }

}