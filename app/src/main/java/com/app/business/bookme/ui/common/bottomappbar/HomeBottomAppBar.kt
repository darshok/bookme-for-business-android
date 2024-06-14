package com.app.business.bookme.ui.common.bottomappbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.TravelExplore
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.app.business.bookme.ui.common.navigation.BookmeScreen

@Composable
fun HomeBottomBar(currentDestination: String) {
    BottomAppBar {
        NavigationBarItem(
            selected = isCurrentDestinationSelected(
                currentDestination,
                BookmeScreen.Home.Discover.route
            ),
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Outlined.TravelExplore, contentDescription = "Explore") })
        NavigationBarItem(
            selected = isCurrentDestinationSelected(
                currentDestination,
                BookmeScreen.Home.Booking.route
            ),
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Outlined.CalendarToday, contentDescription = "Booking") })
        NavigationBarItem(
            selected = isCurrentDestinationSelected(
                currentDestination,
                BookmeScreen.Home.Profile.route
            ),
            onClick = { /*TODO*/ },
            icon = { Icon(Icons.Outlined.Person, contentDescription = "Profile") })
    }
}

private fun isCurrentDestinationSelected(currentDestination: String, destination: String) =
    currentDestination == destination


@Preview
@Composable
fun HomeBottomBarPreview() {
    HomeBottomBar(currentDestination = BookmeScreen.Home.Discover.route)
}