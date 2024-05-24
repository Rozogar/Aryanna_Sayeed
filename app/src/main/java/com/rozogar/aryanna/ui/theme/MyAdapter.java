package com.rozogar.aryanna.ui.theme;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.rozogar.aryanna.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter {
    private ArrayList<Music> song;
    private int resource;
    private Context context;
    public MyAdapter( Context context, int resource, ArrayList<Music> song) {
        super(context, resource, song);
        this.context = context;
        this.resource = resource;
        this.song = song;
    }

    @Override
    public int getCount() {
        return song.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return song.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, parent, false);
            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        Music mm = song.get(position);
        holder.filling(mm);


        return convertView;
    }

    public class ViewHolder {
        ImageView imge;
        TextView txt;

        public ViewHolder(View convertView) {
            imge = (ImageView) convertView.findViewById(R.id.image);
            txt = (TextView) convertView.findViewById(R.id.txt);


        }
        public void filling(Music mm) {
            imge.setImageResource(mm.getImage());
            txt.setText(mm.getTxt().toString());
        }

        }
    }
