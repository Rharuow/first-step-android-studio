package com.example.primeiroexemploandroid20202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        System.out.println("onCreate()");
        setContentView(R.layout.activity_main);
    }

    protected void onStart() {
        super.onStart();
        System.out.println("onStart()");
    }

    protected void onResume() {
        super.onResume();
        System.out.println("onResume()");
    }

    protected void onPause() {
        super.onPause();
        System.out.println("onPause()");
    }

    protected void onStop() {
        super.onStop();
        System.out.println("onStop()");
    }

    //Ao rotacionar ele também é chamado;
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy()");
    }

    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart()");
    }
}