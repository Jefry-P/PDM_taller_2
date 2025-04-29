package com.agarcia.myfirstandroidapp.ui.navigations

import kotlinx.serialization.Serializable

@Serializable
object RestaurantListScreenNavigation

@Serializable
data class RestaurantDetailScreenNavigation(val id: Int)