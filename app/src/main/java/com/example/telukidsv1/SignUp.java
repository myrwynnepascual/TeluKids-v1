package com.example.telukidsv1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignUp extends AppCompatActivity {
    EditText fnameSU,lnameSU,emailSU,usernameSU,passwordSU,confirmpwSU;
    ImageButton backbtnSU,signupbtnSU;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    //DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fnameSU = findViewById(R.id.firstnameSU);
        lnameSU = findViewById(R.id.lastnameSU);
        emailSU = findViewById(R.id.emailaddressSU);
        usernameSU = findViewById(R.id.usernameSU);
        passwordSU = findViewById(R.id.passwordSU);
        confirmpwSU = findViewById(R.id.confirmpasswordSU);
        backbtnSU = findViewById(R.id.backbtnSU);
        signupbtnSU = findViewById(R.id.signupbtnSU);

        fAuth = FirebaseAuth.getInstance();
        //reference = FirebaseDatabase.getInstance().getReference("credentials");

        //for returning users
        // if(fAuth.getCurrentUser() != null){
           // startActivity(new Intent(getApplicationContext(),SuccessfulSignUp.class));
            //finish();
       // }

        backbtnSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this,SignUpOrLogInPage.class));
            }
        });

        signupbtnSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = fnameSU.getText().toString();
                String lname = lnameSU.getText().toString();
                String email = emailSU.getText().toString().trim();
                String username = usernameSU.getText().toString();
                String password = passwordSU.getText().toString().trim();
                String password2 = confirmpwSU.getText().toString().trim();

                if(TextUtils.isEmpty(fname)){
                    fnameSU.setError("First Name is Required.");
                    return;
                }

                if(TextUtils.isEmpty(lname)){
                    lnameSU.setError("Last Name is Required.");
                    return;
                }

                if(TextUtils.isEmpty(email)){
                    emailSU.setError("Email is Required.");
                    return;
                }

                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    emailSU.setError("Enter a valid email address.");
                    return;
                }

                if(TextUtils.isEmpty(username)){
                    usernameSU.setError("Username is Required.");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    passwordSU.setError("Password is Required.");
                    return;
                }

                if(password.length() < 8){
                    passwordSU.setError("Password must be at least 8 characters.");
                    return;
                }

                if(TextUtils.isEmpty(password2)){
                    confirmpwSU.setError("Confirm Password is Required.");
                    return;
                }

                if(!password.equals(password2)){
                    passwordSU.setError("Passwords do not match.");
                    confirmpwSU.setError("Passwords do not match.");
                    return;
                }

                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(SignUp.this,"User Created",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),SuccessfulSignUp.class));
                        }

                        else {
                            Toast.makeText(SignUp.this,"Error: " + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });
    }
}