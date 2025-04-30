package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.repository

import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model.Restaurant

interface RestaurantRepository {
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun findRestaurantById(id: Int): Restaurant?
}