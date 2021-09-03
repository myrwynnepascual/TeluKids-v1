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

public class DiamondPage5 extends AppCompatActivity {

    VideoView videoViewDPG5;
    String videoPathDPG5;
    Uri uriDPG5;
    ImageButton backbtnDPG5, nextbtnDPG5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamond_page5);

        videoViewDPG5 = findViewById(R.id.videoDPG5);
        backbtnDPG5 = findViewById(R.id.btnbackDPG5);
        nextbtnDPG5 = findViewById(R.id.nextbtnDPG5);

        videoPathDPG5 = "android.resource://" + getPackageName() + "/" + R.raw.diamond5;
        uriDPG5 = Uri.parse(videoPathDPG5);
        videoViewDPG5.setVideoURI(uriDPG5);

        videoViewDPG5.start();

        videoViewDPG5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnDPG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(DiamondPage5.this,DiamondPage4.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nextbtnDPG5.setVisibility(VISIBLE);

                nextbtnDPG5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(DiamondPage5.this, DiamondPage6.class));

                    }
                });
            }
        },4000);
    }
}