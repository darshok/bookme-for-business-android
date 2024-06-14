package com.app.business.bookme.ui.features.authentication

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.business.bookme.ui.common.navigation.BookmeScreen
import com.app.business.bookme.ui.common.navigation.NavigationActions
import com.app.business.bookme.ui.features.authentication.login.LogInLayout
import com.app.business.bookme.ui.features.authentication.signup.signUpNavHost
import com.app.business.bookme.ui.features.authentication.welcome.WelcomeLayout

fun NavGraphBuilder.authenticationNavHost(
    navigationActions: NavigationActions,
) {
    navigation(
        startDestination = BookmeScreen.Authentication.Welcome.route,
        route = BookmeScreen.Authentication.route
    ) {
        composable(route = BookmeScreen.Authentication.Welcome.route) {
            WelcomeLayout(
                onCreateAccountClick = { navigationActions.navigateToSignUp() },
                onLogInClick = { navigationActions.navigateToLogIn() })
        }
        composable(route = BookmeScreen.Authentication.LogIn.route) {
            LogInLayout(onBackPressed = { navigationActions.navigateUp() })
        }
        signUpNavHost(navigationActions)
    }
}