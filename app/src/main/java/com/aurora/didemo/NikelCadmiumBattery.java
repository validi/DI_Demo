package com.aurora.didemo;

import android.util.Log;

import javax.inject.Inject;

public class NikelCadmiumBattery implements Battery {
    private static final String TAG = "SmartPhone";

    @Inject
    public NikelCadmiumBattery() {
    }

    @Override
    public void ShowType() {
        Log.d(TAG, " this is a nikel cadmium battry......... ");
    }
}
