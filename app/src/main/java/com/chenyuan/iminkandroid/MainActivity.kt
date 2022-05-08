package com.chenyuan.iminkandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.chenyuan.iminkandroid.home.ui.HomeScreen
import com.chenyuan.iminkandroid.home.ui.MainScreen
import com.chenyuan.iminkandroid.ui.theme.IminkAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IminkAndroidTheme {
                MainScreen()
            }
        }
    }
}
