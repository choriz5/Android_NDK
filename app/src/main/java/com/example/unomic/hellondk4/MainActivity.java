package com.example.unomic.hellondk4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NDKTest myNDK = new NDKTest();
        myNDK.ndkTestMethod("Hi");


        Log.d("NDKTEST",myNDK.getHelloNDKString());


        //깃헙시험용 주석추가!!!
    }
}