package com.shashank.vegetablesorderappui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.shashank.vegetablesorderappui.navigation.NavGraph
import com.shashank.vegetablesorderappui.theme.VegetablesOrderAppUITheme

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VegetablesOrderAppUIMain()
        }
    }

    @Composable
    fun VegetablesOrderAppUIMain() {

        VegetablesOrderAppUITheme {
            Surface(color = MaterialTheme.colors.background) {
                NavGraph()
            }
        }

    }
}
