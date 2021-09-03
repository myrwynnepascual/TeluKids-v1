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

public class DiamondPage4 extends AppCompatActivity {

    VideoView videoViewDPG4;
    String videoPathDPG4;
    Uri uriDPG4;
    ImageButton backbtnDPG4, nextbtnDPG4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamond_page4);

        videoViewDPG4 = findViewById(R.id.videoDPG4);
        backbtnDPG4 = findViewById(R.id.btnbackDPG4);
        nextbtnDPG4 = findViewById(R.id.nextbtnDPG4);

        videoPathDPG4 = "android.resource://" + getPackageName() + "/" + R.raw.diamond4;
        uriDPG4 = Uri.parse(videoPathDPG4);
        videoViewDPG4.setVideoURI(uriDPG4);

        videoViewDPG4.start();

        videoViewDPG4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnDPG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(DiamondPage4.this,DiamondPage3.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                nextbtnDPG4.setVisibility(VISIBLE);

                nextbtnDPG4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(DiamondPage4.this, DiamondPage5.class));

                    }
                });
            }
        },3000);
    }
}