package com.aurora.didemo;

import dagger.Component;

@Component(modules = MemoryCardModule.class)
public interface SmartPhoneComponent {

    SmartPhone getSmartPhone();

}
