package ru.kima.smartlock.presentation.appsList

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

const val TAG = "AppsListScreenViewModel"

class AppsListScreenViewModel(
    private val pm: PackageManager
) : ViewModel() {
    private val _apps = MutableStateFlow(emptyList<String>())
    val apps = _apps.asStateFlow()

    init {
        val packages = pm.getInstalledApplications(PackageManager.GET_META_DATA)
//            Log.d(TAG, "Launch Activity :" + pm.getLaunchIntentForPackage(packageInfo.packageName) + "\n")

        _apps.value = packages
            .filter { ApplicationInfo.FLAG_SYSTEM and it.flags == 0 }
            .map { pm.getApplicationLabel(it).toString() }
            .sorted()
    }
}