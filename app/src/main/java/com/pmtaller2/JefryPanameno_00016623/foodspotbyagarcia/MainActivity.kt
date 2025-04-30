package com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.layout.CustomScaffold
import com.pmtaller2.JefryPanameno_00016623.foodspotbyagarcia.ui.theme.FoodSpotByAgarciaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByAgarciaTheme {
                CustomScaffold()
            }
        }
    }
}
