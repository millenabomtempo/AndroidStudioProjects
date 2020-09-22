package com.example.apostadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogarDados (View v) {

        ImageView imgApp = findViewById(R.id.imgApp);
        ImageView imgUsu = findViewById(R.id.imgUsuario);

        TextView txtRes = findViewById(R.id.txtRes);

        int dadoApp = new Random().nextInt(6) + 1;
        int dadoUsu = new Random().nextInt(6) + 1;

        switch (dadoApp) {
            case 1: imgApp.setImageResource(R.drawable.face1);
                break;
            case 2: imgApp.setImageResource(R.drawable.face2);
                break;
            case 3: imgApp.setImageResource(R.drawable.face3);
                break;
            case 4: imgApp.setImageResource(R.drawable.face4);
                break;
            case 5: imgApp.setImageResource(R.drawable.face5);
                break;
            case 6: imgApp.setImageResource(R.drawable.face6);
                break;
        }

        switch (dadoUsu) {
            case 1: imgUsu.setImageResource(R.drawable.face1);
                break;
            case 2: imgUsu.setImageResource(R.drawable.face2);
                break;
            case 3: imgUsu.setImageResource(R.drawable.face3);
                break;
            case 4: imgUsu.setImageResource(R.drawable.face4);
                break;
            case 5: imgUsu.setImageResource(R.drawable.face5);
                break;
            case 6: imgUsu.setImageResource(R.drawable.face6);
                break;
        }

        if (dadoApp > dadoUsu) {
            txtRes.setText("Você Perdeu! :(");
        } else if (dadoUsu > dadoApp) {
            txtRes.setText("Você Ganhou! :)");
        } else {
            txtRes.setText("Empatamos :|");
        }

    }
}