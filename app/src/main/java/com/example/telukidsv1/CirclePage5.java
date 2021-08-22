package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CirclePage5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circlepage5);

        Button btnbackCirclePage5 = findViewById(R.id.btnbackCirclePage5);
        Button btnnextCirclePage5 = findViewById(R.id.btnnextCirclePage5);


        btnbackCirclePage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage5.this, CirclePage4.class);
                startActivity(back);
            }
        });
        btnnextCirclePage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage5.this, CirclePage5.class);
                startActivity(back);
            }
        });



    }
}
