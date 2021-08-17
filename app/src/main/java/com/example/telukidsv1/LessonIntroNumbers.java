package com.example.telukids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonIntroNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessonintronumbers);

        Button btnbackIntroNumbers = findViewById(R.id.btnbackIntroNumbers);
        Button btnnextIntroNumbers = findViewById(R.id.btnnextIntroNumbers);


        btnbackIntroNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(LessonIntroNumbers.this, BConceptsPage.class);
                startActivity(back);
            }
        });
        btnnextIntroNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(LessonIntroNumbers.this, NumbersChooseMode.class);
                startActivity(proceed);
            }
        });



    }
}