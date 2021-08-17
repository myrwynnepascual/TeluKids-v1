package com.example.telukids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShapesChooseMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shapeschoosemode);

        Button btnbackShapesChooseMode = findViewById(R.id.btnbackShapesChooseMode);
        Button btnShapesLearnMode = findViewById(R.id.btnShapesLearnMode);
        Button btnShapesAssessmentMode = findViewById(R.id.btnShapesAssessmentMode);



        btnbackShapesChooseMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(ShapesChooseMode.this, LessonIntroShapes.class);
                startActivity(back);
            }
        });
        btnShapesLearnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(ShapesChooseMode.this, ShapesChooseMode.class);
                startActivity(proceed);
            }
        });
        btnShapesAssessmentMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(ShapesChooseMode.this, ShapesChooseMode.class);
                startActivity(proceed);
            }
        });
    }
}