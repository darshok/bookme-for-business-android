package com.app.business.bookme.ui.features.authentication.login

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.business.bookme.R
import com.app.business.bookme.ui.common.topappbar.LogInTopBar
import com.app.business.bookme.ui.theme.BookmeTheme

@Composable
fun LogInLayout(
    modifier: Modifier = Modifier,
    onBackPressed: () -> Unit,
) {
    Scaffold(topBar = { LogInTopBar(onBackPressed = onBackPressed) }) { contentPadding ->
        Surface(
            modifier = modifier
                .padding(contentPadding)
                .fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = if (isSystemInDarkTheme()) R.drawable.android_dark_rd_ctn else R.drawable.android_light_rd_ctn),
                    contentDescription = "Logo image",
                    Modifier.padding(vertical = 16.dp)
                )
                Text(
                    text = stringResource(id = R.string.log_in_with_or_without),
                    modifier = modifier.padding(vertical = 16.dp)
                )
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
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = stringResource(id = R.string.forgot_password),
                        color = MaterialTheme.colorScheme.primary
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    Modifier.padding(vertical = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                ) {
                    Text(text = stringResource(id = R.string.log_in_button))
                }
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LogInPreview() {
    BookmeTheme(dynamicColor = false) {
        LogInLayout(Modifier, {})
    }
}
