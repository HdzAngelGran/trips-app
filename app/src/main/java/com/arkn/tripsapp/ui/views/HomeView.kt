package com.arkn.tripsapp.ui.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arkn.tripsapp.domian.models.LocationModel
import com.arkn.tripsapp.domian.models.TripModel
import com.arkn.tripsapp.ui.core.HomeTripCard
import com.arkn.tripsapp.ui.viewmodels.HomeViewModel

@Composable
fun HomeView(viewModel: HomeViewModel = HomeViewModel()) {
    val trips = remember { viewModel.trips }

    HomeViewContent(trips)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HomeViewContent(trips: List<TripModel>) {
    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = {},
                icon = { Icon(Icons.Filled.AddCircle, null)},
                text = { Text("Add Trip") }
            )
        },
        topBar = {
            TopAppBar(
                title = { Text("Home") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, null)
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(Modifier.fillMaxSize().padding(innerPadding).padding(horizontal = 16.dp)) {
            items(items = trips) { item -> HomeTripCard(modifier = Modifier.padding(vertical = 8.dp), trip = item) }
        }
    }
}

@Preview
@Composable
private fun HomeViewPreview() {
    HomeViewContent(listOf(
        TripModel(
            1,
            "CDMX",
            "México",
            LocationModel(
                latitude = 0.0,
                longitude = 0.0,
            ),
            "",
            "",
            "",
            ""
        ),
        TripModel(
            2,
            "Monterrey",
            "México",
            LocationModel(
                latitude = 0.0,
                longitude = 0.0,
            ),
            "",
            "",
            "",
            ""
        ),
        TripModel(
            3,
            "Tijuana",
            "México",
            LocationModel(
                latitude = 0.0,
                longitude = 0.0,
            ),
            "",
            "",
            "",
            ""
        )
    ))
}

