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

public class TrianglePage1 extends AppCompatActivity {

    VideoView videoViewTPG1;
    TextView tapTPG1;
    ImageButton backTPG1;
    String videoPathTPG1;
    Uri uriTPG1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_page1);

        videoViewTPG1 = findViewById(R.id.videoTPG1);
        backTPG1 = findViewById(R.id.btnbackTPG1);
        tapTPG1 = findViewById(R.id.tapTPG1);

        videoPathTPG1 = "android.resource://" + getPackageName() + "/" + R.raw.triangle1;
        uriTPG1 = Uri.parse(videoPathTPG1);
        videoViewTPG1.setVideoURI(uriTPG1);

        videoViewTPG1.start();

        videoViewTPG1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backTPG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrianglePage1.this,SquarePage6.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                tapTPG1.setVisibility(VISIBLE);

                videoViewTPG1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(TrianglePage1.this, TrianglePage2.class));

                    }
                });
            }
        },10000);
    }
}