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

public class RectanglePage3 extends AppCompatActivity {

    VideoView videoViewRPG3;
    TextView instructRPG3;
    String videoPathRPG3;
    Uri uriRPG3;
    ImageButton backbtnRPG3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_page3);

        videoViewRPG3 = findViewById(R.id.videoRPG3);
        backbtnRPG3 = findViewById(R.id.btnbackRPG3);
        instructRPG3 = findViewById(R.id.tapRPG3);

        videoPathRPG3 = "android.resource://" + getPackageName() + "/" + R.raw.rectangle3;
        uriRPG3 = Uri.parse(videoPathRPG3);
        videoViewRPG3.setVideoURI(uriRPG3);

        videoViewRPG3.start();

        videoViewRPG3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backbtnRPG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RectanglePage3.this,RectanglePage2.class));

            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                instructRPG3.setVisibility(VISIBLE);

                videoViewRPG3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(RectanglePage3.this, RectanglePage4.class));

                    }
                });
            }
        },3000);
    }
}