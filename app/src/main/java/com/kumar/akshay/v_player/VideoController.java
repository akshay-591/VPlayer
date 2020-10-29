package com.kumar.akshay.v_player;

import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

public class VideoController extends MediaController {

    private static final String TAG = "VideoC";

    public VideoController(Context context) {
        super(context);
        Log.d(TAG, "VideoController: Constructor called");

    }

    @Override
    public void setAnchorView(View view) {
        Log.d(TAG, "setAnchorView: called");
        super.setAnchorView(view);

    }

    @Override
    public void onFinishInflate() {
        Log.d(TAG, "onFinishInflate: called");

        super.onFinishInflate();
    }

    @Override
    public void setMediaPlayer(MediaPlayerControl player) {
        Log.d(TAG, "setMediaPlayer: called");
        super.setMediaPlayer(player);

    }
    /**
     * if is showing return false then this method is called and this method called second
     * show(int timeout) method and by default set the timeout to 3000 ms
     *
     */
    @Override
    public void show() {
        Log.d(TAG, "show: Called");
        super.show();

    }

    /**
     * This method is called by above method and by default 3000 ms received by it
     * @param timeout How much the medial controller button should remain on screen.
     */
    @Override
    public void show(int timeout) {
        Log.d(TAG, "show: called and Timeout is =  "+timeout);
        super.show(timeout);

    }

    /**
     * This method is called when user touch the screen/VideoView
     * @return boolean
     */
    @Override
    public boolean isShowing() {
        Log.d(TAG, "isShowing: called");
        return super.isShowing();

    }

    /**
     * After timeout this method is called to hide the controller from screen.
     *
     */
    @Override
    public void hide() {
        Log.d(TAG, "hide: called");
        super.hide();

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: called");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent ev) {
        Log.d(TAG, "onTrackballEvent: called");

        return super.onTrackballEvent(ev);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        Log.d(TAG, "dispatchKeyEvent: called");
        return super.dispatchKeyEvent(event);

    }

    @Override
    public void setEnabled(boolean enabled) {
        Log.d(TAG, "setEnabled: called");
        super.setEnabled(enabled);

    }

    @Override
    public CharSequence getAccessibilityClassName() {
        Log.d(TAG, "getAccessibilityClassName: called");
        return super.getAccessibilityClassName();
    }

    @Override
    public void setPrevNextListeners(OnClickListener next, OnClickListener prev) {
        Log.d(TAG, "setPrevNextListeners: called");
        super.setPrevNextListeners(next, prev);
    }
}
