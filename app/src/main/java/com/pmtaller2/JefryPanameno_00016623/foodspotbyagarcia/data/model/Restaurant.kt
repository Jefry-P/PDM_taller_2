package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model

data class Restaurant(
    val id: Int = 0,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)
