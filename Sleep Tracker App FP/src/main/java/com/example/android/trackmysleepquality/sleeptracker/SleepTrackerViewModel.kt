package com.example.android.trackmysleepquality.sleeptracker

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.formatNights
import kotlinx.coroutines.launch

class SleepTrackerViewModel(
        dataSource: SleepDatabaseDao,
        application: Application) : ViewModel() {

    val database = dataSource

    private var tonight = MutableLiveData<SleepNight?>()

    val nights = database.getAllNights()

    val nightsString = Transformations.map(nights) { nights ->
        formatNights(nights, application.resources)
    }

    val startButtonVisible = Transformations.map(tonight) {
        null == it
    }

    val stopButtonVisible = Transformations.map(tonight) {
        null != it
    }

    val clearButtonVisible = Transformations.map(nights) {
        it?.isNotEmpty()
    }

    private var _showSnackbarEvent = MutableLiveData<Boolean?>()

    val showSnackBarEvent: LiveData<Boolean?>
        get() = _showSnackbarEvent

    private val _navigateToSleepQuality = MutableLiveData<SleepNight>()

    val navigateToSleepQuality: LiveData<SleepNight>
        get() = _navigateToSleepQuality

    fun doneShowingSnackbar() {
        _showSnackbarEvent.value = null
    }

    fun doneNavigating() {
        _navigateToSleepQuality.value = null
    }
    init {
        initializeTonight()
    }

    private fun initializeTonight() {
        viewModelScope.launch {
            tonight.value = getTonightFromDatabase()
        }
    }

    private suspend fun getTonightFromDatabase(): SleepNight? {
            var night = database.getTonight()
            if (night?.endTimeMilli != night?.startTimeMilli) {
                night = null
            }
            return night
    }

    private suspend fun insert(night: SleepNight) {
            database.insert(night)
    }

    private suspend fun update(night: SleepNight) {
            database.update(night)
    }

    private suspend fun clear() {
            database.clear()
    }

    fun onStart() {
        viewModelScope.launch {
            // Create a new night, which captures the current time,
            // and insert it into the database.
            val newNight = SleepNight()
            insert(newNight)
            tonight.value = getTonightFromDatabase()
        }
    }

    fun onStop() {
        viewModelScope.launch {
            val oldNight = tonight.value ?: return@launch
            // Update the night in the database to add the end time.
            oldNight.endTimeMilli = System.currentTimeMillis()
            update(oldNight)
            // Set state to navigate to the SleepQualityFragment.
            _navigateToSleepQuality.value = oldNight
        }
    }
    fun onClear() {
        viewModelScope.launch {
            // Clear the database table.
            clear()
            // And clear tonight since it's no longer in the database
            tonight.value = null
            // Show a snackbar message, because it's friendly.
            _showSnackbarEvent.value = true
        }
    }
}