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

public class HeartPage2 extends AppCompatActivity {

    VideoView videoViewHPG2;
    TextView instructHPG2;
    String videoPathHPG2;
    Uri uriHPG2;
    ImageButton backbtnHPG2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_page2);

        videoViewHPG2 = findViewById(R.id.videoHPG2);
        backbtnHPG2 = findViewById(R.id.btnbackHPG2);
        instructHPG2 = findViewById(R.id.tapHPG2);

        videoPathHPG2 = "android.resource://" + getPackageName() + "/" + R.raw.heart2;
        uriHPG2 = Uri.parse(videoPathHPG2);
        videoViewHPG2.setVideoURI(uriHPG2);

        videoViewHPG2.start();

        videoViewHPG2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnHPG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HeartPage2.this,HeartPage1.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructHPG2.setVisibility(VISIBLE);

                videoViewHPG2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(HeartPage2.this, HeartPage3.class));

                    }
                });
            }
        },3000);
    }
}