package com.app.business.bookme.ui

sealed class BookmeScreen(val route: String) {

    object Home : BookmeScreen("home")

    object Authentication : BookmeScreen("authentication") {
        object Welcome : BookmeScreen("welcome")
        object LogIn : BookmeScreen("log_in")
        object SignUp : BookmeScreen("sign_up") {
            object SignUpCredentials : BookmeScreen("sign_up_credentials")
            object SignUpDetails : BookmeScreen("sign_up_details")
        }
    }

}