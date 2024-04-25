package com.app.business.bookme.ui

interface BookmeDestination {
    val route: String
}

// NavHost Routes
object SignUp : BookmeDestination {
    override val route = "sign_up"
}
object Authentication : BookmeDestination {
    override val route = "authentication"
}

// Screen Routes
object Home : BookmeDestination {
    override val route = "home"
}

object LogIn : BookmeDestination {
    override val route = "log_in"
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