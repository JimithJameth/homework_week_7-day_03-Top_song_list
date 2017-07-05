package com.example.user.topsongslist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopSongsAdapter extends ArrayAdapter<Song> {

    public TopSongsAdapter(Context context, ArrayList<Song> list) {super (context, 0, list);}

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_item,parent, false);
        }

        Song currentSong = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        TextView artist  = (TextView) listItemView.findViewById(R.id.artist);
        TextView title = (TextView) listItemView.findViewById(R.id.title);

        ranking.setText(currentSong.getRanking().toString());
        artist.setText(currentSong.getArtist());
        title.setText(currentSong.getTitle());

        listItemView.setTag(currentSong);

        return listItemView;
    }
}

