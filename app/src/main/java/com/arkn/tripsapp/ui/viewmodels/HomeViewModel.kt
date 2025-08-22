package com.arkn.tripsapp.ui.viewmodels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arkn.tripsapp.data.local.repository.SuccessMockDataTripRepository
import com.arkn.tripsapp.domian.contracts.ITripRepository
import com.arkn.tripsapp.domian.models.DomainResponse
import com.arkn.tripsapp.domian.models.TripModel
import kotlinx.coroutines.launch

class HomeViewModel(
    private val tripRepository: ITripRepository = SuccessMockDataTripRepository()
): ViewModel() {
    private val _trips = mutableStateListOf<TripModel>()
    val trips: List<TripModel> get() = _trips

    init {

        viewModelScope.launch {
            val response = tripRepository.getAll()

            when(response) {
                is DomainResponse.Success -> {
                    _trips.clear()
                    _trips.addAll(response.data)
                }
                is DomainResponse.Error -> {
                    println(response.message)
                }
            }
        }
    }

    fun loadTrips() {
        viewModelScope.launch { tripRepository.getAll() }
    }

}