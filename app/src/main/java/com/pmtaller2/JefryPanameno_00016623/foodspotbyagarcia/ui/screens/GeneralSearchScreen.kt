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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.data.dummy.restaurants
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.components.RestaurantItem

@Composable
fun GeneralSearchScreen(
){
    Column {
        Text(text = "Search",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun RestaurantListScreenPreview(){
//    RestaurantListScreen()
//}