package com.br.medicalplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaPrincipal extends AppCompatActivity {

    private android.widget.ImageView ImageView;
    private ImageView ImageView2;
    private ImageView ImageView3;
    private ImageView ImageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            Intent intent = new Intent(TelaPrincipal.this, alarmes.class);
            startActivity(intent);
        }
        });

        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, MinhaFarmacia.class);
                startActivity(intent);
            }
        });
        ImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, MeuCarrinho.class);
                startActivity(intent);
            }
        });
        ImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, FarmaciasProximas.class);
                startActivity(intent);
            }
        });
    }
}