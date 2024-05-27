package com.rozogar.aryanna.ui.theme;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.rozogar.aryanna.R;

import java.io.IOException;
import java.util.ArrayList;

public class Show extends AppCompatActivity {
private ImageView img;
private TextView txt1;
private SeekBar seek;
private Button btnpre;
private Button btnnext;
private Button btnplay;
   private Intent intent;
    MediaPlayer player;
    private ArrayList<Music> musicList;
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        setUpView();
        adjusting();


    }

    private void adjusting() {
        intent = getIntent();
        if (intent != null) {
            musicList = (ArrayList<Music>) intent.getSerializableExtra("musicList");
            currentIndex = intent.getIntExtra("currentIndex", 0);

            if (musicList != null && !musicList.isEmpty()) {
                player = MediaPlayerManager.getMediaPlayerInstance();
                updateUIWithCurrentSong();
                setUpPlayButton();
                setUpNextButton();
                setUpPreviousButton();
                playCurrentSong();
            } else {
                Toast.makeText(this, "Music list is empty or null", Toast.LENGTH_SHORT).show();
            }
        }

        }

    private void setUpPreviousButton() {
        btnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex--;
                if (currentIndex < 0) {
                    currentIndex = musicList.size() - 1; // Loop back to the end
                }
                updateUIWithCurrentSong();
                playCurrentSong();
            }
        });
    }

    private void setUpNextButton() {
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if (currentIndex >= musicList.size()) {
                    currentIndex = 0; // Loop back to the beginning
                }
                updateUIWithCurrentSong();
                playCurrentSong();
            }
        });
    }

    private void setUpPlayButton() {

                btnplay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (player != null) {
                            if (!player.isPlaying()) {
                                playCurrentSong();
                            } else {
                                player.pause();
                            }
                        }
                    }
                });
    }


    private void playCurrentSong() {
        Music currentSong = musicList.get(currentIndex);
        int ahang = currentSong.getAhang();
        player.reset();
        try {
            player.setDataSource(Show.this, Uri.parse("android.resource://" + getPackageName() + "/" + ahang));
            player.prepare();
            player.start();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(Show.this, "Error playing music", Toast.LENGTH_SHORT).show();
        }

    }
    private void updateUIWithCurrentSong() {
        Music currentSong = musicList.get(currentIndex);
        int imageResource = currentSong.getImage();
        String musicName = currentSong.getTxt();
        img.setImageResource(imageResource);
        txt1.setText(musicName);
    }


    private void setUpView() {
        img = findViewById(R.id.img);
        txt1 =findViewById(R.id.txt1);
        seek = findViewById(R.id.seek);
        btnnext = findViewById(R.id.btnpre);
        btnplay = findViewById(R.id.btnplay);
        btnpre = findViewById(R.id.btnpree);


    }


}