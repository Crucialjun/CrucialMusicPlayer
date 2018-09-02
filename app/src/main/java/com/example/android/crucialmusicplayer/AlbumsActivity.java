package com.example.android.crucialmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class AlbumsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ArrayList<Albums> albums = new ArrayList<>();

        albums.add(new Albums("Scorpion",(R.drawable.in_my_feelings_ringtone_drake_1)));
        albums.add(new Albums("Red Pill Blues",(R.drawable.girls_like_you)));
        albums.add(new Albums("Invasion Of Privacy",(R.drawable.i_like_it)));
        albums.add(new Albums("Queen",(R.drawable.fefe)));
        albums.add(new Albums("Beerbongs & Bentleys",(R.drawable.better_now)));
        albums.add(new Albums("Goodbye & Good Riddance",(R.drawable.lucid_dreams)));
        albums.add(new Albums("Sweetener",(R.drawable.no_tears_left_to_cry)));
        albums.add(new Albums("Sweetener",(R.drawable.god_is_a_woman)));
        albums.add(new Albums("Astroworld",(R.drawable.sicko_mode)));
        albums.add(new Albums("Taste",(R.drawable.taste)));
        albums.add(new Albums("Love Lies",(R.drawable.love_lies)));
        albums.add(new Albums("No Brainer",(R.drawable.no_brainer)));
        albums.add(new Albums("Ready",(R.drawable.bood_up)));
        albums.add(new Albums("Harder Than ever",(R.drawable.yes_indeed)));
        albums.add(new Albums("Young Blood",(R.drawable.young_blood)));























        AlbumsAdapter adapter = new AlbumsAdapter(this,albums);

        GridView gridView = findViewById(R.id.albumsview);

        gridView.setAdapter(adapter);

    }

}