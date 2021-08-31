package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseModeShapes extends AppCompatActivity {

    ImageButton backCMS,learnCMS,assessCMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode_shapes);

        backCMS = findViewById(R.id.backbtnCMS);
        learnCMS = findViewById(R.id.learnCMS);
        assessCMS = findViewById(R.id.assessCMS);

        backCMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseModeShapes.this,LessonIntroShapes.class));
            }
        });

        learnCMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseModeShapes.this,CirclePage1.class));
            }
        });

        assessCMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseModeShapes.this,CirclePage1.class));
            }
        });
    }
}