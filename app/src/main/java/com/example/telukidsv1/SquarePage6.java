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

public class SquarePage6 extends AppCompatActivity {

    VideoView videoViewSPG6;
    TextView tapSPG6;
    ImageButton backSPG6;
    String videoPathSPG6;
    Uri uriSPG6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_page6);

        videoViewSPG6 = findViewById(R.id.videoSPG6);
        backSPG6 = findViewById(R.id.btnbackSPG6);
        tapSPG6 = findViewById(R.id.tapSPG6);

        videoPathSPG6 = "android.resource://" + getPackageName() + "/" + R.raw.square6;
        uriSPG6 = Uri.parse(videoPathSPG6);
        videoViewSPG6.setVideoURI(uriSPG6);

        videoViewSPG6.start();

        videoViewSPG6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backSPG6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SquarePage6.this,SquarePage5.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapSPG6.setVisibility(VISIBLE);

                videoViewSPG6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //TENTATIVE
                        startActivity(new Intent(SquarePage6.this, ChooseModeShapes.class));

                    }
                });
            }
        },3000);
    }
}