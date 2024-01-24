package ru.kima.smartlock.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import org.koin.androidx.compose.koinViewModel
import org.koin.compose.KoinContext
import ru.kima.smartlock.presentation.appsList.AppsListScreen
import ru.kima.smartlock.ui.theme.SmartLockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartLockTheme {
                KoinContext {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        AppsListScreen(koinViewModel())
                    }
                }
            }
        }
    }
}