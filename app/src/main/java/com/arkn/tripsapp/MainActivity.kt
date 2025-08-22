package com.arkn.tripsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arkn.tripsapp.ui.theme.TripsAppTheme
import com.arkn.tripsapp.ui.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TripsAppTheme {
                HomeView()
            }
        }
    }
}
