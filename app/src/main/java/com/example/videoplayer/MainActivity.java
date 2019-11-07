package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;
import bg.devlabs.fullscreenvideoview.FullscreenVideoView;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FullscreenVideoView videoView = findViewById(R.id.fullscreenVideoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        String videoUrl = "https://clips.vorwaerts-gmbh.de/VfE_html5.mp4";
        videoView.videoUrl(videoUrl).addSeekBackwardButton().addSeekForwardButton().enableAutoStart(); //customize controls
        //Customize fast-forward and/or rewind seconds
        //videoView.videoUrl(videoUrl)
        //        .fastForwardSeconds(5)
        //        .rewindSeconds(5)
        //videoView.videoUrl(videoUrl)
        //        .playDrawable(R.drawable.ic_play)
        //        .pauseDrawable(R.drawable.ic_pause)
        //        .fastForwardDrawable(R.drawable.ic_fast_forward)
        //        .rewindDrawable(R.drawable.ic_rewind)
        //        .enterFullscreenDrawable(R.drawable.ic_fullscreen)
        //        .exitFullscreenDrawable(R.drawable.ic_fullscreen_exit)


    }

}
