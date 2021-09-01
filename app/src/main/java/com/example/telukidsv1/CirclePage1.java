package com.example.telukidsv1;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.VideoView;

public class CirclePage1 extends AppCompatActivity {
    VideoView videoViewCPG1;
    TextView instructCPG1;
    String videoPathCPG1,videoPathCPG12;
    Uri uriCPG1,uriCPG12;
    ImageButton backbtnCPG1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page1);

        videoViewCPG1 = findViewById(R.id.videoCPG1);
        backbtnCPG1 = findViewById(R.id.btnbackCPG1);
        instructCPG1 = findViewById(R.id.tapCPG1);

        videoPathCPG1 = "android.resource://" + getPackageName() + "/" + R.raw.circle1;
        uriCPG1 = Uri.parse(videoPathCPG1);
        videoViewCPG1.setVideoURI(uriCPG1);

        videoViewCPG1.start();

        videoViewCPG1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnCPG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(CirclePage1.this,ChooseModeShapes.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructCPG1.setVisibility(VISIBLE);

                videoViewCPG1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(CirclePage1.this, CirclePage2.class));

                    }
                });
            }
        },13000);
    }
}