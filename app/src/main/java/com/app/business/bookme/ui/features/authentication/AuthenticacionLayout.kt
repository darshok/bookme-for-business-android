package com.app.business.bookme.ui.features.authentication

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AuthenticationLayout() {
    Scaffold(topBar = {}) { contentPadding ->
        AuthenticationNavHost(modifier = Modifier.padding(contentPadding))
    }
}
