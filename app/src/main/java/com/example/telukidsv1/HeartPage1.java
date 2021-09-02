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

public class HeartPage1 extends AppCompatActivity {

    VideoView videoViewHPG1;
    TextView instructHPG1;
    String videoPathHPG1;
    Uri uriHPG1;
    ImageButton backbtnHPG1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_page1);

        videoViewHPG1 = findViewById(R.id.videoHPG1);
        backbtnHPG1 = findViewById(R.id.btnbackHPG1);
        instructHPG1 = findViewById(R.id.tapHPG1);

        videoPathHPG1 = "android.resource://" + getPackageName() + "/" + R.raw.heart1;
        uriHPG1 = Uri.parse(videoPathHPG1);
        videoViewHPG1.setVideoURI(uriHPG1);

        videoViewHPG1.start();

        videoViewHPG1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnHPG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HeartPage1.this,StarPage6.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructHPG1.setVisibility(VISIBLE);

                videoViewHPG1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(HeartPage1.this, HeartPage2.class));

                    }
                });
            }
        },13000);
    }
}