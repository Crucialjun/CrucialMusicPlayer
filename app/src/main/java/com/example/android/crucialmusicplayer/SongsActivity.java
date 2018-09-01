package com.example.android.crucialmusicplayer;

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
        int iLikeIt = (R.drawable.i_like_it);
        int girlsLikeYou = (R.drawable.girls_like_you);
        int fefe = (R.drawable.fefe);
        int betterNow = (R.drawable.better_now);


        songs.add(new Song ("In My Feelings","Drake",inMyFeelings));
        songs.add(new Song ("Girls Like You","Maroon 5 Featuring Cardi B",
                girlsLikeYou));
        songs.add(new Song ("I Like It","Cardi B, Bad Bunny & J Balvin",
                iLikeIt));
        songs.add(new Song ("FEFE",
                "6ix9ine Featuring Nicki Minaj & Murda Beatz",fefe));
        songs.add(new Song ("Better Now","Post Malone",betterNow));




        Adapter adapter = new Adapter(this,songs);

        ListView listView = findViewById(R.id.structure);

        listView.setAdapter(adapter);
    }
}
