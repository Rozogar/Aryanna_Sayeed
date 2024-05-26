package com.rozogar.aryanna.ui.theme;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rozogar.aryanna.R;

import java.io.IOException;

public class Show extends AppCompatActivity {
private ImageView img;
private TextView txt1;
private SeekBar seek;
private ImageButton btnpre;
private ImageButton btnnext;
private ImageButton btnplay;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        setUpView();
       adusting();


    }

    private void adusting() {
        Intent intent = getIntent();
        if (intent != null){
            Music clickedMusic = (Music) intent.getSerializableExtra("clickedMusic");
            if(clickedMusic != null) {
                int imageResource = clickedMusic.getImage();
                String musicName = clickedMusic.getTxt();
                int ahang = clickedMusic.getAhang();
                img.setImageResource(imageResource);
                txt1.setText(musicName);
                btnplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer player = MediaPlayerManager.getMediaPlayerInstance();
                        if (!player.isPlaying()) {
                            try {
                                player.reset();
                                player.setDataSource(Show.this, Uri.parse("android.resource://" + getPackageName() + "/" + ahang));
                                player.prepare();
                                player.start();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }else {
                            if(player.isPlaying()) {
                                player.pause();
                            }
                        }
                    }
                });
            } else {
                Toast.makeText(this, "music is null", Toast.LENGTH_SHORT).show();
            }

//            btnpre.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    // Retrieve the current song data from the intent
//                    Intent intent = getIntent();
//                    if (intent != null) {
//                        Music currentMusic = (Music) intent.getSerializableExtra("clickedMusic");
//                        if (currentMusic != null) {
//                            // Get the index of the previous song in the playlist
//                            int currentIndex = currentMusic.getIndex(); // Assuming you have an index for each song in the playlist
//                            int previousIndex = currentIndex - 1;
//                            if (previousIndex >= 0) {
//                                // Retrieve the previous song from the playlist using its index
//                                Music previousMusic = getMusicFromPlaylist(previousIndex); // Implement this method to get the previous song from the playlist
//                                if (previousMusic != null) {
//                                    // Start the Show activity with the previous song data
//                                    Intent showIntent = new Intent(Show.this, Show.class);
//                                    showIntent.putExtra("clickedMusic", previousMusic);
//                                    startActivity(showIntent);
//                                }
//                            } else {
//                                // No previous song available
//                                Toast.makeText(Show.this, "No previous song available", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    }
//                }
//            });
//

        }
    }

//    private Music getMusicFromPlaylist(int previousIndex) {
//
//    }


    private void setUpView() {
        img = findViewById(R.id.img);
        txt1 =findViewById(R.id.txt1);
        seek = findViewById(R.id.seek);
        btnnext = findViewById(R.id.btnnext);
        btnplay = findViewById(R.id.btnplay);
        btnpre = findViewById(R.id.btnpre);


    }



    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.release();
        }
    }
}