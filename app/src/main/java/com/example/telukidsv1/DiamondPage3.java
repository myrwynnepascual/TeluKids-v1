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

public class DiamondPage3 extends AppCompatActivity {

    VideoView videoViewDPG3;
    TextView instructDPG3;
    String videoPathDPG3;
    Uri uriDPG3;
    ImageButton backbtnDPG3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamond_page3);

        videoViewDPG3 = findViewById(R.id.videoDPG3);
        backbtnDPG3 = findViewById(R.id.btnbackDPG3);
        instructDPG3 = findViewById(R.id.tapDPG3);

        videoPathDPG3 = "android.resource://" + getPackageName() + "/" + R.raw.diamond3;
        uriDPG3 = Uri.parse(videoPathDPG3);
        videoViewDPG3.setVideoURI(uriDPG3);

        videoViewDPG3.start();

        videoViewDPG3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnDPG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(DiamondPage3.this,DiamondPage2.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructDPG3.setVisibility(VISIBLE);

                videoViewDPG3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(DiamondPage3.this, DiamondPage4.class));

                    }
                });
            }
        },3000);
    }
}