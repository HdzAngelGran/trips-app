package com.arkn.tripsapp.data.local.database.daos

import androidx.room.Dao
import androidx.room.Query
import com.arkn.tripsapp.data.local.database.entities.TripEntity

@Dao
interface TripDao {

    @Query("SELECT * FROM trips ORDER BY id")
    suspend fun getAll(): List<TripEntity>

}