package com.example.android.crucialmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class ArtistsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        ArrayList<Artists> artists = new ArrayList<>();



        artists.add(new Artists("Drake"));
        artists.add(new Artists("Maroon 5 Featuring Cardi B"));
        artists.add(new Artists("Cardi B, Bad Bunny & J Balvin"));
        artists.add(new Artists("6ix9ine Featuring Nicki Minaj & Murda Beatz"));
        artists.add(new Artists("Juice WRLD"));
        artists.add(new Artists("Ariana Grande"));
        artists.add(new Artists("Travis Scott"));
        artists.add(new Artists("Tyga Featuring Offset"));










        ArtistsAdapter adapterArtists = new ArtistsAdapter(this,artists);

        ListView artistsList = findViewById(R.id.artistsListActivity);

        artistsList.setAdapter(adapterArtists);
    }

}