package com.app.business.bookme.ui.features.home

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.business.bookme.ui.common.bottomappbar.HomeBottomBar
import com.app.business.bookme.ui.common.carditem.BusinessCardItem
import com.app.business.bookme.ui.common.navigation.BookmeScreen
import com.app.business.bookme.ui.common.topappbar.HomeTopBar
import com.app.business.bookme.ui.theme.BookmeTheme

@Composable
fun HomeLayout(
    onRequireAuthentication: () -> Unit,
    currentDestination: String,
) {
    // TODO: Check whether user exists, if not then navigate to log in
//    onRequireAuthentication.invoke()
    Scaffold(
        topBar = { HomeTopBar() },
        bottomBar = { HomeBottomBar(currentDestination) }) { paddingValues ->
        Surface(modifier = Modifier.padding(paddingValues)) {
            LazyColumn(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(10) {
                    BusinessCardItem()
                }
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomePreview() {
    BookmeTheme(dynamicColor = false) {
        HomeLayout({}, BookmeScreen.Home.Booking.route)
    }
}