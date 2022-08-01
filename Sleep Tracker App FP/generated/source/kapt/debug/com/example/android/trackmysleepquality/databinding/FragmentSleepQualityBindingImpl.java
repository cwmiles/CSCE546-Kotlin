package com.example.android.trackmysleepquality.databinding;
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSleepQualityBindingImpl extends FragmentSleepQualityBinding implements com.example.android.trackmysleepquality.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_text, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSleepQualityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentSleepQualityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.qualityFiveImage.setTag(null);
        this.qualityFourImage.setTag(null);
        this.qualityOneImage.setTag(null);
        this.qualityThreeImage.setTag(null);
        this.qualityTwoImage.setTag(null);
        this.qualityZeroImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 6);
        mCallback7 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 4);
        mCallback8 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 5);
        mCallback5 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.sleepQualityViewModel == variableId) {
            setSleepQualityViewModel((com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSleepQualityViewModel(@Nullable com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel SleepQualityViewModel) {
        this.mSleepQualityViewModel = SleepQualityViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.sleepQualityViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel sleepQualityViewModel = mSleepQualityViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.qualityFiveImage.setOnClickListener(mCallback9);
            this.qualityFourImage.setOnClickListener(mCallback8);
            this.qualityOneImage.setOnClickListener(mCallback5);
            this.qualityThreeImage.setOnClickListener(mCallback7);
            this.qualityTwoImage.setOnClickListener(mCallback6);
            this.qualityZeroImage.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // sleepQualityViewModel
                com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel sleepQualityViewModel = mSleepQualityViewModel;
                // sleepQualityViewModel != null
                boolean sleepQualityViewModelJavaLangObjectNull = false;



                sleepQualityViewModelJavaLangObjectNull = (sleepQualityViewModel) != (null);
                if (sleepQualityViewModelJavaLangObjectNull) {



                    sleepQualityViewModel.onSetSleepQuality(5);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // sleepQualityViewModel
                com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel sleepQualityViewModel = mSleepQualityViewModel;
                // sleepQualityViewModel != null
                boolean sleepQualityViewModelJavaLangObjectNull = false;



                sleepQualityViewModelJavaLangObjectNull = (sleepQualityViewModel) != (null);
                if (sleepQualityViewModelJavaLangObjectNull) {



                    sleepQualityViewModel.onSetSleepQuality(3);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // sleepQualityViewModel
                com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel sleepQualityViewModel = mSleepQualityViewModel;
                // sleepQualityViewModel != null
                boolean sleepQualityViewModelJavaLangObjectNull = false;



                sleepQualityViewModelJavaLangObjectNull = (sleepQualityViewModel) != (null);
                if (sleepQualityViewModelJavaLangObjectNull) {



                    sleepQualityViewModel.onSetSleepQuality(4);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // sleepQualityViewModel
                com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel sleepQualityViewModel = mSleepQualityViewModel;
                // sleepQualityViewModel != null
                boolean sleepQualityViewModelJavaLangObjectNull = false;



                sleepQualityViewModelJavaLangObjectNull = (sleepQualityViewModel) != (null);
                if (sleepQualityViewModelJavaLangObjectNull) {



                    sleepQualityViewModel.onSetSleepQuality(1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // sleepQualityViewModel
                com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel sleepQualityViewModel = mSleepQualityViewModel;
                // sleepQualityViewModel != null
                boolean sleepQualityViewModelJavaLangObjectNull = false;



                sleepQualityViewModelJavaLangObjectNull = (sleepQualityViewModel) != (null);
                if (sleepQualityViewModelJavaLangObjectNull) {



                    sleepQualityViewModel.onSetSleepQuality(2);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // sleepQualityViewModel
                com.example.android.trackmysleepquality.sleepquality.SleepQualityViewModel sleepQualityViewModel = mSleepQualityViewModel;
                // sleepQualityViewModel != null
                boolean sleepQualityViewModelJavaLangObjectNull = false;



                sleepQualityViewModelJavaLangObjectNull = (sleepQualityViewModel) != (null);
                if (sleepQualityViewModelJavaLangObjectNull) {



                    sleepQualityViewModel.onSetSleepQuality(0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sleepQualityViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}