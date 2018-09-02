package com.example.android.crucialmusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find the view for the songs category
        CardView songs = findViewById(R.id.songs);

        //Set an on click listener on the songs category
        songs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create an Explicit Intent to open the songs activity
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                startActivity(songsIntent);
            }
        });

        //Find the view for the Artists category
        CardView artists = findViewById(R.id.artists);

        //Set an on click listener on the artists category
        artists.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create an Explicit Intent to open the artists activity
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                startActivity(artistsIntent);
            }
        });

        //Find the view for the Albums category
        CardView albums = findViewById(R.id.albums);

        //Set an on click listener on the albums category
        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create an Explicit Intent to open the songs activity
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                startActivity(albumsIntent);
            }
        });


    }
}
