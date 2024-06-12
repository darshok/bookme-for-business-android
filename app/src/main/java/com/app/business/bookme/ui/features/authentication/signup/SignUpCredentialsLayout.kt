package com.app.business.bookme.ui.features.authentication.signup

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.business.bookme.R
import com.app.business.bookme.ui.theme.BookmeTheme

@Composable
fun SignUpCredentials(
    modifier: Modifier = Modifier,
    onNextClick: () -> Unit,
    onBackPressed: () -> Unit,
) {
    Scaffold(topBar = { SignUpTopBar(onBackPressed = onBackPressed) }) { contentPadding ->
        Surface(
            modifier = modifier
                .padding(contentPadding)
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.padding(top = 16.dp)
            ) {
                OutlinedTextField(value = "", onValueChange = {}, label = {
                    Text(
                        text = stringResource(id = R.string.user_label)
                    )
                })
                OutlinedTextField(value = "", onValueChange = {}, label = {
                    Text(
                        text = stringResource(id = R.string.password_label)
                    )
                })
                OutlinedTextField(value = "", onValueChange = {}, label = {
                    Text(
                        text = stringResource(id = R.string.email_label)
                    )
                })
                Button(
                    onClick = onNextClick,
                    modifier = Modifier.padding(vertical = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                ) {
                    Text(text = stringResource(id = R.string.common_next))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpTopBar(onBackPressed: () -> Unit) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
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

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SignUpPreview() {
    BookmeTheme(dynamicColor = false) {
        SignUpCredentials(Modifier, {}, {})
    }
}
