package com.arkn.tripsapp.data.local.repository

import com.arkn.tripsapp.domian.contracts.ITripRepository
import com.arkn.tripsapp.domian.models.DomainResponse
import com.arkn.tripsapp.domian.models.LocationModel
import com.arkn.tripsapp.domian.models.TripModel

class SuccessMockDataTripRepository: ITripRepository {
    override suspend fun getAll(): DomainResponse<List<TripModel>> {
        return DomainResponse.Success(
            listOf(
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
            )
        )
    }
}