package com.example.exame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView txtExams, txtPrice;
    RadioGroup rgSex;
    CheckBox ckBlood, ckPreg, ckProst;

    List<String> list = new ArrayList<String>();

    double sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtExams = findViewById(R.id.txtExams);
        txtPrice = findViewById(R.id.txtPrice);

        rgSex = findViewById(R.id.rgSex);

        ckBlood = findViewById(R.id.ckBlood);
        ckPreg = findViewById(R.id.ckPreg);
        ckProst = findViewById(R.id.ckProst);

        selectedSex();

    }

    public void selectedSex () {

        rgSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(i == R.id.rbMale){

                    clearAll();

                    ckBlood.setEnabled(true);
                    ckPreg.setEnabled(false);
                    ckProst.setEnabled(true);

                }

                if (i == R.id.rbFem) {

                    clearAll();

                    ckBlood.setEnabled(true);
                    ckPreg.setEnabled(true);
                    ckProst.setEnabled(false);

                }
            }
        });
    }

    public void clearAll () {
        ckBlood.setChecked(false);
        ckPreg.setChecked(false);
        ckProst.setChecked(false);
    }

    public void checkedExams () {

        list.clear();
        sum = 0;

        if (ckBlood.isChecked()) {
            list.add(ckBlood.getText().toString());
            sum += 50.00;
        }
        if (ckPreg.isChecked()) {
            list.add(ckPreg.getText().toString());
            sum += 100.00;
        }
        if (ckProst.isChecked()) {
            list.add(ckProst.getText().toString());
            sum += 200.00;
        }

    }

    public void calc (View v) {

        list.clear();
        sum = 0;

        checkedExams();

        txtExams.setText(list.toString());
        txtPrice.setText("R$ " + String.format("%.2f", sum));
    }

}