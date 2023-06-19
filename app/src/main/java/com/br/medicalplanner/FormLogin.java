package com.br.medicalplanner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private TextView entrar;

    public EditText edEmail;

    public EditText edSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        edEmail = findViewById(R.id.edit_email);
        edSenha = findViewById(R.id.edit_senha);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        IniciarComponentes();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);
            }
        });
//
//        entrar.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(FormLogin.this, Principal.class);
//                startActivity(intent);
//            }
//        });
    }

    public void buttonSignInClick(View view) {
        String login = edEmail.getText().toString();
        String senha = edSenha.getText().toString();
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        mAuth.signInWithEmailAndPassword(login, senha)
                .addOnCompleteListener(this, task -> {
                    String msg="";
                    if (task.isSuccessful()){
                        msg= "SIGN IN OK";
                        telaMudar(view);
                    }else{
                        msg="SIGN IN ERROR!";
                    }

                    Toast.makeText(FormLogin.this, msg,
                            Toast.LENGTH_SHORT).show();
                });
    }



    private void IniciarComponentes(){
        text_tela_cadastro=findViewById(R.id.text_tela_cadastro);
        entrar=findViewById(R.id.entrar);

    }

    public void telaMudar(View view)
    {
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }
}
