package com.example.eqapp;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mUrl;
    private long mTime;

    public Earthquake(double magnitude,String location, long time, String url)
    {
        mMagnitude=magnitude;
        mLocation=location;
        mUrl=url;
        mTime=time;
    }
    public double getMagnitude(){return mMagnitude;}
    public String getLocation(){return mLocation;}
    public String getUri(){return mUrl;};
    public long getTime(){return mTime;}



}
