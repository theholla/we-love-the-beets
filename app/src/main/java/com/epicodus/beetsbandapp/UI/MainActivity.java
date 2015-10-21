package com.epicodus.beetsbandapp.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.epicodus.beetsbandapp.Models.BandMate;
import com.epicodus.beetsbandapp.R;

public class MainActivity extends AppCompatActivity {
    private Button mBiographiesButton;
    private Button mTourButton;
    private Button mDiscographyButton;
    private Button mListenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBiographiesButton = (Button) findViewById(R.id.biographiesButton);
        mTourButton = (Button) findViewById(R.id.tourButton);
        mDiscographyButton = (Button) findViewById(R.id.discographyButton);
        mListenButton = (Button) findViewById(R.id.listenButton);

        mBiographiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BiographyActivity.class);
                startActivity(intent);
            }
        });

        mTourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BiographyActivity.class);
                startActivity(intent);
            }
        });

        mDiscographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BiographyActivity.class);
                startActivity(intent);
            }
        });

        mListenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BiographyActivity.class);
                startActivity(intent);
            }
        });
    }

}
