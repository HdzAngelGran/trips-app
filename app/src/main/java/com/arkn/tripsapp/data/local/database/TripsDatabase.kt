package com.arkn.tripsapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.arkn.tripsapp.data.local.database.converters.DateConverter
import com.arkn.tripsapp.data.local.database.daos.TripDao
import com.arkn.tripsapp.data.local.database.entities.PhotoEntity
import com.arkn.tripsapp.data.local.database.entities.TripEntity
import com.arkn.tripsapp.data.local.database.entities.TripPhotoEntity

@Database(
    entities = [
        TripEntity::class,
        PhotoEntity::class,
        TripPhotoEntity::class,
    ],
    version = 1,
    exportSchema = true,
)
@TypeConverters(DateConverter::class)
abstract class TripsDatabase: RoomDatabase() {
    abstract class tripDao(): TripDao
}