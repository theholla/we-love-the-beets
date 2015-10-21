package com.epicodus.beetsbandapp.Models;

/**
 * Created by Aimee and Diana on 10/21/15.
 */
public class Song {
    private String mSongTitle, mLyrics;

    public Song(String songTitle, String lyrics) {
        mSongTitle = songTitle;
        mLyrics = lyrics;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public void setSongTitle(String songTitle) {
        mSongTitle = songTitle;
    }

    public String getLyrics() {
        return mLyrics;
    }

    public void setLyrics(String lyrics) {
        mLyrics = lyrics;
    }
}
