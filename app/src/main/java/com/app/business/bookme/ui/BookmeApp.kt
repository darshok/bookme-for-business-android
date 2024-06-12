package com.app.business.bookme.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BookmeApp() {
    val navController = rememberNavController()
    BookmeNavHost(
        navController = navController,
    )
}
