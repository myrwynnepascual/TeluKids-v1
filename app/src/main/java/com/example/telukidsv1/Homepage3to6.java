package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage3to6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage3to6);

        ImageButton btnbackH36, btnUserProf36, btnBConcepts, btnGMRC36Topics, btnAchievements;

        btnbackH36 = findViewById(R.id.backbtnH36);
        btnUserProf36 = findViewById(R.id.userprofilebtn);
        btnBConcepts = findViewById(R.id.basicconceptsH36);
        btnGMRC36Topics = findViewById(R.id.gmrcH36);
        btnAchievements = findViewById(R.id.achivementsH36);

        btnbackH36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Homepage3to6.this, CategorySelection.class));
            }
        });

        btnUserProf36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage3to6.this, UserProfile36.class));
            }
        });

        btnBConcepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(Homepage3to6.this, BConceptsPage.class));
            }
        });

        btnGMRC36Topics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Homepage3to6.this, GMRC36Page.class));
            }
        });

        btnAchievements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Homepage3to6.this, Achievements.class));
            }
        });

    }
}