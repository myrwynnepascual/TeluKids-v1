package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UserProfile36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile36);

        ImageButton btnbackUP, btneditUP, btnlogoutUP;

        btnbackUP = findViewById(R.id.backbtnUP);
        btneditUP = findViewById(R.id.editprofilebtnUP);
        btnlogoutUP = findViewById(R.id.logoutbtnUP);


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