package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class CirclePage2 extends AppCompatActivity {
    VideoView videoViewCPG2;
    String videoPathCPG2;
    Uri uriCPG2;
    ImageButton backbtnCPG2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page2);

        videoViewCPG2 = findViewById(R.id.videoCPG2);
        backbtnCPG2 = findViewById(R.id.btnbackCPG2);

        videoPathCPG2 = "android.resource://" + getPackageName() + "/" + R.raw.circle2;
        uriCPG2 = Uri.parse(videoPathCPG2);
        videoViewCPG2.setVideoURI(uriCPG2);

        videoViewCPG2.start();

        videoViewCPG2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        videoViewCPG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage2.this,CirclePage2.class));
            }
        });

        backbtnCPG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage2.this,CirclePage1.class));
            }
        });
    }
}