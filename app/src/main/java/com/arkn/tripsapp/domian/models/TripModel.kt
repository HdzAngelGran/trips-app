package com.arkn.tripsapp.domian.models

data class TripModel(
    val id: Long? = null,
    val name: String,
    val destination: String,
    val location: LocationModel,
    val notes: String,
    val coverImageUrl: String,
    val startDate: String,
    val endDate: String,
    val photosUris: List<String> = emptyList(),
)
