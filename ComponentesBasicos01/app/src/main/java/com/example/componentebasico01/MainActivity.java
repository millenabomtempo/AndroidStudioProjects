package com.example.componentebasico01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RadioButton rbMale, rbFem;
    TextView txtResult;
    EditText edAge, edName;

    List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbFem = findViewById(R.id.rbFem);
        rbMale = findViewById(R.id.rbMale);
        txtResult = findViewById(R.id.txtResult);
        edAge = findViewById(R.id.edAge);
        edName = findViewById(R.id.edName);

    }

    public void send (View v) {

        list.clear();
        list.add(edName.getText().toString());
        list.add(edAge.getText().toString());

        if(rbMale.isChecked()){
            list.add("Masculino");
        }
        if(rbFem.isChecked()){
            list.add("Feminino");
        }

        txtResult.setText(list.toString());

    }

}