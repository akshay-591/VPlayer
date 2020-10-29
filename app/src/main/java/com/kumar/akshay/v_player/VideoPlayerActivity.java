package com.kumar.akshay.v_player;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * if is showing return false then this method is called
 * @param timeout
 */
import com.kumar.akshay.v_player.databinding.ActivityVideoPlayerBinding;
import com.kumar.akshay.v_player.databinding.TestBinding;

public class VideoPlayerActivity extends AppCompatActivity {
    private static final String TAG = "VideoPlayerActivity";
    private ActivityVideoPlayerBinding mBinding;
    private TestBinding testBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: called");
        super.onCreate(savedInstanceState);

        testBinding = TestBinding.inflate(getLayoutInflater());
        View view =testBinding.getRoot();
        setContentView(view);

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Receiving Uri from Intent Object passed by Video_Gallery activity
        Uri uri=getIntent().getData();

        //setting media controller
        VideoController mediaController = new VideoController(this);
        //setAnchor View means attaching media controller to some View in this case to Video View
        mediaController.setAnchorView(testBinding.videoView2);
        testBinding.videoView2.setMediaController(mediaController);
        //calling setVideo method which will play the video using uri of the File the uri contain Content Uri + file Id
        testBinding.videoView2.setVideoURI(uri);
        //starting Video
        testBinding.videoView2.start();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
