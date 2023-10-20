package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import setStatusBarColor

private val DarkColorScheme = darkColors(
    primary = Eucalyptus,
    secondary = Eucalyptus,
    background = CodGray,
)

private val LightColorScheme = lightColors(
    primary = Eucalyptus,
    secondary = Eucalyptus,
    background = CatSkillWhite,
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
        typography = Typography,
        content = content,
    )
}


