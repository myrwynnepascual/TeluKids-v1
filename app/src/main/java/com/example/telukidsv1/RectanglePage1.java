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

public class RectanglePage1 extends AppCompatActivity {

    VideoView videoViewRPG1;
    TextView instructRPG1;
    String videoPathRPG1;
    Uri uriRPG1;
    ImageButton backbtnRPG1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_page1);

        videoViewRPG1 = findViewById(R.id.videoRPG1);
        backbtnRPG1 = findViewById(R.id.btnbackRPG1);
        instructRPG1 = findViewById(R.id.tapRPG1);

        videoPathRPG1 = "android.resource://" + getPackageName() + "/" + R.raw.rectangle1;
        uriRPG1 = Uri.parse(videoPathRPG1);
        videoViewRPG1.setVideoURI(uriRPG1);

        videoViewRPG1.start();

        videoViewRPG1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnRPG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RectanglePage1.this,HeartPage6.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructRPG1.setVisibility(VISIBLE);

                videoViewRPG1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(RectanglePage1.this, RectanglePage2.class));

                    }
                });
            }
        },15000);
    }
}