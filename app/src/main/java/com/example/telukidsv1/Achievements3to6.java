package com.example.telukidsv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Transaction;

public class Achievements3to6 extends AppCompatActivity {
    private int score_shapes;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    String achievement_numbers, achievement_colors, achievement_shapes;
    String achievement_discipline, achievement_honesty, achievement_respect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievements_ages36);

        ImageView imgAchievements3to6_Colors = findViewById(R.id.imgAchievements3to6_Colors);
        ImageView imgAchievements3to6_Numbers = findViewById(R.id.imgAchievements3to6_Numbers);
        ImageView imgAchievements3to6_Shapes = findViewById(R.id.imgAchievements3to6_Shapes);
        ImageView imgAchievements3to6_Discipline = findViewById(R.id.imgAchievements3to6_Discipline);
        ImageView imgAchievements3to6_Honesty = findViewById(R.id.imgAchievements3to6_Honesty);
        ImageView imgAchievements3to6_Respect = findViewById(R.id.imgAchievements3to6_Respect);
        ImageButton backbtnAchievements3to6 = findViewById(R.id.backbtnAchievements3to6);


        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = fAuth.getCurrentUser();
        DocumentReference docRef = fStore.collection("users").document(user.getUid());

           fStore.runTransaction(new Transaction.Function<Void>() {
               @Override
               public Void apply(@NonNull Transaction transaction) throws FirebaseFirestoreException {
                   DocumentSnapshot documentSnapshot = transaction.get(docRef);
                   achievement_shapes = documentSnapshot.getString("shapes achievement");
                   if (achievement_shapes.equals("Good")){
                       imgAchievements3to6_Shapes.setImageResource(R.drawable.medal_good);
                   }
                   if (achievement_shapes.equals("Very Good")){
                       imgAchievements3to6_Shapes.setImageResource(R.drawable.medal_verygood);
                   }
                   if (achievement_shapes.equals("Shapes Master")){
                       imgAchievements3to6_Shapes.setImageResource(R.drawable.tropy_shapesmaster);
                   }
                   return null;
               }
           });
        backbtnAchievements3to6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(Achievements3to6.this, Homepage3to6.class);
                startActivity(proceed);
            }
        });

    }
}
