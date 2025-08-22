package com.arkn.tripsapp.data.local.database

import com.arkn.tripsapp.data.local.database.entities.TripEntity
import com.arkn.tripsapp.domian.models.LocationModel
import com.arkn.tripsapp.domian.models.TripModel

fun TripEntity.toDomainModel(): TripModel {
    return TripModel(
        id,
        name,
        destination,
        LocationModel(latitude ?: 0.0, longitude ?: 0.0),
        notes ?: "",
        "",
        startDate.toString(),
        endDate.toString(),
    )
}