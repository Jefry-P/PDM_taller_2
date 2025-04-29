package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.dummy.restaurants
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.model.Restaurant
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.components.RestaurantItem

@Composable
fun RestaurantListScreen(
    onRestaurantClick : (Int) -> Unit = {}
){
    val restaurants = restaurants //dummy data
    //val categories = listOf("Pizzas", "Mexican Food", "Chicken", "Italian", "Japanese", "Burgers")
    val categories = remember (restaurants) {
        restaurants.flatMap { it.categories }.distinct().sorted()
    }
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        itemsIndexed(categories)  { index, category ->
            // Filtramos los restaurantes por categoría
            val categoryRestaurants = restaurants.filter { categories.contains(category) }

            Column (modifier = Modifier.padding(vertical = 8.dp)) {
                // Título de la categoría
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                // LazyRow horizontal con los restaurantes de esta categoría
                LazyRow (
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    itemsIndexed(categoryRestaurants) { index, restaurant ->
                        RestaurantItem(restaurant, onRestaurantClick)
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun RestaurantListScreenPreview(){
//    RestaurantListScreen()
//}