package ui.theme

import androidx.compose.ui.graphics.Color

val CatSkillWhite = Color(0xFFF8FAFC)
val CodGray = Color(0xFF1A1A1A)
val Eucalyptus = Color(0xFF237A51)
val EarlyDawn = Color(0xFFFFF7E6)
val Saltpan = Color(0xFFE9F1E8)
val DairyCream = Color(0xFFF9E0B5)
val LinkWater = Color(0xFFCEE5F0)
val TropicalBlue = Color(0xFFB5D5F5)
val JordyBlue = Color(0xFF75BBEE)

enum class PeriodColorScheme(
    val surfaceColor: Color,
) {
    Breakfast(EarlyDawn),
    MorningSnack(Saltpan),
    Lunch(DairyCream),
    AfternoonSnack(LinkWater),
    Diner(TropicalBlue),
    LateNightSnack(JordyBlue),
    ;

    companion object {
        fun fromPeriodColor(periodColor: PeriodColor) = when (periodColor) {
            PeriodColor.Breakfast -> Breakfast
            PeriodColor.MorningSnack -> MorningSnack
            PeriodColor.Lunch -> Lunch
            PeriodColor.AfternoonSnack -> AfternoonSnack
            PeriodColor.Diner -> Diner
            else -> LateNightSnack
        }
    }
}

enum class PeriodColor {
    Breakfast,
    MorningSnack,
    Lunch,
    AfternoonSnack,
    Diner,
    LaterNightSnack,
}
