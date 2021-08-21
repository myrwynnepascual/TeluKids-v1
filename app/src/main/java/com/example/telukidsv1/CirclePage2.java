package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CirclePage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circlepage2);

        Button btnbackCirclePage2 = findViewById(R.id.btnbackCirclePage2);
        Button btnnextCirclePage2 = findViewById(R.id.btnnextCirclePage2);


        btnbackCirclePage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage2.this, CirclePage1.class);
                startActivity(back);
            }
        });
        btnnextCirclePage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage2.this, CirclePage3.class);
                startActivity(back);
            }
        });



    }
}
