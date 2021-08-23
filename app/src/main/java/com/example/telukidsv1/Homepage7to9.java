package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage7to9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage7to9);

       ImageButton btnbackH79, btnGMRC79Topics, btnAchievements;

       btnbackH79 = findViewById(R.id.backbtnH79);
       btnGMRC79Topics = findViewById(R.id.gmrcH79);
       btnAchievements = findViewById(R.id.achivementsH79);

       btnbackH79.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(Homepage7to9.this, CategorySelection.class));
           }
       });

       btnGMRC79Topics.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //startActivity(new Intent(Homepage7to9.this, GMRC79Page.class));
           }
       });

       btnAchievements.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //startActivity(new Intent(Homepage7to9.this, Achivements.class));
           }
       });

    }
}