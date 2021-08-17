package com.example.telukids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgeSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ageselection);

        Button btnAge3to6 = findViewById(R.id.btnAge3to6);
        Button btnAge7to9 = findViewById(R.id.btnAges7to9);

        btnAge3to6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(AgeSelection.this, Homepage3to6.class);
                startActivity(back);
            }
        });
        btnAge7to9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(AgeSelection.this, Homepage7to9.class);
                startActivity(proceed);
            }
        });


    }
}