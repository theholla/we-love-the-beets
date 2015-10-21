package com.epicodus.beetsbandapp.Models;

import com.epicodus.beetsbandapp.R;

import java.util.ArrayList;

/**
 * Created by Aimee and Diana on 10/21/15.
 */
public class BandMatesLibrary {
    private ArrayList<BandMate> mBandMates;

    public BandMatesLibrary() {
        setAllBandMates();
    }

    public ArrayList<BandMate>getBandMates() {
        return mBandMates;
    }

    public void setAllBandMates() {
        mBandMates = new ArrayList<>();

        mBandMates.add(new BandMate(
                "Clyde 'Chap' Lipman",
                "Drums",
                "Chap is from Liverpool.  He started banging on bowls and cats until his mom told him to stop so he started a garage band with his friends and the rest is history.",
                R.drawable.chap_lipman

        ));

        mBandMates.add(new BandMate(
                "Monroe Yodler",
                "Singer, Bass",
                "",
                R.drawable.yodler
        ));

        mBandMates.add(new BandMate(
                "Wendy Nespot",
                "Keyboard",
                "",
                R.drawable.wendy
        ));

        mBandMates.add(new BandMate(
                "Flounder",
                "Guitar",
                "",
                R.drawable.flounder
        ));
    }

    public BandMate nextBandMate(BandMate currentBandMate) {
        int index = mBandMates.indexOf(currentBandMate);
        if (index ==  mBandMates.size() - 1) {
            return mBandMates.get(0);
        } else {
            return mBandMates.get(index + 1);
        }
    }
}
