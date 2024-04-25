package com.app.business.bookme.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.business.bookme.ui.features.home.HomeLayout
import com.app.business.bookme.ui.features.registration.LogIn
import com.app.business.bookme.ui.features.registration.SignUp
import com.app.business.bookme.ui.features.registration.SignUpDetails
import com.app.business.bookme.ui.features.registration.Welcome
import com.app.business.bookme.ui.features.registration.login.LogInLayout
import com.app.business.bookme.ui.features.registration.signup.SignUpCredentials
import com.app.business.bookme.ui.features.registration.welcome.WelcomeLayout


@Composable
fun BookmeNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Home.route,
        modifier = modifier
    ) {
        composable(route = Home.route) {
            HomeLayout(onRequireRegistration = { navController.navigateSingleTopTo(Registration.route) })
        }
        navigation(startDestination = Welcome.route, route = Registration.route) {
            composable(route = Welcome.route) {
                WelcomeLayout(
                    onCreateAccountClick = { navController.navigate(SignUp.route) },
                    onLogInClick = { navController.navigate(LogIn.route) })
            }
            composable(route = LogIn.route) {
                LogInLayout()
            }
            navigation(startDestination = SignUpCredentials.route, route = SignUp.route) {
                composable(route = SignUpCredentials.route) {
                    SignUpCredentials(
                        onNextClick = { navController.navigate(SignUpDetails.route) },
                        onBackPressed = { navController.navigateUp() })
                }
            }
        }
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
