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

public class DiamondPage2 extends AppCompatActivity {

    VideoView videoViewDPG2;
    TextView instructDPG2;
    String videoPathDPG2;
    Uri uriDPG2;
    ImageButton backbtnDPG2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamond_page2);

        videoViewDPG2 = findViewById(R.id.videoDPG2);
        backbtnDPG2 = findViewById(R.id.btnbackDPG2);
        instructDPG2 = findViewById(R.id.tapDPG2);

        videoPathDPG2 = "android.resource://" + getPackageName() + "/" + R.raw.diamond2;
        uriDPG2 = Uri.parse(videoPathDPG2);
        videoViewDPG2.setVideoURI(uriDPG2);

        videoViewDPG2.start();

        videoViewDPG2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnDPG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(DiamondPage2.this,DiamondPage1.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructDPG2.setVisibility(VISIBLE);

                videoViewDPG2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(DiamondPage2.this, DiamondPage3.class));

                    }
                });
            }
        },3000);
    }
}