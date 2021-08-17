package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SignUpOrLogInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_or_log_in_page);

        ImageButton signupbtnSOL,loginbtnSOL;

        signupbtnSOL = findViewById(R.id.signupbtnSOL);
        loginbtnSOL = findViewById(R.id.loginbtnSOL);

        signupbtnSOL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpOrLogInPage.this,SignUp.class));
            }
        });

        loginbtnSOL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpOrLogInPage.this,login.class));
            }
        });
    };
    }