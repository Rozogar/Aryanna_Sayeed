package com.rozogar.aryanna.ui.theme;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rozogar.aryanna.R;

import java.util.ArrayList;

public class Song_list extends AppCompatActivity {
ArrayList<Music> music;
private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        setUPView();
        filling();
        adding();
    }

    private void adding() {
        MyAdapter adapter = new MyAdapter(Song_list.this,R.layout.pre_layout,music);
        list.setAdapter(adapter);
    }

    private void filling() {
        music = new ArrayList<Music>();
        music.add(new Music(R.drawable.a,getString(R.string.afghan_pesarak)));
        music.add(new Music(R.drawable.b,getString(R.string.anar)));
        music.add(new Music(R.drawable.c,getString(R.string.Atan)));
        music.add(new Music(R.drawable.d,getString(R.string.Babak_Dandan)));
        music.add(new Music(R.drawable.e,getString(R.string.Bache_kabul)));
        music.add(new Music(R.drawable.f,getString(R.string.Be_Tu)));
        music.add(new Music(R.drawable.g,getString(R.string.Bi_Aaghosh_e_Tu)));
        music.add(new Music(R.drawable.h,getString(R.string.Biya_Biya)));
        music.add(new Music(R.drawable.i,getString(R.string.Byaa_Ka_De_Baregi)));
        music.add(new Music(R.drawable.j,getString(R.string.Chera_Chera)));
        music.add(new Music(R.drawable.k,getString(R.string.Chi_Didi)));
        music.add(new Music(R.drawable.l,getString(R.string.Dar_Qalbe_Kabul)));
        music.add(new Music(R.drawable.m,getString(R.string.Dilam_Tang_Ast)));
        music.add(new Music(R.drawable.n,getString(R.string.Gola_Bordem)));
        music.add(new Music(R.drawable.o,getString(R.string.Guitar)));
        music.add(new Music(R.drawable.p,getString(R.string.Gulfam)));
        music.add(new Music(R.drawable.q,getString(R.string.Habibi)));
        music.add(new Music(R.drawable.r,getString(R.string.Hairanam)));
        music.add(new Music(R.drawable.s,getString(R.string.Hazargi)));
        music.add(new Music(R.drawable.t,getString(R.string.Jelwa)));
        music.add(new Music(R.drawable.u,getString(R.string.Kabul_Zeba)));
        music.add(new Music(R.drawable.v,getString(R.string.Kamak_Kamak)));
        music.add(new Music(R.drawable.w,getString(R.string.Lahza_Haa)));
        music.add(new Music(R.drawable.x,getString(R.string.Laily_Jan)));
        music.add(new Music(R.drawable.y,getString(R.string.Mader_e_Afghan)));
        music.add(new Music(R.drawable.z,getString(R.string.Maida_Maida)));
        music.add(new Music(R.drawable.aa,getString(R.string.Man_Amadeam)));
        music.add(new Music(R.drawable.bb,getString(R.string.Mashallah)));
        music.add(new Music(R.drawable.cc,getString(R.string.modati_shod_ka_tora)));
        music.add(new Music(R.drawable.dd,getString(R.string.musafir)));
        music.add(new Music(R.drawable.ee,getString(R.string.nafasam)));
        music.add(new Music(R.drawable.ff,getString(R.string.Ogora_Ta_Maata)));
        music.add(new Music(R.drawable.gg,getString(R.string.pa_ashiqi)));
        music.add(new Music(R.drawable.hh,getString(R.string.Parande_Mohabbat_LIve)));
        music.add(new Music(R.drawable.ii,getString(R.string.Pashto_Mashup)));
        music.add(new Music(R.drawable.jj,getString(R.string.Pashto_Melody)));
        music.add(new Music(R.drawable.kk,getString(R.string.Qarsak)));
        music.add(new Music(R.drawable.ll,getString(R.string.Saat_e_Brand)));
        music.add(new Music(R.drawable.mm,getString(R.string.Tasmim)));
        music.add(new Music(R.drawable.nn,getString(R.string.Toba_Toba)));
        music.add(new Music(R.drawable.oo,getString(R.string.Tu_Behtarin_Yaar)));
        music.add(new Music(R.drawable.pp,getString(R.string.Yaar_e_Bamyani)));
        music.add(new Music(R.drawable.a,getString(R.string.Yallah_Yallah)));



    }

    private void setUPView() {
        list = findViewById(R.id.list);
    }
}