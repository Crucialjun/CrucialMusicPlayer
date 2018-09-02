package com.example.android.crucialmusicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ArtistsAdapter extends ArrayAdapter<Artists> {

    public ArtistsAdapter(Activity context, ArrayList<Artists> artists){
        super(context,0,artists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView ==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artists_list, parent,false);
        }

        Artists currentArtist = getItem(position);

        TextView songArtist = listItemView.findViewById(R.id.artistOnArtistList);

        songArtist.setText(currentArtist.getArtistName());




        return listItemView;
    }
}
