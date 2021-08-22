package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CirclePage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circlepage3);

        Button btnbackCirclePage3 = findViewById(R.id.btnbackCirclePage3);
        Button btnnextCirclePage3 = findViewById(R.id.btnnextCirclePage3);


        btnbackCirclePage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage3.this, CirclePage2.class);
                startActivity(back);
            }
        });
        btnnextCirclePage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CirclePage3.this, CirclePage4.class);
                startActivity(back);
            }
        });



    }
}
