package com.rozogar.aryanna.ui.theme;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.rozogar.aryanna.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import static android.app.ProgressDialog.show;

public class Splash extends AppCompatActivity {
private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(Splash.this, Home.class);
               startActivity(intent);
           }
       }, 2000);

    }


}