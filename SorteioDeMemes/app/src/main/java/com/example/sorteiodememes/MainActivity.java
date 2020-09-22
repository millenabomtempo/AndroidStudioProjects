package com.example.sorteiodememes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearMeme(View v) {

        ImageView imgMeme = findViewById(R.id.imgMeme);

        int meme = new Random().nextInt(5) + 1;

        switch (meme) {
            case 1: imgMeme.setImageResource(R.drawable.noguy);
                break;
            case 2: imgMeme.setImageResource(R.drawable.notbad);
                break;
            case 3: imgMeme.setImageResource(R.drawable.okay);
                break;
            case 4: imgMeme.setImageResource(R.drawable.sir);
                break;
            case 5: imgMeme.setImageResource(R.drawable.troll);
                break;
        }

    }

}