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

public class RectanglePage4 extends AppCompatActivity {

    VideoView videoViewRPG4;
    TextView instructRPG4;
    String videoPathRPG4;
    Uri uriRPG4;
    ImageButton backbtnRPG4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_page4);

        videoViewRPG4 = findViewById(R.id.videoRPG4);
        backbtnRPG4 = findViewById(R.id.btnbackRPG4);
        instructRPG4 = findViewById(R.id.tapRPG4);

        videoPathRPG4 = "android.resource://" + getPackageName() + "/" + R.raw.rectangle4;
        uriRPG4 = Uri.parse(videoPathRPG4);
        videoViewRPG4.setVideoURI(uriRPG4);

        videoViewRPG4.start();

        videoViewRPG4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnRPG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RectanglePage4.this,RectanglePage3.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructRPG4.setVisibility(VISIBLE);

                videoViewRPG4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(RectanglePage4.this, RectanglePage5.class));

                    }
                });
            }
        },3000);
    }
}