package ru.kima.smartlock.presentation.appsList

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun AppsListScreen(
    viewModel: AppsListScreenViewModel = viewModel()
) {
    val apps by viewModel.apps.collectAsState()

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(apps) {
            Text(text = it)
        }
    }
}