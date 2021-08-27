package com.example.telukidsv1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class CirclePage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_page1);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.trybg3;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}