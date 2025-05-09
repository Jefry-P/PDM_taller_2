package com.agarcia.myfirstandroidapp.ui.layout

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(
  title: String = "¡Qué Peli!",
  showBackButton: Boolean = false,
  onBackClick: () -> Unit = {}
) {
  TopAppBar(
    title = { Text(text = title) },
    navigationIcon = {
      if (showBackButton) {
        IconButton(onClick = onBackClick) {
          Icon(
            imageVector = Icons.Filled.ArrowBackIosNew,
            contentDescription = "Volver"
          )
        }
      } else {
        IconButton(onClick = {  }) {
          Icon(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Menú"
          )
        }
      }
    },
    colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.secondaryContainer, titleContentColor = MaterialTheme.colorScheme.secondary),
    actions = {
    },
//    colors = TopAppBarDefaults.topAppBarColors(
//      containerColor = MaterialTheme.colorScheme.primary,
//      titleContentColor = Color.Black,
//      actionIconContentColor = Color.Black,
//      navigationIconContentColor = Color.Black,
//    )
  )
}
