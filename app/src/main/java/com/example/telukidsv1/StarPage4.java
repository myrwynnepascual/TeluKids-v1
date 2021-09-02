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

public class StarPage4 extends AppCompatActivity {

    VideoView videoViewSTPG4 ;
    TextView tapSTPG4 ;
    ImageButton backSTPG4 ;
    String videoPathSTPG4 ;
    Uri uriSTPG4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_page4);

        videoViewSTPG4  = findViewById(R.id.videoSTPG4 );
        backSTPG4  = findViewById(R.id.btnbackSTPG4 );
        tapSTPG4  = findViewById(R.id.tapSTPG4 );

        videoPathSTPG4  = "android.resource://" + getPackageName() + "/" + R.raw.star4;
        uriSTPG4  = Uri.parse(videoPathSTPG4 );
        videoViewSTPG4 .setVideoURI(uriSTPG4 );

        videoViewSTPG4 .start();

        videoViewSTPG4 .setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backSTPG4 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StarPage4.this,StarPage3.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapSTPG4 .setVisibility(VISIBLE);

                videoViewSTPG4 .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(StarPage4.this, StarPage5.class));

                    }
                });
            }
        },3000);
    }
}