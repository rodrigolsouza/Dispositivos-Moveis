package com.br.medicalplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class alarmes extends AppCompatActivity {


    private TextView buttonNovoAlarme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmes);
        buttonNovoAlarme=findViewById(R.id.buttonNovoAlarme);

        buttonNovoAlarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alarmes.this, novo_alarme.class);
                startActivity(intent);
            }
        });



    }
}