package com.epicodus.beetsbandapp.Models;

/**
 * Created by Aimee and Diana on 10/21/15.
 */
public class BandMate {

    private String mName;
    private String mInstrument;
    private String mBio;
    private int mImage;

    public BandMate(String name, String instrument, String bio, int image) {
        mName = name;
        mBio = bio;
        mInstrument = instrument;
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getInstrument() {
        return mInstrument;
    }

    public void setInstrument(String instrument) {
        mInstrument = instrument;
    }

    public String getBio() {
        return mBio;
    }

    public void setBio(String bio) {
        mBio = bio;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }



}
