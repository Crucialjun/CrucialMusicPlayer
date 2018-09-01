package com.example.android.crucialmusicplayer;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songsactivity);


        ArrayList<Song> songs = new ArrayList<>();


        int inMyFeelings = (R.drawable.in_my_feelings_ringtone_drake_1);
        songs.add(new Song ("In my feelings","Drake",inMyFeelings ));

        Adapter adapter = new Adapter(this,songs);

        ListView listView = findViewById(R.id.structure);

        listView.setAdapter(adapter);
    }
}
