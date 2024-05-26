package com.rozogar.aryanna.ui.theme;

import android.os.Parcelable;

import java.io.Serializable;

import androidx.annotation.NonNull;

public class Music implements Serializable {
    private int image;
    private int ahang;
    private String txt;
   

    public Music(int image, String txt,int ahang) {
        this.image = image;
        this.ahang = ahang;
        this.txt = txt;

    }

    public Music(int image, String txt) {
        this.image = image;
        this.txt = txt;
    }

    public int getAhang() {
        return ahang;
    }

    public void setAhang(int ahang) {
        this.ahang = ahang;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Music(){

    }


}
