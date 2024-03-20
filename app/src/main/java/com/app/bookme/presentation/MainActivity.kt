package com.app.bookme.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.app.bookme.presentation.login.LoginLayout
import com.app.bookme.presentation.theme.BookmeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookmeTheme {
                LoginLayout()
            }
        }
    }
}