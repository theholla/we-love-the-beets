package com.epicodus.beetsbandapp.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.beetsbandapp.Models.BandMate;
import com.epicodus.beetsbandapp.Models.BandMatesLibrary;
import com.epicodus.beetsbandapp.Models.Song;
import com.epicodus.beetsbandapp.Models.SongLibrary;
import com.epicodus.beetsbandapp.R;

public class DiscographyActivity extends AppCompatActivity {

    private SongLibrary mSongLibrary;

    private Button mBanginSongButton, mShoutSongButton, mAllowanceSongButton, mTofuSongButton, mMayoSongButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discography);

        mSongLibrary = new SongLibrary();

        mBanginSongButton = (Button) findViewById(R.id.banginSongButton);
        mShoutSongButton = (Button) findViewById(R.id.shoutSongButton);
        mAllowanceSongButton = (Button) findViewById(R.id.allowanceSongButton);
        mTofuSongButton = (Button) findViewById(R.id.tofuSongButton);
        mMayoSongButton = (Button) findViewById(R.id.mayoSongButton);

        mBanginSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiscographyActivity.this, SongActivity.class);
                intent.putExtra("songTitleLabel", mSongLibrary.getSongs().get(0).getSongTitle());
                intent.putExtra("lyricsLabel", mSongLibrary.getSongs().get(0).getLyrics());
                startActivity(intent);
            }
        });

        mShoutSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiscographyActivity.this, SongActivity.class);
                intent.putExtra("songTitleLabel", mSongLibrary.getSongs().get(1).getSongTitle());
                intent.putExtra("lyricsLabel", mSongLibrary.getSongs().get(1).getLyrics());
                startActivity(intent);
            }
        });

        mAllowanceSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiscographyActivity.this, SongActivity.class);
                intent.putExtra("songTitleLabel", mSongLibrary.getSongs().get(2).getSongTitle());
                intent.putExtra("lyricsLabel", mSongLibrary.getSongs().get(2).getLyrics());
                startActivity(intent);
            }
        });

        mTofuSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiscographyActivity.this, SongActivity.class);
                intent.putExtra("songTitleLabel", mSongLibrary.getSongs().get(3).getSongTitle());
                intent.putExtra("lyricsLabel", mSongLibrary.getSongs().get(3).getLyrics());
                startActivity(intent);
            }
        });

        mMayoSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiscographyActivity.this, SongActivity.class);
                intent.putExtra("songTitleLabel", mSongLibrary.getSongs().get(4).getSongTitle());
                intent.putExtra("lyricsLabel", mSongLibrary.getSongs().get(4).getLyrics());
                startActivity(intent);
            }
        });

    }
}
