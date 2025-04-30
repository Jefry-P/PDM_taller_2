package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.components.RestaurantItem

@Composable
fun GeneralSearchScreen( modifier: Modifier = Modifier, viewModel : GeneralSearchViewModel = viewModel(),
                         onRestaurantClick: (Int) -> Unit
){
    //view model implementation
    val restaurants by viewModel.restaurants.collectAsState()
    val loading by viewModel.loading.collectAsState()
    if(loading) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator()
        }
    }

    var searchQuery by remember { mutableStateOf("") }
    val filteredRestaurants = remember(searchQuery, restaurants) {
        if (searchQuery.isBlank()) {
            restaurants
        } else {
            val query = searchQuery.lowercase()

            restaurants.filter { restaurant ->
                // Nombre del restaurante
                restaurant.name.lowercase().contains(query)
                        // Categorías
                        || restaurant.categories.any { it.lowercase().contains(query) }
                        // Nombre o descripción de platillos
                        || restaurant.menu.any { dish ->
                    dish.name.lowercase().contains(query) ||
                            dish.description.lowercase().contains(query)
                }
            }
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            placeholder = { Text("Buscar restaurantes o platillos...") },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Buscar")
            },
            singleLine = true,
            shape = RoundedCornerShape(16.dp)
        )

        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            itemsIndexed(filteredRestaurants) {index, restaurant ->
                RestaurantItem(
                    restaurant = restaurant,
                    onRestaurantClick = { onRestaurantClick(restaurant.id) }
                )
            }

            if (filteredRestaurants.isEmpty()) {
                if(!loading){
                    item {
                        Text(
                            text = "No results.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Gray,
                            modifier = Modifier.padding(top = 16.dp)
                        )
                    }
                }

            }
        }
    }
}

