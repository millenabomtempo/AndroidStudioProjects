package com.example.papelpedratesoura;

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

    public void selectRock (View v) {
        this.selectedOption("rock");
    }

    public void selectPaper (View v) {
        this.selectedOption("paper");
    }

    public void selectScissor (View v) {
        this.selectedOption("scissors");
    }

    public void selectedOption(String userChoice) {
        ImageView imgApp = findViewById(R.id.imgApp);
        TextView txtAnswer = findViewById(R.id.txtAnswer);

        //random number to App
        String[] options = {"rock", "paper", "scissors"};
        int num = new Random().nextInt(3);
        String appChoice = options[num];

        switch (appChoice) {
            case "rock":
                imgApp.setImageResource(R.drawable.pedra);
                break;
            case "paper":
                imgApp.setImageResource(R.drawable.papel);
                break;
            case "scissors":
                imgApp.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((appChoice=="rock" && userChoice=="scissors") ||
            (appChoice=="paper" && userChoice=="rock") ||
            (appChoice=="scissors" && userChoice=="paper")
        ) {//App wins
            txtAnswer.setText("Você Perdeu :( ");
        }
        else if ((userChoice=="rock" && appChoice=="scissors") ||
                (userChoice=="paper" && appChoice=="rock") ||
                (userChoice=="scissors" && appChoice=="paper")
        ) {//User wins
            txtAnswer.setText("Você Ganhou :) ");
        }
        else {//tie
            txtAnswer.setText("Empatamos! ");
        }
    }
}