package com.arkn.tripsapp.domian.contracts

import com.arkn.tripsapp.domian.models.DomainResponse
import com.arkn.tripsapp.domian.models.TripModel

interface ITripRepository {
    suspend fun getAll(): DomainResponse<List<TripModel>>
}