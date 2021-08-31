package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class LessonIntroShapes extends AppCompatActivity {

    ImageButton btnbackIntroShapes,btnnextIntroShapes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_intro_shapes);

        btnbackIntroShapes = findViewById(R.id.btnbackIntroShapes);
        btnnextIntroShapes = findViewById(R.id.btnnextIntroShapes);
        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoholder;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        videoView.start();


        btnbackIntroShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LessonIntroShapes.this, BasicConcepts.class));
            }
        });
        btnnextIntroShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LessonIntroShapes.this, CirclePage1.class));
            }
        });
    }
}