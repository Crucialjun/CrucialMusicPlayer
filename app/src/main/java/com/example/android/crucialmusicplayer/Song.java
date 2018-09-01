package com.example.android.crucialmusicplayer;

import android.media.Image;

public class Song {
    private String mSongName;
    private String mArtistName;
    private Image mAlbumArt;

    public Song(String songName,String artistName, Image albumArt){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    public String getSongName(){
        return mSongName;
    }

    public String getArtistName(){
        return mArtistName;
    }

    public Image getAlbumArt() {
        return mAlbumArt;
    }
}
