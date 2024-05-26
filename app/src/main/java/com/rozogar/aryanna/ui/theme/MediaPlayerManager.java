package com.rozogar.aryanna.ui.theme;

import android.media.MediaPlayer;

public class MediaPlayerManager {

        private static MediaPlayer mediaPlayer;

        public static MediaPlayer getMediaPlayerInstance() {
            if (mediaPlayer == null) {
                mediaPlayer = new MediaPlayer();
            }
            return mediaPlayer;
        }
    }


