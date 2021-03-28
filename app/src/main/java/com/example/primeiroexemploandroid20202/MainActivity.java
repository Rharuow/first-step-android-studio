package com.example.primeiroexemploandroid20202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        System.out.println("onCreate()");
        //setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        super.onStart();
        System.out.println("onStart()");
    }
}