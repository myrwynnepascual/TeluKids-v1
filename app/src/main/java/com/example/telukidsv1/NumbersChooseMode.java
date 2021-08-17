package com.example.telukids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumbersChooseMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numberschoosemode);

        Button btnbackNumbersChooseMode = findViewById(R.id.btnbackNumbersChooseMode);
        Button btnNumbersLearnMode = findViewById(R.id.btnNumbersLearnMode);
        Button btnNumbersAssessmentMode = findViewById(R.id.btnNumbersAssessmentMode);



        btnbackNumbersChooseMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(NumbersChooseMode.this, LessonIntroNumbers.class);
                startActivity(back);
            }
        });
        btnNumbersLearnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(NumbersChooseMode.this, NumbersChooseMode.class);
                startActivity(proceed);
            }
        });
        btnNumbersAssessmentMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(NumbersChooseMode.this, NumbersChooseMode.class);
                startActivity(proceed);
            }
        });
    }
}