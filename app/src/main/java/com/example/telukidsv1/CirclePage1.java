package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class CirclePage1 extends AppCompatActivity {
    VideoView videoViewCPG1;
    String videoPathCPG1;
    Uri uriCPG1;
    ImageButton backbtnCPG1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page1);

        videoViewCPG1 = findViewById(R.id.videoCPG1);
        backbtnCPG1 = findViewById(R.id.btnbackCPG1);

        videoPathCPG1 = "android.resource://" + getPackageName() + "/" + R.raw.circleintro;
        uriCPG1 = Uri.parse(videoPathCPG1);
        videoViewCPG1.setVideoURI(uriCPG1);

        videoViewCPG1.start();

        videoViewCPG1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        videoViewCPG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage1.this,CirclePage2.class));
            }
        });

        backbtnCPG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage1.this,ChooseModeShapes.class));
            }
        });


    }
}