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

public class CirclePage2 extends AppCompatActivity {

    VideoView videoViewCPG2;
    TextView tapCPG2;
    ImageButton backCPG2;
    String videoPathCPG2;
    Uri uriCPG2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page2);

        videoViewCPG2 = findViewById(R.id.videoCPG2);
        backCPG2 = findViewById(R.id.btnbackCPG2);
        tapCPG2 = findViewById(R.id.tapCPG2);

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

        backCPG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage2.this,CirclePage1.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapCPG2.setVisibility(VISIBLE);

                videoViewCPG2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(CirclePage2.this, CirclePage3.class));

                    }
                });
            }
        },3000);

    }
}