package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonIntroColors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessonintrocolors);

        Button btnbackIntroColors = findViewById(R.id.btnbackIntroColors);
        Button btnnextIntroColors = findViewById(R.id.btnnextIntroColors);


        btnbackIntroColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(LessonIntroColors.this, BConceptsPage.class);
                startActivity(back);
            }
        });
        btnnextIntroColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(LessonIntroColors.this, ColorsChooseMode.class);
                startActivity(proceed);
            }
        });


    }
}