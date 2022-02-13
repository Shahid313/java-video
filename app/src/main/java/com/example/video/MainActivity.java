package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView SeaView = (VideoView)findViewById(R.id.seaVideo);
        SeaView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sample);
        MediaController mediaController = new MediaController(this);
        SeaView.setMediaController(mediaController);
        mediaController.setAnchorView(SeaView);
        SeaView.start();
    }
}