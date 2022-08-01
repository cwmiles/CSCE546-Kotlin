package com.example.android.trackmysleepquality.sleepquality

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import kotlinx.coroutines.launch

class SleepQualityViewModel(
        private val sleepNightKey: Long = 0L,
        dataSource: SleepDatabaseDao) : ViewModel() {

    val database = dataSource

    private val _navigateToSleepTracker = MutableLiveData<Boolean?>()

    val navigateToSleepTracker: LiveData<Boolean?>
        get() = _navigateToSleepTracker

    fun doneNavigating() {
        _navigateToSleepTracker.value = null
    }

    fun onSetSleepQuality(quality: Int) {
        viewModelScope.launch {
                val tonight = database.get(sleepNightKey)
                tonight.sleepQuality = quality
                database.update(tonight)

            // Setting this state variable to true will alert the observer and trigger navigation.
            _navigateToSleepTracker.value = true
        }
    }
}
