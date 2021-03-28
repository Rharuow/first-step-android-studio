package com.example.primeiroexemploandroid20202;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);

        TextView textoNome = new TextView(this);
        textoNome.setText("Nome: ");
        EditText campoNome = new EditText(this);

        TextView textoSenha = new TextView(this);
        textoSenha.setText("Senha: ");

        MeuEditText campoSenha = new MeuEditText(this);

        Button enviar = new Button(this);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autenticacao(campoNome.getText().toString(), campoSenha.getText().toString());
            }
        });

        LinearLayout layoutPrincipal = new LinearLayout(this);
        layoutPrincipal.addView(textoNome);
        layoutPrincipal.addView(campoNome);
        layoutPrincipal.addView(textoSenha);
        layoutPrincipal.addView(campoSenha);
        layoutPrincipal.addView(enviar);
        setContentView(layoutPrincipal);
    }

    public void autenticacao (String nome, String senha) {
        if (nome.equals("aluno") && senha.equals("123")) {
            Toast.makeText(this, "Autenticado", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Não Autenticado", Toast.LENGTH_LONG).show();
        }
    }
}
