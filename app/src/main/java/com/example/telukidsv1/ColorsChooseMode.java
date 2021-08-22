package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorsChooseMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorschoosemode);

        Button btnbackColorsChooseMode = findViewById(R.id.btnbackColorsChooseMode);
        Button btnColorsLearnMode = findViewById(R.id.btnColorsLearnMode);
        Button btnColorsAssessmentMode = findViewById(R.id.btnColorsAssessmentMode);



        btnbackColorsChooseMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(ColorsChooseMode.this, LessonIntroColors.class);
                startActivity(back);
            }
        });
        btnColorsLearnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(ColorsChooseMode.this, ColorsChooseMode.class);
                startActivity(proceed);
            }
        });
        btnColorsAssessmentMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(ColorsChooseMode.this, ColorsChooseMode.class);
                startActivity(proceed);
            }
        });
    }
}