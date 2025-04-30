package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model.Restaurant
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.repository.RestaurantRepository
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.repository.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GeneralSearchViewModel: ViewModel() {
    val restaurantRepository: RestaurantRepository = RestaurantRepositoryImpl()
    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurants: StateFlow<List<Restaurant>> = _restaurants

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading : StateFlow<Boolean> = _loading

    init {
        loadRestaurants()
    }

    fun loadRestaurants(){
        viewModelScope.launch {
            _loading.value = true
            _restaurants.value = restaurantRepository.getRestaurants();
            _loading.value = false
        }
    }
}