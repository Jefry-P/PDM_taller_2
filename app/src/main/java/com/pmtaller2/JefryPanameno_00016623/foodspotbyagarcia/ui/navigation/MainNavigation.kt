package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens.GeneralSearchScreen
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens.MyOrdersScreen
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens.RestaurantDetailScreen
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.screens.RestaurantListScreen

@Composable
fun MainNavigation(navController: NavHostController) {
  val onRestaurantClick = { restaurantId: Int ->
    navController.navigate(RestaurantDetailScreenNavigation(restaurantId))
  }

  NavHost(navController = navController, startDestination = RestaurantListScreenNavigation) {
    composable <RestaurantListScreenNavigation> {
      RestaurantListScreen(onRestaurantClick)
    }
    composable <RestaurantDetailScreenNavigation> { backStackEntry ->
      val restaurantId = backStackEntry.arguments?.getInt("id") ?: 0
      RestaurantDetailScreen(restaurantId = restaurantId)
    }

    composable<MyOrdersScreenNavigation> {
      MyOrdersScreen()
    }

    composable<GeneralSearchScreenNavigation> {
      GeneralSearchScreen(onRestaurantClick = onRestaurantClick)
    }
  }
}