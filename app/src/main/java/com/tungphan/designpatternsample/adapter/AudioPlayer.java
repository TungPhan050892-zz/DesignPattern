package com.tungphan.designpatternsample.adapter;

import android.util.Log;

/**
 * Created by TungPhan on 1/4/18.
 */

public class AudioPlayer implements MediaPlayer {

    private final String TAG = AudioPlayer.class.getSimpleName();
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            Log.e(TAG, "Play mp3 " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            Log.e(TAG, "Invalid media type");
        }
    }
}
