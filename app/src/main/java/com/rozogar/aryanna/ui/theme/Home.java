package com.rozogar.aryanna.ui.theme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rozogar.aryanna.R;

public class Home extends AppCompatActivity {
private Button btnSongs;
private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        setUpView();
        btnAction();

    }

    private void btnAction() {
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        btnSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Song_list.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void setUpView() {
        btnSongs = findViewById(R.id.btnSongs);
        btnExit = findViewById(R.id.btnExit);
    }
}