package com.app.business.bookme.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

@Composable
fun BookmeApp() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {}
    ) { innerPadding ->
        BookmeNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}
