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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.dummy.restaurants
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.components.DishItem

@Composable
fun RestaurantDetailScreen(
    restaurantId: Int, modifier: Modifier = Modifier, viewModel: RestaurantDetailViewModel = viewModel()) {

    LaunchedEffect (restaurantId) {
        viewModel.loadRestaurantById(restaurantId)
    }
    val restaurant by viewModel.restaurant.collectAsState()
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
    restaurant?.let { res -> //ejecuta solo si la variable no es nula
        val filteredDishes = remember(searchQuery, res.menu) {
            if (searchQuery.isBlank()) {
                res.menu
            } else {
                res.menu.filter { dish ->
                    dish.name.contains(searchQuery, ignoreCase = true) ||
                            dish.description.contains(searchQuery, ignoreCase = true)
                }
            }
        }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = restaurant!!.name,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 20.dp)
        )

        // Barra de búsqueda
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            placeholder = { Text("Buscar platillos...") },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = "Buscar")
            },
            singleLine = true,
            shape = RoundedCornerShape(16.dp)
        )

        // Lista de platillos
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(filteredDishes) {index, dish ->
                DishItem(dish = dish)
            }
        }
    }
}
}