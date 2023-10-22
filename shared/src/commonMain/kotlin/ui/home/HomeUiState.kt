package ui.home

import data.model.PeriodMeals
import ui.theme.PeriodColorScheme

data class HomeUiState(
    val periodsCards: List<PeriodCardState> = listOf(),
) {
    data class PeriodCardState(
        val time: String,
        val title: String,
        val periodColorScheme: PeriodColorScheme,
    )
}
