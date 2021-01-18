package com.aurora.didemo;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });

    }

//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button:
//                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
//                startActivity(intent);
//        }
//    }
}
