package com.example.android.trackmysleepquality.sleepquality;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.trackmysleepquality.R;

public class SleepQualityFragmentDirections {
  private SleepQualityFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSleepQualityFragmentToSleepTrackerFragment() {
    return new ActionOnlyNavDirections(R.id.action_sleepQualityFragment_to_sleepTrackerFragment);
  }
}
