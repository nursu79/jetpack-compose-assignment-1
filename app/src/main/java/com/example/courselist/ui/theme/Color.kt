// Color.kt
package com.example.courselist.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Light theme base colors (unchanged)
val md_theme_light_primary = Color(0xFF006C4E)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_primaryContainer = Color(0xFF8CF8C8)
val md_theme_light_onPrimaryContainer = Color(0xFF002116)
val md_theme_light_secondary = Color(0xFF4D6357)
val md_theme_light_onSecondary = Color(0xFFFFFFFF)
val md_theme_light_secondaryContainer = Color(0xFFCFE9D8)
val md_theme_light_onSecondaryContainer = Color(0xFF0A1F16)
val md_theme_light_tertiary = Color(0xFF3D6373)
val md_theme_light_onTertiary = Color(0xFFFFFFFF)
val md_theme_light_tertiaryContainer = Color(0xFFC1E8FB)
val md_theme_light_onTertiaryContainer = Color(0xFF001F2A)
val md_theme_light_error = Color(0xFFBA1A1A)
val md_theme_light_errorContainer = Color(0xFFFFDAD6)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_onErrorContainer = Color(0xFF410002)
val md_theme_light_background = Color(0xFFFBFDF9)
val md_theme_light_onBackground = Color(0xFF191C1A)
val md_theme_light_surface = Color(0xFFFBFDF9)
val md_theme_light_onSurface = Color(0xFF191C1A)
val md_theme_light_surfaceVariant = Color(0xFFDCE5DD)
val md_theme_light_onSurfaceVariant = Color(0xFF404943)
val md_theme_light_outline = Color(0xFF707973)
val md_theme_light_inverseOnSurface = Color(0xFFEFF1ED)
val md_theme_light_inverseSurface = Color(0xFF2E312F)
val md_theme_light_inversePrimary = Color(0xFF6FDBAD)
val md_theme_light_surfaceTint = Color(0xFF006C4E)

// Dark theme base colors (unchanged)
val md_theme_dark_primary = Color(0xFF6FDBAD)
val md_theme_dark_onPrimary = Color(0xFF003828)
val md_theme_dark_primaryContainer = Color(0xFF00513B)
val md_theme_dark_onPrimaryContainer = Color(0xFF8CF8C8)
val md_theme_dark_secondary = Color(0xFFB3CCBD)
val md_theme_dark_onSecondary = Color(0xFF1F352A)
val md_theme_dark_secondaryContainer = Color(0xFF364B40)
val md_theme_dark_onSecondaryContainer = Color(0xFFCFE9D8)
val md_theme_dark_tertiary = Color(0xFFA5CCE0)
val md_theme_dark_onTertiary = Color(0xFF073544)
val md_theme_dark_tertiaryContainer = Color(0xFF244C5C)
val md_theme_dark_onTertiaryContainer = Color(0xFFC1E8FB)
val md_theme_dark_error = Color(0xFFFFB4AB)
val md_theme_dark_errorContainer = Color(0xFF93000A)
val md_theme_dark_onError = Color(0xFF690005)
val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
val md_theme_dark_background = Color(0xFF191C1A)
val md_theme_dark_onBackground = Color(0xFFE1E3DF)
val md_theme_dark_surface = Color(0xFF191C1A)
val md_theme_dark_onSurface = Color(0xFFE1E3DF)
val md_theme_dark_surfaceVariant = Color(0xFF404943)
val md_theme_dark_onSurfaceVariant = Color(0xFFC0C9C1)
val md_theme_dark_outline = Color(0xFF8A938C)
val md_theme_dark_inverseOnSurface = Color(0xFF191C1A)
val md_theme_dark_inverseSurface = Color(0xFFE1E3DF)
val md_theme_dark_inversePrimary = Color(0xFF006C4E)
val md_theme_dark_surfaceTint = Color(0xFF6FDBAD)

/**
 * Vibrant teal-accented light scheme:
 *  • Primary ← tertiary (teal)
 *  • Secondary ← primary (green)
 *  • Tertiary ← secondary (gray-green)
 */
val LightColorScheme = lightColorScheme(
    primary = md_theme_light_tertiary,
    onPrimary = md_theme_light_onTertiary,
    primaryContainer = md_theme_light_tertiaryContainer,
    onPrimaryContainer = md_theme_light_onTertiaryContainer,

    secondary = md_theme_light_primary,
    onSecondary = md_theme_light_onPrimary,
    secondaryContainer = md_theme_light_primaryContainer,
    onSecondaryContainer = md_theme_light_onPrimaryContainer,

    tertiary = md_theme_light_secondary,
    onTertiary = md_theme_light_onSecondary,
    tertiaryContainer = md_theme_light_secondaryContainer,
    onTertiaryContainer = md_theme_light_onSecondaryContainer,

    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,

    error = md_theme_light_error,
    onError = md_theme_light_onError,

    outline = md_theme_light_outline,
    inverseSurface = md_theme_light_inverseSurface,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    surfaceTint = md_theme_light_surfaceTint
)

/**
 * Vibrant teal-accented dark scheme:
 *  • Primary ← tertiary (muted teal)
 *  • Secondary ← primary (bright green)
 *  • Tertiary ← secondary (lighter gray-green)
 */
val DarkColorScheme = darkColorScheme(
    primary = md_theme_dark_tertiary,
    onPrimary = md_theme_dark_onTertiary,
    primaryContainer = md_theme_dark_tertiaryContainer,
    onPrimaryContainer = md_theme_dark_onTertiaryContainer,

    secondary = md_theme_dark_primary,
    onSecondary = md_theme_dark_onPrimary,
    secondaryContainer = md_theme_dark_primaryContainer,
    onSecondaryContainer = md_theme_dark_onPrimaryContainer,

    tertiary = md_theme_dark_secondary,
    onTertiary = md_theme_dark_onSecondary,
    tertiaryContainer = md_theme_dark_secondaryContainer,
    onTertiaryContainer = md_theme_dark_onSecondaryContainer,

    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,

    error = md_theme_dark_error,
    onError = md_theme_dark_onError,

    outline = md_theme_dark_outline,
    inverseSurface = md_theme_dark_inverseSurface,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    surfaceTint = md_theme_dark_surfaceTint
)
