package com.br.medicalplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormCadastro extends AppCompatActivity {

    private ButtonBarLayout botao_cadastrar_remedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        botao_cadastrar_remedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormCadastro.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });

        IniciarComponentes();

    }

    private void IniciarComponentes(){
        botao_cadastrar_remedio=findViewById(R.id.botao_cadastrar_remedio);
    }
}