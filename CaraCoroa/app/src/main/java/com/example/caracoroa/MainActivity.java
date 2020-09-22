package com.example.caracoroa;

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

    public void selectHead(View v) {
        this.selectedOption("head");
    }

    public void selectTails(View v) {
        this.selectedOption("tails");
    }

    public void selectedOption (String userChoice) {

        ImageView imgResult = findViewById(R.id.imgResult);
        TextView txtAnswer = findViewById(R.id.txtAnswer);

        String[] options = {"head", "tails"};
        int num = new Random().nextInt(2);
        String appChoice = options[num];

        switch (appChoice) {
            case "head":
                imgResult.setImageResource(R.drawable.moeda_cara);
                break;
            case "tails":
                imgResult.setImageResource(R.drawable.moeda_coroa);
                break;
        }

        if (appChoice=="head" && userChoice=="tails"){
            txtAnswer.setText("Você perdeu :( ");
        }else if (userChoice=="head" && appChoice=="tails"){
            txtAnswer.setText("Você ganhou :) ");
        }else {
            txtAnswer.setText("Empatamos!");
        }
    }
}