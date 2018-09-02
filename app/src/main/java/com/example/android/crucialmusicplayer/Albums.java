package com.example.android.crucialmusicplayer;

public class Albums {
    private int mAlbumArt;
    private String mAlbumName;

    public Albums(String albumName,int albumArt){
        mAlbumName = albumName;
        mAlbumArt = albumArt;

    }
    public String getAlbumNane(){
        return mAlbumName;
    }

    public int getAlbumArt() {
        return mAlbumArt;
    }




}
