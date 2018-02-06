package com.tungphan.designpatternsample.structural.adapter;

/**
 * Created by TungPhan on 1/4/18.
 */

public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("vcl")) {
            advanceMediaPlayer = new VLCPlayer();
        } else if (mediaType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVLC(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMP4(fileName);
        }
    }
}
