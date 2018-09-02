package com.example.android.crucialmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class SongsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songsactivity);


        ArrayList<Song> songs = new ArrayList<>();


        songs.add(new Song ("In My Feelings","Drake",
                (R.drawable.in_my_feelings_ringtone_drake_1)));
        songs.add(new Song ("Girls Like You","Maroon 5 Featuring Cardi B",
                (R.drawable.girls_like_you)));
        songs.add(new Song ("I Like It","Cardi B, Bad Bunny & J Balvin",
                (R.drawable.i_like_it)));
        songs.add(new Song ("FEFE",
                "6ix9ine Featuring Nicki Minaj & Murda Beatz",(R.drawable.fefe)));
        songs.add(new Song ("Better Now","Post Malone",
                (R.drawable.better_now)));
        songs.add(new Song("Lucid Dreams","Juice WRLD",
                (R.drawable.lucid_dreams)));
        songs.add(new Song("No Tears Left To Cry","Ariana Grande",
                (R.drawable.no_tears_left_to_cry)));
        songs.add(new Song("God Is A Woman","Ariana Grande",
                (R.drawable.god_is_a_woman)));
        songs.add(new Song("Sicko Mode","Travis Scott",
                (R.drawable.sicko_mode)));
        songs.add(new Song("Taste","Tyga Featuring Offset",
                (R.drawable.taste)));





        SongsAdapter adapter = new SongsAdapter(this,songs);

        ListView listView = findViewById(R.id.songList);

        listView.setAdapter(adapter);
    }
}
