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

public class SquarePage3 extends AppCompatActivity {

    VideoView videoViewSPG3;
    TextView tapSPG3;
    ImageButton backSPG3;
    String videoPathSPG3;
    Uri uriSPG3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_page3);

        videoViewSPG3 = findViewById(R.id.videoSPG3);
        backSPG3 = findViewById(R.id.btnbackSPG3);
        tapSPG3 = findViewById(R.id.tapSPG3);

        videoPathSPG3 = "android.resource://" + getPackageName() + "/" + R.raw.square3;
        uriSPG3 = Uri.parse(videoPathSPG3);
        videoViewSPG3.setVideoURI(uriSPG3);

        videoViewSPG3.start();

        videoViewSPG3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backSPG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SquarePage3.this,SquarePage2.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapSPG3.setVisibility(VISIBLE);

                videoViewSPG3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(SquarePage3.this, SquarePage4.class));

                    }
                });
            }
        },3000);
    }
}