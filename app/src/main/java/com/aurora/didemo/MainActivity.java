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

        App.getApp().smartPhoneComponent.inject(this);
       // smartPhoneComponent.inject(this);
        smartPhone.makeACall();


    }
}
