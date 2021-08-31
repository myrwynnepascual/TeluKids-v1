
package com.example.telukidsv1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.telukidsv1.QuizShapes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Transaction;

import java.util.HashMap;
import java.util.Map;

public class ResultsShapes extends AppCompatActivity {
    private int score_shapes;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_shapes);

        fStore = FirebaseFirestore.getInstance();
        user = fAuth.getCurrentUser();
        DocumentReference docRef = fStore.collection("users").document(user.getUid());

        TextView totalScoreLabel = findViewById(R.id.totalScoreLabel_Shapes);
        Button btnNext_Quiz_Shapes = findViewById(R.id.btnNext_Quiz_Shapes);

        score_shapes = getIntent().getIntExtra("RIGHT_ANSWER_COUNT_Shapes", 0);
        totalScoreLabel.setText(score_shapes + " / 5");

        fStore.runTransaction(new Transaction.Function<Void>() {
            @Override
            public Void apply(@NonNull Transaction transaction) throws FirebaseFirestoreException {
                transaction.update(docRef, "shapes quiz score: ", score_shapes);
                return null;
            }
        });

        btnNext_Quiz_Shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proceed = new Intent(ResultsShapes.this, CongratsPageShapes.class);
                startActivity(proceed);
            }
        });
    }
}