package com.epicodus.beetsbandapp.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.beetsbandapp.Models.BandMate;
import com.epicodus.beetsbandapp.Models.BandMatesLibrary;
import com.epicodus.beetsbandapp.R;

public class BiographyActivity extends AppCompatActivity {

    private TextView mNameLabel;
    private TextView mInstrument;
    private TextView mBioLabel;
    private ImageView mMemberImage;
    private Button mNextMemberButton;

    private BandMatesLibrary mBandMatesLibrary;
    private BandMate mCurrentBandMate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);

        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mInstrument = (TextView) findViewById(R.id.instrumentLabel);
        mBioLabel = (TextView) findViewById(R.id.bioLabel);
        mMemberImage = (ImageView)findViewById(R.id.memberImage);
        mNextMemberButton = (Button)findViewById(R.id.nextMemberButton);
        mBandMatesLibrary = new BandMatesLibrary();
        mCurrentBandMate = mBandMatesLibrary.getBandMates().get(0);

        setLayoutContent();

        mNextMemberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentBandMate = mBandMatesLibrary.nextBandMate(mCurrentBandMate);
                setLayoutContent();
            }
        });
    }

    private void setLayoutContent() {
        mNameLabel.setText(mCurrentBandMate.getName());
        mInstrument.setText(mCurrentBandMate.getInstrument());
        mBioLabel.setText(mCurrentBandMate.getBio());
        mMemberImage.setImageResource(mCurrentBandMate.getImage());
    }
}
