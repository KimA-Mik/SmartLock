package ru.kima.smartlock.presentation.appsList

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun AppsListScreen(
    viewModel: AppsListScreenViewModel = viewModel()
) {
    val context = LocalContext.current
    context.packageManager
}