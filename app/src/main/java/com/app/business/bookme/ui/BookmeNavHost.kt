package com.app.business.bookme.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.business.bookme.ui.common.navigation.BookmeScreen
import com.app.business.bookme.ui.common.navigation.NavigationActions
import com.app.business.bookme.ui.features.authentication.authenticationNavHost
import com.app.business.bookme.ui.features.home.HomeLayout


@Composable
fun BookmeNavHost(
    navController: NavHostController,
    navigationActions: NavigationActions,
    currentDestination: String,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = BookmeScreen.Home.Discover.route,
        modifier = modifier
    ) {
        composable(route = BookmeScreen.Home.Discover.route) {
            HomeLayout(
                onRequireAuthentication = { navigationActions.navigateToAuthentication() },
                currentDestination = currentDestination
            )
        }
        authenticationNavHost(navigationActions)
    }
}