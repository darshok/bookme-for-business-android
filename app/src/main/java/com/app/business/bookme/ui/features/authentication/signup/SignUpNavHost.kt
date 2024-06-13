package com.app.business.bookme.ui.features.authentication.signup

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.business.bookme.ui.common.navigation.BookmeScreen
import com.app.business.bookme.ui.common.navigation.NavigationActions

fun NavGraphBuilder.signUpNavHost(navigationActions: NavigationActions) {
    navigation(
        startDestination = BookmeScreen.Authentication.SignUp.SignUpCredentials.route,
        route = BookmeScreen.Authentication.SignUp.route
    ) {
        composable(route = BookmeScreen.Authentication.SignUp.SignUpCredentials.route) {
            SignUpCredentials(
                onNextClick = { navigationActions.navigateToSignUpDetails() },
                onBackPressed = { navigationActions.navigateUp() })
        }
        composable(route = BookmeScreen.Authentication.SignUp.SignUpDetails.route) {
            SignUpDetails(onBackPressed = { navigationActions.navigateUp() })
        }
    }
}