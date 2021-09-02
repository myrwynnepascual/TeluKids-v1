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

public class CirclePage5 extends AppCompatActivity {

    VideoView videoViewCPG5;
    TextView tapCPG5;
    ImageButton backCPG5;
    String videoPathCPG5;
    Uri uriCPG5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page5);

        videoViewCPG5 = findViewById(R.id.videoCPG5);
        backCPG5 = findViewById(R.id.btnbackCPG5);
        tapCPG5 = findViewById(R.id.tapCPG5);

        videoPathCPG5 = "android.resource://" + getPackageName() + "/" + R.raw.circle5;
        uriCPG5 = Uri.parse(videoPathCPG5);
        videoViewCPG5.setVideoURI(uriCPG5);

        videoViewCPG5.start();

        videoViewCPG5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backCPG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage5.this,CirclePage4.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapCPG5.setVisibility(VISIBLE);

                videoViewCPG5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(CirclePage5.this, CirclePage6.class));

                    }
                });
            }
        },3000);
    }
}