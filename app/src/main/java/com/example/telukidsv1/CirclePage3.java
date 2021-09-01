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

public class CirclePage3 extends AppCompatActivity {

    VideoView videoViewCPG3;
    TextView tapCPG3;
    ImageButton backCPG3;
    String videoPathCPG3;
    Uri uriCPG3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page3);

        videoViewCPG3 = findViewById(R.id.videoCPG3);
        backCPG3 = findViewById(R.id.btnbackCPG3);
        tapCPG3 = findViewById(R.id.tapCPG3);

        videoPathCPG3 = "android.resource://" + getPackageName() + "/" + R.raw.circle3;
        uriCPG3 = Uri.parse(videoPathCPG3);
        videoViewCPG3.setVideoURI(uriCPG3);

        videoViewCPG3.start();

        videoViewCPG3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backCPG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CirclePage3.this,CirclePage2.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapCPG3.setVisibility(VISIBLE);

                videoViewCPG3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(CirclePage3.this, CirclePage4.class));

                    }
                });
            }
        },3000);

    }
}