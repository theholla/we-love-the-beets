package com.epicodus.beetsbandapp.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.epicodus.beetsbandapp.Models.Song;
import com.epicodus.beetsbandapp.Models.SongLibrary;
import com.epicodus.beetsbandapp.R;

public class SongActivity extends AppCompatActivity {
    private TextView mSongTitleLabel, mLyricsLabel;

    private SongLibrary mSongLibrary;
    private Song mCurrentSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        mSongTitleLabel = (TextView) findViewById(R.id.songTitleLabel);
        mLyricsLabel = (TextView) findViewById(R.id.lyricsLabel);
        //need song library?
    }

}
