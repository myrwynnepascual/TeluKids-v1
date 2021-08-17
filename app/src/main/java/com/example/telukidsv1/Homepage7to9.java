package com.example.telukids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage7to9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage7to9);

        Button btnbackHomepage7to9 = findViewById(R.id.btnbackHomepage7to9);
        Button btnGMRCTopics2 = findViewById(R.id.btnGMRCTopics2);
        Button btnAchievements2 = findViewById(R.id.btnAchievements2);


        btnbackHomepage7to9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Homepage7to9.this, AgeSelection.class);
                startActivity(back);
            }
        });



    }
}