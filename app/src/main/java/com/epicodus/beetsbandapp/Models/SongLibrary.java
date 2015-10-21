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
                "Bangin' on a Trash Can",
                "lyrics1"
        ));

        mSongs.add(new Song(
                "Shout Your Lungs Out",
                "lyrics2"
        ));

        mSongs.add(new Song(
                "I Need Mo Allowance",
                "lyrics3"
        ));

        mSongs.add(new Song(
                "Killer Tofu",
                "lyrics4"
        ));

        mSongs.add(new Song(
                "Patty You're the Mayonnaise For Me",
                "lyrics5"
        ));
    }
}
