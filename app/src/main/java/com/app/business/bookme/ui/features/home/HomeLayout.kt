package com.app.business.bookme.ui.features.home

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.app.business.bookme.ui.theme.BookmeTheme

@Composable
fun HomeLayout(onRequireAuthentication: () -> Unit) {
    // TODO: Check whether user exists, if not then navigate to log in
    onRequireAuthentication.invoke()
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomePreview() {
    BookmeTheme(dynamicColor = false) {
        HomeLayout {}
    }
}
