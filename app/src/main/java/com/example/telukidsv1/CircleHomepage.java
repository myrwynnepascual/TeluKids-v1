package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CircleHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circlehomepage);

        Button btnbackCircleHomepage = findViewById(R.id.btnbackCircleHomepage);
        Button btnnextCircleHomepage = findViewById(R.id.btnnextCircleHomepage);


        btnbackCircleHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CircleHomepage.this, LessonIntroShapes.class);
                startActivity(back);
            }
        });
        btnnextCircleHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CircleHomepage.this, CirclePage1.class);
                startActivity(back);
            }
        });



    }
}
