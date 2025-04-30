package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.agarcia.myfirstandroidapp.ui.layout.CustomBottomBar
import com.agarcia.myfirstandroidapp.ui.layout.CustomTopBar
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.navigation.GeneralSearchScreenNavigation
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.navigation.MainNavigation
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.navigation.MyOrdersScreenNavigation
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.navigation.RestaurantListScreenNavigation

const val RestaurantListScreenNavigationId = "com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.navigation.RestaurantDetailScreenNavigation/{id}"
data class NavItem(val label: String, val icon: ImageVector, val route: String)

@Composable
fun CustomScaffold () {
  val navController = rememberNavController()

  val currentDestination = navController
    .currentBackStackEntryAsState().value?.destination?.route

  var title by rememberSaveable { mutableStateOf("FoodSpot") }
  var selectedItem by rememberSaveable { mutableStateOf("restaurantList") }

  val navItems = listOf(
    NavItem("FoodSpot", Icons.Filled.Home, "restaurantList"),
    NavItem("Search", Icons.Filled.Search, "search"),
    NavItem("My orders", Icons.Filled.Fastfood, "orders"),
  )

  fun onItemSelected(currentItem: String) {
    selectedItem = currentItem
    title = when (currentItem) {
      "search" -> "Search restaurants"
      "orders" -> "My orders"
      else -> "FoodSpot"
    }
    when (currentItem) {
      "search" -> navController.navigate(GeneralSearchScreenNavigation)
      "orders" -> navController.navigate(MyOrdersScreenNavigation)
      else -> navController.navigate(RestaurantListScreenNavigation)
    }
  }

  Scaffold(
    topBar = {
      CustomTopBar(
        title = title,
        showBackButton = currentDestination == RestaurantListScreenNavigationId,
        onBackClick = { navController.popBackStack() },
      )
    },
    bottomBar = {
      CustomBottomBar(
        navItems = navItems,
        selectedItem = selectedItem,
        onItemSelected = { onItemSelected(it) }
      )
    },
    ) { innerPadding ->
    Column (
      modifier = Modifier.padding(innerPadding).fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      MainNavigation(navController = navController)
    }
  }
}

@Preview(showBackground = true)
@Composable
fun CustomScaffoldPreview() {
  CustomScaffold()
}