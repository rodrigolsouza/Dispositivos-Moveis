package com.br.medicalplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Principal extends AppCompatActivity {

    ImageView despertador;
    ImageView carrinho;
    ImageView farmacia;
    ImageView localizacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

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
    public void telaAgendar(View view) {
        Intent intent = new Intent(this, CadastroRemedio.class);
        startActivity(intent);
    }

    public void buttonSignOutClick(View view) {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            mAuth.signOut();
            this.finish();
            telaMudar(view);
        } else {
            Toast.makeText(Principal.this, "Erro!", Toast.LENGTH_SHORT).show();
        }
    }

    public void telaMudar(View view)
    {
        Intent intent = new Intent(this, FormLogin.class);
        startActivity(intent);
    }
}