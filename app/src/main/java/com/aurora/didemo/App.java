package com.aurora.didemo;

import android.app.Application;

public class App extends Application {
    private  static App app;
    SmartPhoneComponent smartPhoneComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        smartPhoneComponent = DaggerSmartPhoneComponent.builder()
                .memoryCardModule(new MemoryCardModule(100))
                .build();
    }

    public static App getApp() {
        return app;
    }
    public SmartPhoneComponent getSmartPhoneComponent() {
        return smartPhoneComponent;
    }
}
