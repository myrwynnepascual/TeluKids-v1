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

public class RectanglePage6 extends AppCompatActivity {

    VideoView videoViewRPG6;
    TextView instructRPG6;
    String videoPathRPG6;
    Uri uriRPG6;
    ImageButton backbtnRPG6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_page6);

        videoViewRPG6 = findViewById(R.id.videoRPG6);
        backbtnRPG6 = findViewById(R.id.btnbackRPG6);
        instructRPG6 = findViewById(R.id.tapRPG6);

        videoPathRPG6 = "android.resource://" + getPackageName() + "/" + R.raw.rectangle6;
        uriRPG6 = Uri.parse(videoPathRPG6);
        videoViewRPG6.setVideoURI(uriRPG6);

        videoViewRPG6.start();

        videoViewRPG6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnRPG6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RectanglePage6.this,RectanglePage5.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructRPG6.setVisibility(VISIBLE);

                videoViewRPG6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(RectanglePage6.this,ShapesLessonCongrats.class));

                    }
                });
            }
        },3000);
    }
}