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

public class HeartPage4 extends AppCompatActivity {

    VideoView videoViewHPG4;
    TextView instructHPG4;
    String videoPathHPG4;
    Uri uriHPG4;
    ImageButton backbtnHPG4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_page4);

        videoViewHPG4 = findViewById(R.id.videoHPG4);
        backbtnHPG4 = findViewById(R.id.btnbackHPG4);
        instructHPG4 = findViewById(R.id.tapHPG4);

        videoPathHPG4 = "android.resource://" + getPackageName() + "/" + R.raw.heart4;
        uriHPG4 = Uri.parse(videoPathHPG4);
        videoViewHPG4.setVideoURI(uriHPG4);

        videoViewHPG4.start();

        videoViewHPG4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnHPG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HeartPage4.this,HeartPage3.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructHPG4.setVisibility(VISIBLE);

                videoViewHPG4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(HeartPage4.this, HeartPage5.class));

                    }
                });
            }
        },3000);
    }
}