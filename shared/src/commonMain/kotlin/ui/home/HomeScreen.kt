package ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.theme.PeriodCardTheme

@OptIn(ExperimentalResourceApi::class, ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = getViewModel(Unit, viewModelFactory { HomeViewModel() }),
) {
    val uiState by viewModel.uiState.collectAsState()
    val columnSize = if (calculateWindowSizeClass().widthSizeClass == WindowWidthSizeClass.Compact) {
        2
    } else {
        4
    }

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.background,
                elevation = 0.dp,
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    Image(
                        painterResource("toolbar-logo.xml"),
                        null,
                        modifier = Modifier
                            .fillMaxHeight(0.5f),
                    )
                }
            }
        },
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(columnSize),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(24.dp),
        ) {
            items(uiState.periodsCards) { periodCard ->
                PeriodCardTheme(periodCard.periodColorScheme) {
                    Card(modifier = Modifier.fillMaxSize().aspectRatio(1f)) {
                        Column(
                            modifier = Modifier.fillMaxSize().padding(16.dp),
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Image(
                                    painterResource("ic_clock.xml"),
                                    contentDescription = "",
                                    modifier = Modifier.size(16.dp),
                                    colorFilter = ColorFilter.tint(
                                        color = MaterialTheme.colors.onSurface,
                                    ),
                                )
                                Spacer(Modifier.size(4.dp))
                                Text(
                                    text = periodCard.time,
                                    style = MaterialTheme.typography.subtitle2,
                                )
                            }
                            Spacer(Modifier.size(16.dp))
                            Text(
                                text = periodCard.title,
                                style = MaterialTheme.typography.h5,
                            )
                        }
                    }
                }
            }
        }
    }
}
