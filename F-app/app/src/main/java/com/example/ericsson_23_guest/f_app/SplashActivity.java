package com.example.ericsson_23_guest.f_app;


import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;



/**
 * Created by Ericsson_23_Guest on 4/7/2017.
 */

public class SplashActivity extends AppCompatActivity {

    VideoView videoView;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            videoView = (VideoView) findViewById(R.id.video);
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.clock));
            videoView.setMediaController(new MediaController(this));
            videoView.requestFocus();
            videoView.start();
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    Intent intent = new Intent(SplashActivity.this,
                            MainActivity.class);
                    startActivity(intent);
                }
            });

                }

            }







