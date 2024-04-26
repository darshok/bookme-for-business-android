package com.app.business.bookme.ui.features.authentication.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.business.bookme.ui.BookmeScreen

fun NavGraphBuilder.signUpNavHost(navController: NavController) {
    navigation(
        startDestination = BookmeScreen.Authentication.SignUp.SignUpCredentials.route,
        route = BookmeScreen.Authentication.SignUp.route
    ) {
        composable(route = BookmeScreen.Authentication.SignUp.SignUpCredentials.route) {
            SignUpCredentials(
                onNextClick = { navController.navigate(BookmeScreen.Authentication.SignUp.SignUpDetails.route) },
                onBackPressed = { navController.navigateUp() })
        }
        composable(route = BookmeScreen.Authentication.SignUp.SignUpDetails.route) {
            SignUpDetails(onBackPressed = { navController.navigateUp() })
        }
    }
}