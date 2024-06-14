package com.app.business.bookme.ui.features.home

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Mic
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.business.bookme.R
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
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    SearchTextField(Modifier.weight(1f))
                }
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
}

@Composable
fun SearchTextField(modifier: Modifier) {
    TextField(
        modifier = modifier,
        label = { Text(text = stringResource(id = R.string.search_hint)) },
        value = "",
        leadingIcon = {
            Icon(
                Icons.Outlined.Search,
                contentDescription = "Search icon"
            )
        },
        trailingIcon = {
            Icon(Icons.Outlined.Mic, contentDescription = "Mic icon")
        },
        shape = RoundedCornerShape(16.dp),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        onValueChange = {})
    Icon(Icons.AutoMirrored.Filled.List, contentDescription = "List icon")
    Icon(Icons.Outlined.LocationOn, contentDescription = "Location icon")
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomePreview() {
    BookmeTheme(dynamicColor = false) {
        HomeLayout({}, BookmeScreen.Home.Booking.route)
    }
}