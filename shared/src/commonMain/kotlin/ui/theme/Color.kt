package ui.theme

import androidx.compose.ui.graphics.Color

val CatSkillWhite = Color(0xFFF8FAFC)
val CodGray = Color(0xFF1A1A1A)
val EarlyDawn = Color(0xFFFFF7E6)
val MintJulep = Color(0xFFF2E5C5)
val Zombie = Color(0xFFE5D3A4)
val Eucalyptus = Color(0xFF237A51)
val SurfCrest = Color(0xFFD5E5D4)
val SeaMist = Color(0xFFC2D9C1)
val Saltpan = Color(0xFFE9F1E8)
val DairyCream = Color(0xFFF9E0B5)
val NewOrleans = Color(0xFFF1D19F)
val GoldSand = Color(0xFFE3C289)
val LinkWater = Color(0xFFCEE5F0)
val PowderBlue = Color(0xFFB5D9E5)
val AquaIsland = Color(0xFF9DC3D9)
val TropicalBlue = Color(0xFFB5D5F5)
val RegentBlue = Color(0xFFA2C9E5)
val PoloBlue = Color(0xFF8FB5D5)
val JordyBlue = Color(0xFF75BBEE)
val Periwinkle = Color(0xFFC2C8FF)
val Spindle = Color(0xFFA9B4E5)
val BlueBell = Color(0xFF909CCB)

enum class PeriodColorScheme(
    val primary: Color,
    val primaryVariant: Color,
    val secondary: Color,
    val surfaceColor: Color,
) {
    Breakfast(
        primary = EarlyDawn,
        primaryVariant = MintJulep,
        secondary = Zombie,
        surfaceColor = EarlyDawn,
    ),
    MorningSnack(
        primary = Saltpan,
        primaryVariant = SurfCrest,
        secondary = SeaMist,
        surfaceColor = Saltpan,
    ),
    Lunch(
        primary = DairyCream,
        primaryVariant = NewOrleans,
        secondary = GoldSand,
        surfaceColor = DairyCream,
    ),
    AfternoonSnack(
        primary = LinkWater,
        primaryVariant = PowderBlue,
        secondary = AquaIsland,
        surfaceColor = LinkWater,
    ),
    Diner(
        primary = TropicalBlue,
        primaryVariant = RegentBlue,
        secondary = PoloBlue,
        surfaceColor = TropicalBlue,
    ),
    LateNightSnack(
        primary = Periwinkle,
        primaryVariant = Spindle,
        secondary = BlueBell,
        surfaceColor = Periwinkle,
    ),
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
