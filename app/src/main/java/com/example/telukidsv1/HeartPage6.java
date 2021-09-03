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

public class HeartPage6 extends AppCompatActivity {

    VideoView videoViewHPG6;
    TextView instructHPG6;
    String videoPathHPG6;
    Uri uriHPG6;
    ImageButton backbtnHPG6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_page6);

        videoViewHPG6 = findViewById(R.id.videoHPG6);
        backbtnHPG6 = findViewById(R.id.btnbackHPG6);
        instructHPG6 = findViewById(R.id.tapHPG6);

        videoPathHPG6 = "android.resource://" + getPackageName() + "/" + R.raw.heart6;
        uriHPG6 = Uri.parse(videoPathHPG6);
        videoViewHPG6.setVideoURI(uriHPG6);

        videoViewHPG6.start();

        videoViewHPG6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnHPG6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HeartPage6.this,HeartPage5.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructHPG6.setVisibility(VISIBLE);

                videoViewHPG6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(HeartPage6.this, RectanglePage1.class));

                    }
                });
            }
        },3000);
    }
}