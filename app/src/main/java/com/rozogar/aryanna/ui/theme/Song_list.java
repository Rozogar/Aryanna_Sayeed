package com.rozogar.aryanna.ui.theme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        topUp();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Music clickedMusic = music.get(position);
                Intent intent = new Intent(Song_list.this, Show.class);
                intent.putExtra("musicList", music);
                intent.putExtra("currentIndex", position);
                startActivity(intent);
            }
        });
    }

    private void topUp() {
        music = new ArrayList<Music>();
        music.add(new Music(R.drawable.xx, getString(R.string.bannamak), R.raw.banamak));
        music.add(new Music(R.drawable.j, getString(R.string.Chera_Chera), R.raw.chera_chera));
        music.add(new Music(R.drawable.a, getString(R.string.afghan_pesarak), R.raw.afghan_pesarak));
        music.add(new Music(R.drawable.c, getString(R.string.Atan), R.raw.atan));
        music.add(new Music(R.drawable.d, getString(R.string.Babak_Dandan), R.raw.babak_dandan));
        music.add(new Music(R.drawable.f, getString(R.string.Be_Tu), R.raw.be_tu));
        music.add(new Music(R.drawable.ss, getString(R.string.labkhand), R.raw.labkhand));
        music.add(new Music(R.drawable.g, getString(R.string.Bi_Aaghosh_e_Tu), R.raw.bi_aaghosh_e_tu));
        music.add(new Music(R.drawable.b, getString(R.string.anar), R.raw.anar));
        music.add(new Music(R.drawable.h, getString(R.string.Biya_Biya), R.raw.biya_biya));
        music.add(new Music(R.drawable.e, getString(R.string.Bache_kabul), R.raw.bache_kabul));
        music.add(new Music(R.drawable.i, getString(R.string.Byaa_Ka_De_Baregi), R.raw.byaa_ka_de_baregi));
        music.add(new Music(R.drawable.l, getString(R.string.Dar_Qalbe_Kabul), R.raw.dar_qalbe_kabul));
        music.add(new Music(R.drawable.k, getString(R.string.Chi_Didi), R.raw.chi_didi));
        music.add(new Music(R.drawable.s, getString(R.string.Hazargi), R.raw.hazargi));
        music.add(new Music(R.drawable.r, getString(R.string.Hairanam), R.raw.hairanam));
        music.add(new Music(R.drawable.n, getString(R.string.Gola_Bordem), R.raw.gole_bordem));
        music.add(new Music(R.drawable.o, getString(R.string.Guitar), R.raw.guitar));
        music.add(new Music(R.drawable.q, getString(R.string.Habibi), R.raw.habibi));
        music.add(new Music(R.drawable.p, getString(R.string.Gulfam), R.raw.gulfam));
        music.add(new Music(R.drawable.v, getString(R.string.Kamak_Kamak), R.raw.kamak_kamak));
        music.add(new Music(R.drawable.u, getString(R.string.Kabul_Zeba), R.raw.kabul_zeba));
        music.add(new Music(R.drawable.uu, getString(R.string.majlisi1), R.raw.majlisi1));
        music.add(new Music(R.drawable.x, getString(R.string.Laily_Jan), R.raw.laily_jaan));
        music.add(new Music(R.drawable.z, getString(R.string.Maida_Maida), R.raw.maida_maida));
        music.add(new Music(R.drawable.w, getString(R.string.Lahza_Haa), R.raw.lahza_haa));
        music.add(new Music(R.drawable.aa, getString(R.string.Man_Amadeam), R.raw.man_amadeam));
        music.add(new Music(R.drawable.bb, getString(R.string.Mashallah), R.raw.mashallah));
        music.add(new Music(R.drawable.dd, getString(R.string.musafir), R.raw.musafir));
        music.add(new Music(R.drawable.ii, getString(R.string.Pashto_Mashup), R.raw.pashto_mashup));
        music.add(new Music(R.drawable.cc, getString(R.string.modati_shod_ka_tora), R.raw.modati_shod_ka_tora));
        music.add(new Music(R.drawable.ww, getString(R.string.baby), R.raw.baby));
        music.add(new Music(R.drawable.ee, getString(R.string.nafasam), R.raw.nafasam));
        music.add(new Music(R.drawable.ll, getString(R.string.Saat_e_Brand), R.raw.saat_e_brand));
        music.add(new Music(R.drawable.pp, getString(R.string.Yaar_e_Bamyani), R.raw.yaar_e_bamyani));
        music.add(new Music(R.drawable.rr, getString(R.string.hemat_kon), R.raw.hematkon));
        music.add(new Music(R.drawable.tt, getString(R.string.majlisi), R.raw.majlisi));
        music.add(new Music(R.drawable.aa, getString(R.string.lanat), R.raw.lanat));
        music.add(new Music(R.drawable.jj, getString(R.string.Pashto_Melody), R.raw.pashto_medley));
        music.add(new Music(R.drawable.qq, getString(R.string.Yallah_Yallah), R.raw.yallah_yallah));
        music.add(new Music(R.drawable.mm, getString(R.string.Tasmim), R.raw.tasmim));
        music.add(new Music(R.drawable.vv, getString(R.string.mosha), R.raw.moshanamosh));
        music.add(new Music(R.drawable.nn, getString(R.string.Toba_Toba), R.raw.toba_toba));
        music.add(new Music(R.drawable.oo, getString(R.string.Tu_Behtarin_Yaar), R.raw.tu_behtarin_yaar));
        music.add(new Music(R.drawable.yy, getString(R.string.qarsakipanshir), R.raw.qarsakipanshir));


    }

    private void adding() {
        if (music != null) {
            MyAdapter adapter = new MyAdapter(Song_list.this, R.layout.pre_layout, music);
            list.setAdapter(adapter);
        }
    }

    private void filling() {
        music = new ArrayList<Music>();
        music.add(new Music(R.drawable.xx, getString(R.string.bannamak)));
        music.add(new Music(R.drawable.j, getString(R.string.Chera_Chera)));
        music.add(new Music(R.drawable.a, getString(R.string.afghan_pesarak)));
        music.add(new Music(R.drawable.c, getString(R.string.Atan)));
        music.add(new Music(R.drawable.d, getString(R.string.Babak_Dandan)));
        music.add(new Music(R.drawable.f, getString(R.string.Be_Tu)));
        music.add(new Music(R.drawable.ss, getString(R.string.labkhand)));
        music.add(new Music(R.drawable.g, getString(R.string.Bi_Aaghosh_e_Tu)));
        music.add(new Music(R.drawable.b, getString(R.string.anar)));
        music.add(new Music(R.drawable.h, getString(R.string.Biya_Biya)));
        music.add(new Music(R.drawable.e, getString(R.string.Bache_kabul)));
        music.add(new Music(R.drawable.i, getString(R.string.Byaa_Ka_De_Baregi)));
        music.add(new Music(R.drawable.l, getString(R.string.Dar_Qalbe_Kabul)));
        music.add(new Music(R.drawable.k, getString(R.string.Chi_Didi)));
        music.add(new Music(R.drawable.s, getString(R.string.Hazargi)));
        music.add(new Music(R.drawable.r, getString(R.string.Hairanam)));
        music.add(new Music(R.drawable.n, getString(R.string.Gola_Bordem)));
        music.add(new Music(R.drawable.o, getString(R.string.Guitar)));
        music.add(new Music(R.drawable.q, getString(R.string.Habibi)));
        music.add(new Music(R.drawable.p, getString(R.string.Gulfam)));
        music.add(new Music(R.drawable.v, getString(R.string.Kamak_Kamak)));
        music.add(new Music(R.drawable.u, getString(R.string.Kabul_Zeba)));
        music.add(new Music(R.drawable.uu, getString(R.string.majlisi1)));
        music.add(new Music(R.drawable.x, getString(R.string.Laily_Jan)));
        music.add(new Music(R.drawable.z, getString(R.string.Maida_Maida)));
        music.add(new Music(R.drawable.w, getString(R.string.Lahza_Haa)));
        music.add(new Music(R.drawable.aa, getString(R.string.Man_Amadeam)));
        music.add(new Music(R.drawable.bb, getString(R.string.Mashallah)));
        music.add(new Music(R.drawable.dd, getString(R.string.musafir)));
        music.add(new Music(R.drawable.ii, getString(R.string.Pashto_Mashup)));
        music.add(new Music(R.drawable.cc, getString(R.string.modati_shod_ka_tora)));
        music.add(new Music(R.drawable.ww, getString(R.string.baby)));
        music.add(new Music(R.drawable.ee, getString(R.string.nafasam)));
        music.add(new Music(R.drawable.ll, getString(R.string.Saat_e_Brand)));
        music.add(new Music(R.drawable.pp, getString(R.string.Yaar_e_Bamyani)));
        music.add(new Music(R.drawable.rr, getString(R.string.hemat_kon)));
        music.add(new Music(R.drawable.tt, getString(R.string.majlisi)));
        music.add(new Music(R.drawable.aa, getString(R.string.lanat)));
        music.add(new Music(R.drawable.jj, getString(R.string.Pashto_Melody)));
        music.add(new Music(R.drawable.qq, getString(R.string.Yallah_Yallah)));
        music.add(new Music(R.drawable.mm, getString(R.string.Tasmim)));
        music.add(new Music(R.drawable.vv, getString(R.string.mosha)));
        music.add(new Music(R.drawable.nn, getString(R.string.Toba_Toba)));
        music.add(new Music(R.drawable.oo, getString(R.string.Tu_Behtarin_Yaar)));
        music.add(new Music(R.drawable.yy, getString(R.string.qarsakipanshir)));


    }

    private void setUPView() {
        list = findViewById(R.id.list);
    }
}