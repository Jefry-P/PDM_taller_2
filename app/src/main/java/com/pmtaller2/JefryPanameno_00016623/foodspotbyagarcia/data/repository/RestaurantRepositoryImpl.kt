package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.repository

import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.dummy.restaurants
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model.Restaurant
import kotlinx.coroutines.delay

class RestaurantRepositoryImpl: RestaurantRepository {
    override suspend fun getRestaurants(): List<Restaurant> {
        delay(1000)
        return restaurants
    }

    override suspend fun findRestaurantById(id: Int): Restaurant? {
        delay(1000)
        return restaurants.first { it.id == id }
    }
}