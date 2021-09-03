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

public class HeartPage3 extends AppCompatActivity {

    VideoView videoViewHPG3;
    String videoPathHPG3;
    Uri uriHPG3;
    ImageButton backbtnHPG3,nextbtnHPG3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_page3);

        videoViewHPG3 = findViewById(R.id.videoHPG3);
        backbtnHPG3 = findViewById(R.id.btnbackHPG3);
        nextbtnHPG3 = findViewById(R.id.nextbtnHPG3);

        videoPathHPG3 = "android.resource://" + getPackageName() + "/" + R.raw.heart3;
        uriHPG3 = Uri.parse(videoPathHPG3);
        videoViewHPG3.setVideoURI(uriHPG3);

        videoViewHPG3.start();

        videoViewHPG3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnHPG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HeartPage3.this,HeartPage2.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nextbtnHPG3.setVisibility(VISIBLE);

                nextbtnHPG3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(HeartPage3.this, HeartPage4.class));

                    }
                });
            }
        },4000);
    }
}