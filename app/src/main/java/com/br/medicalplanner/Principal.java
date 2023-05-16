package com.br.medicalplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {

    ImageView despertador;
    ImageView carrinho;
    ImageView farmacia;
    ImageView localizacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricipal);

        despertador=findViewById(R.id.despertador);
        farmacia=findViewById(R.id.farmacia);
        localizacao=findViewById(R.id.localizacao);
        carrinho=findViewById(R.id.carrinho);

        despertador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, alarmes.class);
                startActivity(intent);
            }
        });
        farmacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, MinhaFarmacia.class);
                startActivity(intent);
            }
        });
        carrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, MeuCarrinho.class);
                startActivity(intent);
            }
        });
        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, FarmaciasProximas.class);
                startActivity(intent);
            }
        });

    }
    public void telaAgendar(View view)
    {
        Intent intent = new Intent(this, CadastroRemedio.class);
        startActivity(intent);
    }
}