package com.example.android.crucialmusicplayer;

import android.media.Image;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songsactivity);


        ArrayList<Song> songs = new ArrayList<>();


        songs.add(new Song ("In my feelings","Drake", ))
    }
}
