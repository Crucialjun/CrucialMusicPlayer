package com.example.android.crucialmusicplayer;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter extends ArrayAdapter<Song> {

    public Adapter(Activity context, ArrayList<Song> songs){
        super(context,0,songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView ==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.view_arrangment, parent,false);
        }

        Song currentSong = getItem(position);
        Song currentArtist = getItem(position);
        Song currentAlbum = getItem(position);

        ImageView albumArt = listItemView.findViewById(R.id.albumArt);

        albumArt.setImageResource((currentAlbum.getAlbumArt()));

        TextView songName = listItemView.findViewById(R.id.songTittle);

        songName.setText(currentSong.getSongName());

        TextView songArtist = listItemView.findViewById(R.id.songArtist);

        songArtist.setText(currentArtist.getArtistName());




        return listItemView;
    }
}
