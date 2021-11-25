package com.example.areaofsquare;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button area,clear;
        EditText length;
        TextView answer;
        area=findViewById(R.id.Area);
        clear=findViewById(R.id.clear);
        length=findViewById(R.id.length);
        answer=findViewById(R.id.Answer);
        clear.setOnClickListener(v -> {
            length.setText("");
            answer.setText("");
        });
        area.setOnClickListener(v -> {
            if((length.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter Length!!!");
            }
            else
            {
                double l = Double.parseDouble(length.getText().toString());
                double ans=l*l;
                answer.setText("Area >>>  "+ans);
            }

        });
    }
}

