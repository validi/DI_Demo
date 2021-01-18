package com.aurora.didemo;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {

    @Provides
    static MemoryCard provideMemoryCard(){
        return new MemoryCard();
    }
}
