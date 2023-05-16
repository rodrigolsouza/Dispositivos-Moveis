package com.br.medicalplanner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormCadastro extends AppCompatActivity {

    private AppCompatButton cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
//
//        IniciarComponentes();
//        cadastro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FormCadastro.this, TelaPrincipal.class);
//                startActivity(intent);
//            }
//        });
//        botao_cadastrar_remedio.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FormCadastro.this, TelaPrincipal.class);
//                startActivity(intent);
//            }
//        });


//
      }
//
//    private void IniciarComponentes(){
//        cadastro=findViewById(R.id.botao_cadastrar_remedio);
//    }
    public void telaMudar(View view)
    {
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }
}
