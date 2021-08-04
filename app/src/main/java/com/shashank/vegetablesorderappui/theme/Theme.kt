package com.shashank.vegetablesorderappui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.shashank.vegetablesorderappui.theme.*

private val DarkColorPalette = darkColors(
    primary = black,
    onPrimary = white,
    primaryVariant = paleBlack
)

private val LightColorPalette = lightColors(
    primary = blue,
    onPrimary = black,
    primaryVariant = paleWhite
)

@Composable
fun VegetablesOrderAppUITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = Shapes,
        content = content
    )
}