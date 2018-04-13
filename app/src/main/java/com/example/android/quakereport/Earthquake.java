package com.example.android.quakereport;


public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    //    private String mDate;
    private long mTimeMilliseconds;

    Earthquake(String magnitude, String location, Long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeMilliseconds;
    }


}
