package com.app.business.bookme.ui.common.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

sealed class BookmeScreen(val route: String) {

    object Home : BookmeScreen("home") {
        object Discover : BookmeScreen("discover")
        object Booking : BookmeScreen("booking")
        object Profile : BookmeScreen("profile")
    }

    object Authentication : BookmeScreen("authentication") {
        object Welcome : BookmeScreen("welcome")
        object LogIn : BookmeScreen("log_in")
        object SignUp : BookmeScreen("sign_up") {
            object SignUpCredentials : BookmeScreen("sign_up_credentials")
            object SignUpDetails : BookmeScreen("sign_up_details")
        }
    }
}

class NavigationActions(private val navController: NavHostController) {
    val navigateToAuthentication: () -> Unit = {
        navController.navigateSingleTopTo(BookmeScreen.Authentication.route)
    }
    val navigateToSignUp: () -> Unit = {
        navController.navigate(BookmeScreen.Authentication.SignUp.route)
    }
    val navigateToLogIn: () -> Unit = {
        navController.navigate(BookmeScreen.Authentication.LogIn.route)
    }
    val navigateToSignUpDetails: () -> Unit = {
        navController.navigate(BookmeScreen.Authentication.SignUp.SignUpDetails.route)
    }
    val navigateUp: () -> Unit = {
        navController.navigateUp()
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
