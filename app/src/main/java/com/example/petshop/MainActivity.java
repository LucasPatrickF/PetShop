package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button cadastre;
    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        getSupportActionBar().hide();

        cadastre = findViewById(R.id.btn_cadastre);

        cadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

        entrar = findViewById(R.id.btn_entrar);

        entrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Sucesso ao efetuar Login", Toast.LENGTH_LONG).show();

            }
        });
    }


}