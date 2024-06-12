package com.app.business.bookme.ui.features.authentication

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.business.bookme.ui.BookmeScreen
import com.app.business.bookme.ui.features.authentication.login.LogInLayout
import com.app.business.bookme.ui.features.authentication.signup.signUpNavHost
import com.app.business.bookme.ui.features.authentication.welcome.WelcomeLayout

fun NavGraphBuilder.authenticationNavHost(navController: NavController) {
    navigation(
        startDestination = BookmeScreen.Authentication.Welcome.route,
        route = BookmeScreen.Authentication.route
    ) {
        composable(route = BookmeScreen.Authentication.Welcome.route) {
            WelcomeLayout(
                onCreateAccountClick = { navController.navigate(BookmeScreen.Authentication.SignUp.route) },
                onLogInClick = { navController.navigate(BookmeScreen.Authentication.LogIn.route) })
        }
        composable(route = BookmeScreen.Authentication.LogIn.route) {
            LogInLayout(onBackPressed = { navController.navigateUp() })
        }
        signUpNavHost(navController)
    }
}