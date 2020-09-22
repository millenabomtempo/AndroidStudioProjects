package com.example.craps;

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

    boolean firstRound = true;
    int pts = 0;

    public void playDice (View v) {

        ImageView imgD1 = findViewById(R.id.imgD1);
        ImageView imgD2 = findViewById(R.id.imgD2);

        TextView txtPoints = findViewById(R.id.txtPoints);

        int dice1 = new Random().nextInt(6) + 1;
        int dice2 = new Random().nextInt(6) + 1;

        int sum = dice1 + dice2;

        switch (dice1) {
            case 1: imgD1.setImageResource(R.drawable.face1);
                break;
            case 2: imgD1.setImageResource(R.drawable.face2);
                break;
            case 3: imgD1.setImageResource(R.drawable.face3);
                break;
            case 4: imgD1.setImageResource(R.drawable.face4);
                break;
            case 5: imgD1.setImageResource(R.drawable.face5);
                break;
            case 6: imgD1.setImageResource(R.drawable.face6);
                break;
        }

        switch (dice2) {
            case 1: imgD2.setImageResource(R.drawable.face1);
                break;
            case 2: imgD2.setImageResource(R.drawable.face2);
                break;
            case 3: imgD2.setImageResource(R.drawable.face3);
                break;
            case 4: imgD2.setImageResource(R.drawable.face4);
                break;
            case 5: imgD2.setImageResource(R.drawable.face5);
                break;
            case 6: imgD2.setImageResource(R.drawable.face6);
                break;
        }

        if (firstRound) {

            switch (sum){
                case 7:
                case 11:
                    txtPoints.setText("Você ganhou!" + "\nVolte para a primeira jogada");
                    break;
                case 2:
                case 3:
                case 12:
                    txtPoints.setText("Você perdeu" + "\nVolte para a primeira jogada");
                    break;
                default:
                    pts = sum;
                    firstRound = false;
                    txtPoints.setText("Pontos: " + pts);
            }//end switch

        }//end first round
        else{

            if (sum == pts) {
                txtPoints.setText("Você ganhou!" + "\nVolte para a primeira jogada");
                firstRound = true;
            }else if (sum == 7 ) {
                txtPoints.setText("Você perdeu" + "\nVolte para a primeira jogada");
                firstRound = true;
            }
        }
    }
}