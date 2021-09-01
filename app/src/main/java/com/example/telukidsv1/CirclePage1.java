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
    VideoView videoViewCPG11;
    TextView instructCPG11;
    String videoPathCPG11;
    Uri uriCPG11;
    ImageButton backbtnCPG11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page1);

        videoViewCPG11 = findViewById(R.id.videoCPG1);
        backbtnCPG11 = findViewById(R.id.btnbackCPG1);
        instructCPG11 = findViewById(R.id.tapc11);

        videoPathCPG11 = "android.resource://" + getPackageName() + "/" + R.raw.circle11;
        uriCPG11 = Uri.parse(videoPathCPG11);
        videoViewCPG11.setVideoURI(uriCPG11);

        videoViewCPG11.start();

        videoViewCPG11.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnCPG11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage1.this,ChooseModeShapes.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructCPG11.setVisibility(VISIBLE);

                videoViewCPG11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(CirclePage1.this, CirclePage2.class));
                    }
                });
            }
        },13000);

    }
}