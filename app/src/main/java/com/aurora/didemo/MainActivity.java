package com.aurora.didemo;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SmartPhone smartPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        // smartPhone = smartPhoneComponent.getSmartPhone();

        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.builder()
                .memoryCardModule(new MemoryCardModule(100))
                .build();
        smartPhoneComponent.inject(this);
        smartPhone.makeACall();


    }
}
