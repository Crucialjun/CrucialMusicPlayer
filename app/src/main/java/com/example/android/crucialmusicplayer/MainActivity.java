package com.example.android.crucialmusicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

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
    }
}