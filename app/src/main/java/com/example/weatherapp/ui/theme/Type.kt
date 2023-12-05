package com.example.weatherapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R

// Set of Material typography styles to start with
val PublicSansLight = FontFamily(Font(R.font.publicsans_light))
val PublicSansRegular = FontFamily(Font(R.font.publicsans_regular))
val PublicSansBold = FontFamily(Font(R.font.publicsans_bold))

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = PublicSansBold,
        fontSize = 88.sp,
        letterSpacing = 0.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily = PublicSansBold,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = PublicSansLight,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = PublicSansBold,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontFamily = PublicSansRegular,
        fontSize = 10.sp,
        letterSpacing = 0.sp
    )
)