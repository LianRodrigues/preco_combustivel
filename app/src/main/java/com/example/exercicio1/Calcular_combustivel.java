package com.example.exercicio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calcular_combustivel extends AppCompatActivity {

    EditText txtGasolina, txtEtanol;
    Button btnCalcular, btnVoltar;
    TextView lblResultado_combustivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_calcular_combustivel);
        LoadWidget();
        Evento();
    }

    private void LoadWidget(){
        txtGasolina = (EditText)findViewById(R.id.txtGasolina);
        txtEtanol = (EditText)findViewById(R.id.txtEtanol);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);
        lblResultado_combustivel = (TextView)findViewById(R.id.lblResultado_combustivel);
    }

    private void CalcularCombustivel(){
        double vlr_gasolina, vlr_etanol;

        vlr_gasolina = Double.parseDouble(txtGasolina.getText().toString());
        vlr_etanol = Double.parseDouble(txtEtanol.getText().toString());

        if (vlr_gasolina > vlr_etanol){
            lblResultado_combustivel.setText("Etanol está com o preço melhor!");
        } else {
            lblResultado_combustivel.setText("Gasolina está com o preço melhor!");
        }
    }

    private void Evento(){
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcularCombustivel();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Calcular_combustivel.this, MainActivity.class);
                startActivity(it);
            }
        });
    }


}
