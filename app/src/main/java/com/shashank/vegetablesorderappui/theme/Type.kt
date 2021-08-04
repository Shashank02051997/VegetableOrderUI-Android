package com.shashank.vegetablesorderappui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.shashank.vegetablesorderappui.R

private val dmSans = FontFamily(
    Font(R.font.dmsansregular),
    Font(R.font.dmsansmedium, FontWeight.W500),
    Font(R.font.dmsansbold, FontWeight.Bold)
)


val typography = Typography(defaultFontFamily = dmSans)
