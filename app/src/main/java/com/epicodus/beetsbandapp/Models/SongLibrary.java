package com.epicodus.beetsbandapp.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Created by Aimee and Diana on 10/21/15.
 */
public class SongLibrary {
    private ArrayList<Song> mSongs;

    public SongLibrary() {
        setSongs();
    }

    public ArrayList<Song>getSongs() {
        return mSongs;
    }

    private void setSongs() {
        mSongs = new ArrayList<>();

        mSongs.add(new Song(
                "title1",
                "lyrics"
        ));

        mSongs.add(new Song(
                "title2",
                "lyrics"
        ));

        mSongs.add(new Song(
                "title3",
                "lyrics"
        ));

        mSongs.add(new Song(
                "title4",
                "lyrics"
        ));

        mSongs.add(new Song(
                "title5",
                "lyrics"
        ));
    }
}
