package com.example.android.quakereport;


import java.util.zip.DeflaterOutputStream;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    //    private String mDate;
    private long mTimeMilliseconds;

    Earthquake(double magnitude, String location, Long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeMilliseconds;
    }


}
