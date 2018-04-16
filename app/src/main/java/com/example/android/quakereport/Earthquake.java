package com.example.android.quakereport;


import java.util.zip.DeflaterOutputStream;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    //    private String mDate;
    private long mTimeMilliseconds;
    private String mUrl;

    Earthquake(double magnitude, String location, Long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeMilliseconds = timeInMilliseconds;
        mUrl = url;
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

    public String getUrl() {
        return mUrl;
    }

}
