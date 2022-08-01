package com.example.android.trackmysleepquality.databinding;
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSleepTrackerBindingImpl extends FragmentSleepTrackerBinding implements com.example.android.trackmysleepquality.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sleep_list, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSleepTrackerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSleepTrackerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.clearButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.startButton.setTag(null);
        this.stopButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sleepTrackerViewModel == variableId) {
            setSleepTrackerViewModel((com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSleepTrackerViewModel(@Nullable com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel SleepTrackerViewModel) {
        this.mSleepTrackerViewModel = SleepTrackerViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.sleepTrackerViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSleepTrackerViewModelStartButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeSleepTrackerViewModelStopButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeSleepTrackerViewModelClearButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelStartButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> SleepTrackerViewModelStartButtonVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelStopButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> SleepTrackerViewModelStopButtonVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelClearButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> SleepTrackerViewModelClearButtonVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.Boolean> sleepTrackerViewModelStartButtonVisible = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> sleepTrackerViewModelStopButtonVisible = null;
        java.lang.Boolean sleepTrackerViewModelStartButtonVisibleGetValue = null;
        java.lang.Boolean sleepTrackerViewModelStopButtonVisibleGetValue = null;
        java.lang.Boolean sleepTrackerViewModelClearButtonVisibleGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStopButtonVisibleGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStartButtonVisibleGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelClearButtonVisibleGetValue = false;
        com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;
        androidx.lifecycle.LiveData<java.lang.Boolean> sleepTrackerViewModelClearButtonVisible = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (sleepTrackerViewModel != null) {
                        // read sleepTrackerViewModel.startButtonVisible
                        sleepTrackerViewModelStartButtonVisible = sleepTrackerViewModel.getStartButtonVisible();
                    }
                    updateLiveDataRegistration(0, sleepTrackerViewModelStartButtonVisible);


                    if (sleepTrackerViewModelStartButtonVisible != null) {
                        // read sleepTrackerViewModel.startButtonVisible.getValue()
                        sleepTrackerViewModelStartButtonVisibleGetValue = sleepTrackerViewModelStartButtonVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModel.startButtonVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStartButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModelStartButtonVisibleGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (sleepTrackerViewModel != null) {
                        // read sleepTrackerViewModel.stopButtonVisible
                        sleepTrackerViewModelStopButtonVisible = sleepTrackerViewModel.getStopButtonVisible();
                    }
                    updateLiveDataRegistration(1, sleepTrackerViewModelStopButtonVisible);


                    if (sleepTrackerViewModelStopButtonVisible != null) {
                        // read sleepTrackerViewModel.stopButtonVisible.getValue()
                        sleepTrackerViewModelStopButtonVisibleGetValue = sleepTrackerViewModelStopButtonVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModel.stopButtonVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStopButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModelStopButtonVisibleGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (sleepTrackerViewModel != null) {
                        // read sleepTrackerViewModel.clearButtonVisible
                        sleepTrackerViewModelClearButtonVisible = sleepTrackerViewModel.getClearButtonVisible();
                    }
                    updateLiveDataRegistration(2, sleepTrackerViewModelClearButtonVisible);


                    if (sleepTrackerViewModelClearButtonVisible != null) {
                        // read sleepTrackerViewModel.clearButtonVisible.getValue()
                        sleepTrackerViewModelClearButtonVisibleGetValue = sleepTrackerViewModelClearButtonVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModel.clearButtonVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelClearButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModelClearButtonVisibleGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.clearButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelClearButtonVisibleGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.clearButton.setOnClickListener(mCallback3);
            this.startButton.setOnClickListener(mCallback1);
            this.stopButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.startButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStartButtonVisibleGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.stopButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStopButtonVisibleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onClear();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onStart();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onStop();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sleepTrackerViewModel.startButtonVisible
        flag 1 (0x2L): sleepTrackerViewModel.stopButtonVisible
        flag 2 (0x3L): sleepTrackerViewModel.clearButtonVisible
        flag 3 (0x4L): sleepTrackerViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}