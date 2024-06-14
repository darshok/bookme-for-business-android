package com.app.business.bookme.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.app.business.bookme.ui.common.navigation.BookmeScreen
import com.app.business.bookme.ui.common.navigation.NavigationActions

@Composable
fun BookmeApp() {
    val navController = rememberNavController()
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route
        ?: BookmeScreen.Home.route
    val navigationActions = remember(navController) { NavigationActions(navController) }
    BookmeNavHost(
        navController = navController,
        navigationActions = navigationActions,
        currentDestination = currentDestination
    )
}
