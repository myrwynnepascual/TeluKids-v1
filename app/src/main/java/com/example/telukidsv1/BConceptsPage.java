package com.example.telukids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BConceptsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bconceptspage);

        Button btnbackBConcepts = findViewById(R.id.btnbackBConcepts);
        Button btnColors = findViewById(R.id.btnColors);
        Button btnNumbers = findViewById(R.id.btnNumbers);
        Button btnShapes = findViewById(R.id.btnShapes);



        btnbackBConcepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(BConceptsPage.this, Homepage3to6.class);
                startActivity(back);
            }
        });
        btnColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(BConceptsPage.this, LessonIntroColors.class);
                startActivity(proceed);
            }
        });
        btnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(BConceptsPage.this, LessonIntroNumbers.class);
                startActivity(proceed);
            }
        });
        btnShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(BConceptsPage.this, LessonIntroShapes.class);
                startActivity(proceed);
            }
        });
    }
}