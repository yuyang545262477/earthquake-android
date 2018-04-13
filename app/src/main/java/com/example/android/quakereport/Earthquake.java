package com.example.android.quakereport;

import java.util.TooManyListenersException;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeMilliseconds;

    Earthquake(String magnitude, String location, Long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
//        mDate = data;
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
