package com.rozogar.aryanna.ui.theme;

import android.media.MediaPlayer;
public class MediaPlayerManager {
    private static MediaPlayer mediaPlayer;

    private MediaPlayerManager() {
        // Private constructor to prevent instantiation
    }

    public static MediaPlayer getMediaPlayerInstance() {
        if (mediaPlayer == null) {
            mediaPlayer = new MediaPlayer();
        }
        return mediaPlayer;
    }

    public static void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}



