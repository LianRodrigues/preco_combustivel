package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    Button btn_calcular_combustivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadWidget();
        Evento();
    }

    private void LoadWidget(){

        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btn_calcular_combustivel = (Button)findViewById(R.id.btn_calcular_combustivel);

    }

    private void Evento(){
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Calcular.class);
                startActivity(it);
            }
        });

        btn_calcular_combustivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Calcular_combustivel.class);
                startActivity(it);
            }
        });
    }
}