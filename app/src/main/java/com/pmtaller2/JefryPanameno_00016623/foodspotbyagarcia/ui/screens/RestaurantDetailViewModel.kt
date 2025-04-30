package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model.Restaurant
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.repository.RestaurantRepository
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.repository.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RestaurantDetailViewModel: ViewModel() {
    val restaurantRepository: RestaurantRepository = RestaurantRepositoryImpl()
    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant: StateFlow<Restaurant?> = _restaurant

    private val _loading = MutableStateFlow(false)
    val loading: StateFlow<Boolean> = _loading


    fun loadRestaurantById(id: Int) {
        viewModelScope.launch {
            _loading.value = true
            val result = restaurantRepository.findRestaurantById(id)
            _restaurant.value = result
            _loading.value = false
        }
    }
}