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

public class AlbumsAdapter extends ArrayAdapter<Albums> {

    public AlbumsAdapter(Activity context, ArrayList<Albums> albums){
        super(context,0,albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView ==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.albums_list, parent,false);
        }

        Albums currentAlbum = getItem(position);

        TextView albumName = listItemView.findViewById(R.id.albumListTextView);

        albumName.setText(currentAlbum.getAlbumNane());

        ImageView albumArt = listItemView.findViewById(R.id.albumListImageView);

        albumArt.setImageResource(currentAlbum.getAlbumArt());



        return listItemView;
    }
}
