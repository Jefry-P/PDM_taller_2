package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.components.RestaurantItem

@Composable
fun RestaurantListScreen(
    onRestaurantClick : (Int) -> Unit = {},viewModel : RestaurantListViewModel = viewModel()
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
            val categoryRestaurants = restaurants.filter { it.categories.contains(category) }
            val isSingleItem = categoryRestaurants.size == 1
            Column (modifier = Modifier.padding(vertical = 12.dp).fillMaxWidth()) {
                // Título de la categoría
                Text(
                    text = category,
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 8.dp).fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(6.dp))
                // LazyRow horizontal con los restaurantes de esta categoría
                if (categoryRestaurants.isEmpty()) {
                    Text(
                        text = "No restaurants available for this category",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Gray,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(start = 8.dp).fillMaxWidth()
                    )
                } else {
                    LazyRow(
                        horizontalArrangement = if (isSingleItem) Arrangement.Center else Arrangement.spacedBy(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        itemsIndexed(categoryRestaurants) { index, restaurant ->
                            RestaurantItem(restaurant, onRestaurantClick)
                        }
                    }
                }


            }
            if (index < categories.lastIndex) {
                HorizontalDivider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(vertical = 16.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun RestaurantListScreenPreview(){
//    RestaurantListScreen()
//}