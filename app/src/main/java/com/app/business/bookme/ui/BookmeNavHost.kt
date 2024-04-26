package com.app.business.bookme.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app.business.bookme.ui.features.authentication.authenticationNavHost
import com.app.business.bookme.ui.features.home.HomeLayout


@Composable
fun BookmeNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = BookmeScreen.Home.route,
        modifier = modifier
    ) {
        composable(route = BookmeScreen.Home.route) {
            HomeLayout(onRequireAuthentication = { navController.navigateSingleTopTo(BookmeScreen.Authentication.route) })
        }
        authenticationNavHost(navController)
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        // Pop up to the start destination of the graph to
        // avoid building up a large stack of destinations
        // on the back stack as users select items
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        // Avoid multiple copies of the same destination when
        // reselecting the same item
        launchSingleTop = true
        // Restore state when reselecting a previously selected item
        restoreState = true
    }
