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

public class RectanglePage5 extends AppCompatActivity {

    VideoView videoViewRPG5;
    TextView instructRPG5;
    String videoPathRPG5;
    Uri uriRPG5;
    ImageButton backbtnRPG5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_page5);

        videoViewRPG5 = findViewById(R.id.videoRPG5);
        backbtnRPG5 = findViewById(R.id.btnbackRPG5);
        instructRPG5 = findViewById(R.id.tapRPG5);

        videoPathRPG5 = "android.resource://" + getPackageName() + "/" + R.raw.rectangle5;
        uriRPG5 = Uri.parse(videoPathRPG5);
        videoViewRPG5.setVideoURI(uriRPG5);

        videoViewRPG5.start();

        videoViewRPG5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnRPG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RectanglePage5.this,RectanglePage4.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructRPG5.setVisibility(VISIBLE);

                videoViewRPG5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(RectanglePage5.this, RectanglePage6.class));

                    }
                });
            }
        },3000);
    }
}