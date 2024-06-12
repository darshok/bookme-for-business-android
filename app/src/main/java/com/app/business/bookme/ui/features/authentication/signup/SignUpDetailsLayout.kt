package com.app.business.bookme.ui.features.authentication.signup

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
fun SignUpDetails(
    modifier: Modifier = Modifier,
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
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SignUpDetailsPreview() {
    BookmeTheme(dynamicColor = false) {
        SignUpDetails(Modifier, {})
    }
}
