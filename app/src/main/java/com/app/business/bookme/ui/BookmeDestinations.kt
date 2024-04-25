package com.app.business.bookme.ui

interface BookmeDestination {
    val route: String
}

object Home : BookmeDestination {
    override val route = "home"
}

object Registration : BookmeDestination {
    override val route = "registration"
}

object LogIn : BookmeDestination {
    override val route = "log_in"
}

object SignUp : BookmeDestination {
    override val route = "sign_up"
}

object SignUpCredentials : BookmeDestination {
    override val route = "sign_up_credentials"
}

object SignUpDetails : BookmeDestination {
    override val route = "sign_up_details"
}

object Welcome : BookmeDestination {
    override val route = "welcome"
}