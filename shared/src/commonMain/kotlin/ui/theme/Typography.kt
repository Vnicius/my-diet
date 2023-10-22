package ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.unit.sp
import platform.font

object Fonts {

    @Composable
    fun sfPro() = FontFamily(
        font(
            "SF Pro Regular",
            "sf_pro_regular",
            FontWeight.Normal,
            FontStyle.Normal,
        ),
        font(
            "SF Pro Medium",
            "sf_pro_medium",
            FontWeight.Medium,
            FontStyle.Normal,
        ),
        font(
            "SF Pro Bold",
            "sf_pro_bold",
            FontWeight.Bold,
            FontStyle.Normal,
        ),
    )
}

@Composable
fun typography() = Typography(
    h5 = TextStyle(
        fontFamily = Fonts.sfPro(),
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
    ),
    subtitle2 = TextStyle(
        fontFamily = Fonts.sfPro(),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
    ),
)
