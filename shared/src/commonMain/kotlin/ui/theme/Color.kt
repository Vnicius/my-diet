package ui.theme

import androidx.compose.ui.graphics.Color

val CatSkillWhite = Color(0xFFF8FAFC)
val CodGray = Color(0xFF1A1A1A)
val Eucalyptus = Color(0xFF237A51)
val EarlyDawn = Color(0xFFFFF7E6)
val Saltpan = Color(0xFFE9F1E8)

enum class PeriodColorScheme(
    val surfaceColor: Color,
) {
    Breakfast(EarlyDawn),
    MorningSnack(Saltpan),
    ;

    companion object {
        fun fromPeriodColor(periodColor: PeriodColor) = when (periodColor) {
            PeriodColor.Breakfast -> Breakfast
            else -> MorningSnack
        }
    }
}

enum class PeriodColor {
    Breakfast,
    MorningSnack,
}
