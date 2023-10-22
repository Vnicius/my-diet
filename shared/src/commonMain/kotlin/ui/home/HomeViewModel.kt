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
                ),
            )
        }
    }
}
