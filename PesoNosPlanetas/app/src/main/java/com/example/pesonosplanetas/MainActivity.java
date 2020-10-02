package com.example.pesonosplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edWeightEarth;
    TextView txtResult;
    RadioGroup rgPlanets;

    double wEarth = 0, wPlanet=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edWeightEarth = findViewById(R.id.edWeightEarth);
        rgPlanets = findViewById(R.id.rgPlanets);
        txtResult = findViewById(R.id.txtResult);

        calcOnSelect();

    }

    public void calcOnSelect () {

        rgPlanets.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                String weight;
                weight = edWeightEarth.getText().toString();

                if (weight.equals("")){
                    txtResult.setText("Digite um peso válido");
                }else {
                    wEarth = Double.parseDouble(weight);

                    if (i == R.id.rbMars){
                        wPlanet = wEarth * 0.38;
                    }
                    if (i == R.id.rbJupter){
                        wPlanet = wEarth * 2.64;
                    }
                    if (i == R.id.rbVenus){
                        wPlanet = wEarth * 0.88;
                    }

                    txtResult.setText(String.format("%.2f", wPlanet) + "KG");
                }

            }

        });

    }

}