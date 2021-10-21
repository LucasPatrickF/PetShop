package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private Button voltar;
    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);
        getSupportActionBar().hide();

        voltar = findViewById(R.id.btn_voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        cadastrar = findViewById(R.id.btn_cadastrar2);

        cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Cadastrado com sucesso!", Toast.LENGTH_LONG).show();

            }
        });
    }
}