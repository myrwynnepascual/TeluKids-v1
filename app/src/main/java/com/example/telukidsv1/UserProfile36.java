package com.example.telukidsv1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class UserProfile36 extends AppCompatActivity {
    ImageButton btnbackUP, btneditUP, btnlogoutUP;
    TextView greetUP;
    String userID, username;

    FirebaseAuth fAuth;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile36);

        greetUP = findViewById(R.id.greetingsUP);
        btnbackUP = findViewById(R.id.backbtnUP);
        btneditUP = findViewById(R.id.editprofilebtnUP);
        btnlogoutUP = findViewById(R.id.logoutbtnUP);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        userID = fAuth.getCurrentUser().getUid();
        DocumentReference documentReference = fStore.collection("users").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                username = documentSnapshot.getString("username");
                greetUP.setText("Hi, " +username + "!");
            }
        });



        btnbackUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile36.this,Homepage3to6.class));
            }
        });

        btneditUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile36.this, EditProfile36.class));
            }
        });

        btnlogoutUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(UserProfile36.this, LogoutConfirmation36.class));

            }
        });
    }
}