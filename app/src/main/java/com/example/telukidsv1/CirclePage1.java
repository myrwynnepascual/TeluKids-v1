package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CirclePage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circlepage1);

        Button btnbackCirclePage1 = findViewById(R.id.btnbackCirclePage1);
        Button btnnextCirclePage1 = findViewById(R.id.btnnextCirclePage1);


        btnbackCirclePage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage1.this, CircleHomepage.class);
                startActivity(back);
            }
        });
        btnnextCirclePage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage1.this, CirclePage2.class);
                startActivity(back);
            }
        });



    }
}
