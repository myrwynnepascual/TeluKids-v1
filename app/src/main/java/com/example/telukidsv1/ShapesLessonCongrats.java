package com.example.telukidsv1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class ShapesLessonCongrats extends AppCompatActivity {

    ImageButton btnbackSLC,btnachievementsSLC, btnassessmentSLC, btnhomepageSLC;
    ImageView certificateSLC;
    String userID, username, usericon;

    FirebaseAuth fAuth;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes_lesson_congrats);

        btnbackSLC = findViewById(R.id.backbtnSLC);
        btnachievementsSLC = findViewById(R.id.achievementsbtnSLC);
        certificateSLC = findViewById(R.id.certificateSLC);
        btnassessmentSLC = findViewById(R.id.asessmentbtnSLC);
        btnhomepageSLC = findViewById(R.id.homepageSLC);

        btnbackSLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(ShapesLessonCongrats.this, - .class));
            }
        });

        btnachievementsSLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShapesLessonCongrats.this,Achievements3to6.class));
            }
        });

        btnassessmentSLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShapesLessonCongrats.this, QuizShapes.class));
            }
        });

        btnhomepageSLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShapesLessonCongrats.this, BasicConcepts.class));
            }
        });

    }
}