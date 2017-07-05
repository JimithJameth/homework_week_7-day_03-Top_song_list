package com.example.user.topsongslist;

import android.graphics.Movie;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopSongs {

    private ArrayList<Song> list;

    public TopSongs() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "David Bowie","Heros"));
        list.add(new Song(2, "Kraftwerk","Computer Love"));
        list.add(new Song(3, "Temple Tudor","Swords of a thousand men"));
        list.add(new Song(4, "Adam Ant","Stand and Deliver"));
        list.add(new Song(5, "Prince","Raspberry Berret"));
        list.add(new Song(6, "Yazoo","Dont Go"));
        list.add(new Song(7, "Genesis","Invisible Touch"));
        list.add(new Song(8, "Sparks","Amateur Hour"));
        list.add(new Song(9, "King Crimson","In The Court Of The Crimson King"));
        list.add(new Song(10, "David Bowie","Modern Love"));
    }

    public ArrayList<Song> getList() {return new ArrayList<Song>(list);}
}
