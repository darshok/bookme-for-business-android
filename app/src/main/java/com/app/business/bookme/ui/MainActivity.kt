package com.app.business.bookme.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.app.business.bookme.ui.login.LoginLayout
import com.app.business.bookme.ui.theme.BookmeTheme
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