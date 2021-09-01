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

public class CirclePage4 extends AppCompatActivity {

    VideoView videoViewCPG4;
    TextView tapCPG4;
    ImageButton backCPG4;
    String videoPathCPG4;
    Uri uriCPG4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page4);

        videoViewCPG4 = findViewById(R.id.videoCPG4);
        backCPG4 = findViewById(R.id.btnbackCPG4);
        tapCPG4 = findViewById(R.id.tapCPG4);

        videoPathCPG4 = "android.resource://" + getPackageName() + "/" + R.raw.circle4;
        uriCPG4 = Uri.parse(videoPathCPG4);
        videoViewCPG4.setVideoURI(uriCPG4);

        videoViewCPG4.start();

        videoViewCPG4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backCPG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage4.this,CirclePage3.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapCPG4.setVisibility(VISIBLE);

                videoViewCPG4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(CirclePage4.this, CirclePage5.class));

                    }
                });
            }
        },3000);
    }
}