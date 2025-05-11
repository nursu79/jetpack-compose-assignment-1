// Typography.kt
package com.example.courselist.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font as GoogleFontEntry
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.GoogleFont.Provider
import androidx.compose.ui.unit.sp
import com.example.courselist.R

// Google Fonts provider configuration
private val fontProvider = Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// Define Google Font families
private val manrope = GoogleFont("Manrope")
private val inter = GoogleFont("Inter")

private val manropeFamily = FontFamily(
    GoogleFontEntry(googleFont = manrope, fontProvider = fontProvider, weight = FontWeight.Normal),
    GoogleFontEntry(googleFont = manrope, fontProvider = fontProvider, weight = FontWeight.Medium),
    GoogleFontEntry(googleFont = manrope, fontProvider = fontProvider, weight = FontWeight.SemiBold),
    GoogleFontEntry(googleFont = manrope, fontProvider = fontProvider, weight = FontWeight.Bold)
)

private val interFamily = FontFamily(
    GoogleFontEntry(googleFont = inter, fontProvider = fontProvider, weight = FontWeight.Normal),
    GoogleFontEntry(googleFont = inter, fontProvider = fontProvider, weight = FontWeight.Medium),
    GoogleFontEntry(googleFont = inter, fontProvider = fontProvider, weight = FontWeight.Bold)
)

val ModernTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Light,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Light,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    titleLarge = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    titleMedium = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    labelLarge = TextStyle(
        fontFamily = manropeFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
)
