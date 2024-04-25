package com.app.business.bookme.ui.features.authentication.signup

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.business.bookme.ui.SignUpCredentials
import com.app.business.bookme.ui.SignUpDetails

@Composable
fun SignUpNavHost(modifier: Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = SignUpCredentials.route,
        modifier = modifier
    ) {
        composable(route = SignUpCredentials.route) {
            SignUpCredentials(onNextClick = { navController.navigate(SignUpDetails.route) })
        }
        composable(route = SignUpDetails.route) {
            SignUpDetails()
        }
    }
}