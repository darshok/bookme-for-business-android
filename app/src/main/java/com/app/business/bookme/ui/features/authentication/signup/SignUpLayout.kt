package com.app.business.bookme.ui.features.authentication.signup

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.app.business.bookme.R

@Composable
fun SignUpLayout(onBackPressed: () -> Unit) {
    Scaffold(topBar = { SignUpTopBar(onBackPressed = onBackPressed) }) { contentPadding ->
        SignUpNavHost(modifier = Modifier.padding(contentPadding))
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpTopBar(onBackPressed: () -> Unit) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text(stringResource(id = R.string.create_account_button))
        },
        navigationIcon = {
            IconButton(
                onClick = onBackPressed,
                colors = IconButtonDefaults.iconButtonColors(contentColor = MaterialTheme.colorScheme.primary)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }
        },
    )
}