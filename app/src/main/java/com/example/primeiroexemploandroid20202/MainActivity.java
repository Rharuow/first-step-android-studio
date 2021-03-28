package com.example.primeiroexemploandroid20202;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        System.out.println("onCreate()");
        setContentView(R.layout.activity_main);
        EditText campoNome = findViewById(R.id.campoNome);
        EditText campoSenha = findViewById(R.id.campoSenha);
        Button enviar = findViewById(R.id.submitLogin);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autenticacao(campoNome.getText().toString(), campoSenha.getText().toString());
            }
        });
    }

    public void autenticacao (String nome, String senha) {
        if (nome.equals("aluno") && senha.equals("123")) {
            Toast.makeText(this, "Autenticado", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Não Autenticado", Toast.LENGTH_LONG).show();
        }
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