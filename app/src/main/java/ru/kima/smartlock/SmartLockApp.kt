package ru.kima.smartlock

import android.app.Application
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.context.startKoin
import org.koin.dsl.module
import ru.kima.smartlock.presentation.appsList.AppsListScreenViewModel

class SmartLockApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val viewModels = module {
            viewModelOf(::AppsListScreenViewModel)
        }

        val singletons = module {
            single { this@SmartLockApp.packageManager }
        }

        startKoin {
            androidLogger()
            modules(
                viewModels,
                singletons
            )
        }
    }
}