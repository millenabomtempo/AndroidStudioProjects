package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText edAlcool, edGas;

    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResult);

        edAlcool = findViewById(R.id.edAlcool);
        edGas = findViewById(R.id.edGas);

    }

    public void calc (View v){

        result = Double.parseDouble(edAlcool.getText().toString()) / Double.parseDouble(edGas.getText().toString());

        if (result > 0.70) {
            txtResult.setText("Melhor Gasolina");
        } else {
            txtResult.setText("Melhor Álcool");
        }
        
    }
}