package com.arkn.tripsapp.data.local.repository

import com.arkn.tripsapp.data.local.database.daos.TripDao
import com.arkn.tripsapp.data.local.database.toDomainModel
import com.arkn.tripsapp.domian.contracts.ITripRepository
import com.arkn.tripsapp.domian.models.DomainResponse
import com.arkn.tripsapp.domian.models.TripModel

class DatabaseTripRepository(private val tripDao: TripDao): ITripRepository {
    override suspend fun getAll(): DomainResponse<List<TripModel>> {
        try {
            val trips = tripDao.getAll()
            return DomainResponse.Success(trips.map { tripEntity -> tripEntity.toDomainModel() })
        } catch (e: Exception) {
            return DomainResponse.Error("Error fetching trips: ${e.message}", 500)
        }
    }
}