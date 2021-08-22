package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage3to6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage3to6);

        Button btnbackHomepage3to6 = findViewById(R.id.btnbackHomepage3to6);
        Button btnBConcepts = findViewById(R.id.btnBConcepts);
        Button btnGMRCTopics = findViewById(R.id.btnGMRCTopics);
        Button btnAchievements = findViewById(R.id.btnAchievements);


        btnbackHomepage3to6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Homepage3to6.this, AgeSelection.class);
                startActivity(back);
            }
        });
        btnBConcepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(Homepage3to6.this, BConceptsPage.class);
                startActivity(proceed);
            }
        });


    }
}