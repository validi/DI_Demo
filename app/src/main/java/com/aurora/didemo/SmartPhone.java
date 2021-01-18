package com.aurora.didemo;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SmartPhone {

    private Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "SmartPhone";
    String time;


    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
        battery.ShowType();

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss");
            time = dateFormat.format(Calendar.getInstance().getTime());
        }

    }


    public void makeACall() {
        Log.d(TAG, " making a call......... ");
        Log.d(TAG, " created time is " + time);
    }
}
