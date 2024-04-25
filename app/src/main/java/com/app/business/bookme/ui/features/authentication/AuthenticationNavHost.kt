package com.app.business.bookme.ui.features.authentication

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.business.bookme.ui.LogIn
import com.app.business.bookme.ui.SignUp
import com.app.business.bookme.ui.Welcome
import com.app.business.bookme.ui.features.authentication.login.LogInLayout
import com.app.business.bookme.ui.features.authentication.signup.SignUpLayout
import com.app.business.bookme.ui.features.authentication.welcome.WelcomeLayout

@Composable
fun AuthenticationNavHost(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Welcome.route,
        modifier = modifier
    ) {
        composable(route = Welcome.route) {
            WelcomeLayout(
                onCreateAccountClick = { navController.navigate(SignUp.route) },
                onLogInClick = { navController.navigate(LogIn.route) })
        }
        composable(route = LogIn.route) {
            LogInLayout()
        }
        composable(route = SignUp.route) {
            SignUpLayout {
                navController.navigateUp()
            }
        }
    }
}