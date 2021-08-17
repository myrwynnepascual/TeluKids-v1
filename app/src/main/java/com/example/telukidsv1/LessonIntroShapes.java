package com.example.telukids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonIntroShapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessonintroshapes);

        Button btnbackIntroShapes = findViewById(R.id.btnbackIntroShapes);
        Button btnnextIntroShapes = findViewById(R.id.btnnextIntroShapes);


        btnbackIntroShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(LessonIntroShapes.this, BConceptsPage.class);
                startActivity(back);
            }
        });
        btnnextIntroShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(LessonIntroShapes.this, ShapesChooseMode.class);
                startActivity(back);
            }
        });



    }
}