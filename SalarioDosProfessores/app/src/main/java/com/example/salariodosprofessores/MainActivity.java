package com.example.salariodosprofessores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtName, txtPrice, txtHours, txtSal, txtFinalSal;

    double sal = 0, finalSal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtPrice = findViewById(R.id.txtPrice);
        txtHours = findViewById(R.id.txtHours);
        txtSal = findViewById(R.id.txtSal);
        txtFinalSal = findViewById(R.id.txtFinalSal);

    }

    public void calc (View v) {

        String price, hours;

        price = txtPrice.getText().toString();
        hours = txtHours.getText().toString();

        sal = Double.parseDouble(price) * Double.parseDouble(hours);
        sal += sal * 0.50;

        finalSal = sal - (sal * 0.385);

        txtSal.setText("R$" + String.format("%.2f", sal));
        txtFinalSal.setText("R$ " + String.format("%.2f", finalSal));
    }
}