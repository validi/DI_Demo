package com.aurora.didemo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {
    private static final String TAG = "SmartPhone";
    private int memorySize;

    public MemoryCardModule(int memorySize) {
        this.memorySize = memorySize;
    }

    @Provides
     MemoryCard provideMemoryCard(){
        Log.d(TAG, " size of the memory card is "+memorySize);
        return new MemoryCard();
    }
}
