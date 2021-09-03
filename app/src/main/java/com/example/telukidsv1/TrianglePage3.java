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

public class TrianglePage3 extends AppCompatActivity {

    VideoView videoViewTPG3;
    ImageButton backTPG3,nextbtnTPG3;
    String videoPathTPG3;
    Uri uriTPG3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_page3);

        videoViewTPG3 = findViewById(R.id.videoTPG3);
        backTPG3 = findViewById(R.id.btnbackTPG3);
        nextbtnTPG3 = findViewById(R.id.nextbtnTPG3);

        videoPathTPG3 = "android.resource://" + getPackageName() + "/" + R.raw.triangle3;
        uriTPG3 = Uri.parse(videoPathTPG3);
        videoViewTPG3.setVideoURI(uriTPG3);

        videoViewTPG3.start();

        videoViewTPG3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        backTPG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrianglePage3.this,TrianglePage2.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                nextbtnTPG3.setVisibility(VISIBLE);

                nextbtnTPG3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        startActivity(new Intent(TrianglePage3.this, TrianglePage4.class));

                    }
                });
            }
        },3000);
    }
}