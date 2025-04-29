package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Tv
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
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
import com.agarcia.myfirstandroidapp.ui.navigations.MainNavigation
import com.agarcia.myfirstandroidapp.ui.navigations.RestaurantListScreenNavigation
import kotlinx.coroutines.launch

const val RestaurantListScreenNavigationId = "com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.navigations.RestaurantDetailScreenNavigation/{id}"
data class NavItem(val label: String, val icon: ImageVector, val route: String)

@Composable
fun CustomScaffold () {
  val navController = rememberNavController()
  val coroutineScope = rememberCoroutineScope()
  val snackbarHostState = remember { SnackbarHostState() }

  val currentDestination = navController
    .currentBackStackEntryAsState().value?.destination?.route

  var title by rememberSaveable { mutableStateOf("Listado") }
  var selectedItem by rememberSaveable { mutableStateOf("restaurantList") }

  val navItems = listOf(
    NavItem("Listado", Icons.Filled.Home, "restaurantList"),
    NavItem("Search", Icons.Filled.Search, "search"),
    NavItem("Mis ordenes", Icons.Filled.Search, "orders"),

  )


  fun onItemSelected(currentItem: String) {
    selectedItem = currentItem
    title = when (currentItem) {
      "search" -> "Busqueda"
      "orders" -> "Mis ordenes"
      else -> "Listado"
    }
    when (currentItem) {
      "search" -> navController.navigate(null)
      "orders" -> navController.navigate(null)
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