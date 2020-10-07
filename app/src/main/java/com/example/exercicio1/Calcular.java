package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.EventLog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calcular extends AppCompatActivity {

    EditText txtNota1, txtNota2, txtNota3;
    Button btnCalcularMedia;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_calcular);
        LoadWidget();
        Evento();

    }

    private void LoadWidget(){
        txtNota1 = (EditText)findViewById(R.id.txtNota1);
        txtNota2 = (EditText)findViewById(R.id.txtNota2);
        txtNota3 = (EditText)findViewById(R.id.txtNota3);
        btnCalcularMedia = (Button)findViewById(R.id.btnCalcularMedia);
        lblResultado = (TextView)findViewById(R.id.lblResultado);
    }

    private void CalcularMedia(){
        double result, p1, p2, lista;
        String result_string;

        p1 = Double.parseDouble(txtNota1.getText().toString());
        p2 = Double.parseDouble(txtNota2.getText().toString());
        lista = Double.parseDouble(txtNota3.getText().toString());

        result = (p1 * 0.3) + (p2 * 0.5) + (lista * 0.2);

        result_string = String.valueOf(result);

        lblResultado.setText(result_string);
    }

    private void Evento(){
        btnCalcularMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcularMedia();
            }
        });
    }
}
