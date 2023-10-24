package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import setStatusBarColor

private val DarkColorScheme = darkColors(
    primary = Eucalyptus,
    secondary = Eucalyptus,
    background = CodGray,
    onSurface = CodGray,
)

private val LightColorScheme = lightColors(
    primary = Eucalyptus,
    secondary = Eucalyptus,
    background = CatSkillWhite,
    onSurface = CodGray,
)

@Composable
fun MyDietTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    setStatusBarColor(colorScheme.background, darkTheme)

    MaterialTheme(
        colors = colorScheme,
        typography = typography(),
        content = content,
        shapes = MaterialTheme.shapes.copy(
            medium = RoundedCornerShape(16.dp),
        ),
    )
}

@Composable
fun PeriodCardTheme(
    periodColorScheme: PeriodColorScheme,
    content: @Composable () -> Unit,
) {
    val colorScheme = MaterialTheme.colors.copy(
        primary = periodColorScheme.primary,
        primaryVariant = periodColorScheme.primaryVariant,
        secondary = periodColorScheme.secondary,
        surface = periodColorScheme.surfaceColor,
    )

    MaterialTheme(
        colors = colorScheme,
        content = content,
    )
}
