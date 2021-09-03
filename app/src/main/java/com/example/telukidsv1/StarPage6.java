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

public class StarPage6 extends AppCompatActivity {

    VideoView videoViewSTPG6 ;
    TextView tapSTPG6 ;
    ImageButton backSTPG6 ;
    String videoPathSTPG6 ;
    Uri uriSTPG6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_page6);

        videoViewSTPG6  = findViewById(R.id.videoSTPG6 );
        backSTPG6  = findViewById(R.id.btnbackSTPG6 );
        tapSTPG6  = findViewById(R.id.tapSTPG6 );

        videoPathSTPG6  = "android.resource://" + getPackageName() + "/" + R.raw.star6;
        uriSTPG6  = Uri.parse(videoPathSTPG6 );
        videoViewSTPG6 .setVideoURI(uriSTPG6 );

        videoViewSTPG6 .start();

        videoViewSTPG6 .setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backSTPG6 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StarPage6.this,StarPage5.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapSTPG6 .setVisibility(VISIBLE);

                videoViewSTPG6 .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(StarPage6.this, HeartPage1.class));

                    }
                });
            }
        },3000);
    }
}