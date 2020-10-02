package com.example.componentesbasicos02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView txtProduct, txtColors;
    EditText edName;
    CheckBox ckWhite, ckGreen, ckRed;

    List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtProduct = findViewById(R.id.txtProduct);
        txtColors = findViewById(R.id.txtColors);
        edName = findViewById(R.id.edName);
        ckWhite = findViewById(R.id.ckWhite);
        ckGreen = findViewById(R.id.ckGreen);
        ckRed = findViewById(R.id.ckRed);

    }

    public void send (View v) {

        txtProduct.setText(edName.getText().toString());
        checkColors();
        txtColors.setText(list.toString());

    }

    public void checkColors (){

        list.clear();
        if (ckWhite.isChecked()){
            list.add(ckWhite.getText().toString());
        }
        if (ckGreen.isChecked()){
            list.add(ckGreen.getText().toString());
        }
        if (ckRed.isChecked()){
            list.add(ckRed.getText().toString());
        }

    }
}