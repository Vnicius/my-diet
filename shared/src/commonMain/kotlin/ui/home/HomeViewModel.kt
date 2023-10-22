package ui.home

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import ui.theme.PeriodColorScheme

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())

    val uiState = _uiState.asStateFlow()

    init {
        _uiState.update { state ->
            state.copy(
                periodsCards = listOf(
                    HomeUiState.PeriodCardState(
                        time = "7:30",
                        title = "Café da manhã",
                        periodColorScheme = PeriodColorScheme.Breakfast,
                    ),
                    HomeUiState.PeriodCardState(
                        time = "10:00",
                        title = "Lanche da manhã",
                        periodColorScheme = PeriodColorScheme.MorningSnack,
                    ),
                    HomeUiState.PeriodCardState(
                        time = "13:00",
                        title = "Almoço",
                        periodColorScheme = PeriodColorScheme.Lunch,
                    ),
                    HomeUiState.PeriodCardState(
                        time = "16:00",
                        title = "Lanche da tarde",
                        periodColorScheme = PeriodColorScheme.AfternoonSnack,
                    ),
                    HomeUiState.PeriodCardState(
                        time = "19:00",
                        title = "Jantar",
                        periodColorScheme = PeriodColorScheme.Diner,
                    ),
                    HomeUiState.PeriodCardState(
                        time = "22:00",
                        title = "Lanche da noite",
                        periodColorScheme = PeriodColorScheme.LateNightSnack,
                    ),
                ),
            )
        }
    }
}
