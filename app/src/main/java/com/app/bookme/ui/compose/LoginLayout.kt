package com.app.bookme.ui.compose

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.bookme.R
import com.app.bookme.ui.theme.BookmeTheme

@Composable
fun LoginLayout() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo image",
                Modifier.padding(vertical = 16.dp)
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
                Text(text = stringResource(id = R.string.forgot_password), color = MaterialTheme.colorScheme.primary)
            }
            Button(
                onClick = { /*TODO*/ },
                Modifier.padding(vertical = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            ) {
                Text(text = stringResource(id = R.string.login_button))
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreview() {
    BookmeTheme {
        LoginLayout()
    }
}
