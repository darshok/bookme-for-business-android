package com.app.business.bookme.ui.signup

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
fun SignUpLayout() {
    Scaffold(topBar = { SignUpTopBar() }) { contentPadding ->
        SignUpContent(Modifier.padding(top = contentPadding.calculateTopPadding()))
    }
}

@Composable
fun SignUpContent(
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
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
                onClick = { /*TODO*/ },
                Modifier.padding(vertical = 16.dp),
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

@Composable
fun SignUpDetails() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(
                    text = stringResource(id = R.string.name_label)
                )
            })
            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(
                    text = stringResource(id = R.string.surname_label)
                )
            })
            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(
                    text = stringResource(id = R.string.birth_date_label)
                )
            })
            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(
                    text = stringResource(id = R.string.location_label)
                )
            })
            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text(
                    text = stringResource(id = R.string.phone_label)
                )
            })
            Button(
                onClick = { /*TODO*/ },
                Modifier.padding(vertical = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            ) {
                Text(text = stringResource(id = R.string.create_button))
            }
        }
    }
}

@Composable
fun SignUpTopBar() {

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SignUpPreview() {
    BookmeTheme(dynamicColor = false) {
        SignUpLayout()
    }
}
