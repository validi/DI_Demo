package com.aurora.didemo;

import dagger.Component;

@Component(modules = {MemoryCardModule.class,NCBatteryModule.class})
public interface SmartPhoneComponent {

    //SmartPhone getSmartPhone();
    void inject(MainActivity mainActivity);

}
