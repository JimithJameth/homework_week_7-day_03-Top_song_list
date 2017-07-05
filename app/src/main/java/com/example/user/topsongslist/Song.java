package com.example.user.topsongslist;

/**
 * Created by user on 05/07/2017.
 */

public class Song {

    private Integer ranking;
    private String artist;
    private String title;

    public Song(Integer ranking, String artist, String title) {

        this.ranking = ranking;
        this.artist = artist;
        this.title = title;
    }

    public Integer getRanking() {return ranking;}
    public String  getArtist() {return artist;}
    public String  getTitle () {return title;}
}
