package com.example.primeiroexemploandroid20202;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ExemploMovimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_exemplo_movimento);
        Tela t = new Tela(this);
        new Thread(t).start();
        setContentView(t);
    }
}
