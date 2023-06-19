package com.br.medicalplanner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

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

    //----------------------peu ta modificando essa parte--------------------------------------
//        public void button(cadastro) {
//            String email = edit_Email.getText().toString();
//            String password = edit_Password.getText().toString();
//            FirebaseAuth mAuth = FirebaseAuth.getInstance();
//            mAuth.createUserWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this, task -> {
//                        String msg = task.isSuccessful() ? "SIGN UP OK!":
//                                "SIGN UP ERROR!";
//                        Toast.makeText(FormCadastro.this, msg,
//                                Toast.LENGTH_SHORT).show();
//                    });
//        }

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
