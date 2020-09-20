package com.example.apostanumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtApp;
    TextView txtUsuario;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtApp = findViewById(R.id.txtApp);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtResultado = findViewById(R.id.txtResultado);

    }

    public void jogar(View view) {

        int nApp = new Random().nextInt(11);
        int nUser = new Random().nextInt(11);

        txtApp.setText(Integer.toString(nApp));
        txtUsuario.setText(Integer.toString(nUser));

        if(nApp>nUser){

            txtResultado.setText("PERDEU!");

        }else if (nApp<nUser){

            txtResultado.setText("GANHOU!");

        }else{

            txtResultado.setText("EMPATOU!");

        }
    }
}