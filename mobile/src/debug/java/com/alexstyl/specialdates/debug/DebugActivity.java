package com.alexstyl.specialdates.debug;

import android.os.Bundle;

import com.alexstyl.specialdates.R;
import com.alexstyl.specialdates.ui.base.MementoPreferenceActivity;

public class DebugActivity extends MementoPreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_debug);
    }

}
