package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CirclePage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circlepage4);

        Button btnbackCirclePage4 = findViewById(R.id.btnbackCirclePage4);
        Button btnnextCirclePage4 = findViewById(R.id.btnnextCirclePage4);


        btnbackCirclePage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage4.this, CirclePage3.class);
                startActivity(back);
            }
        });
        btnnextCirclePage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage4.this, CirclePage5.class);
                startActivity(back);
            }
        });



    }
}
