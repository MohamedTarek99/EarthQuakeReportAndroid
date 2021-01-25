package com.example.android.quakereport;

public class Earthquake {
    String date;
    String country;
    double mag;

    public Earthquake(String Date,String Country,double magn){
        date=Date;
        country=Country;
        mag=magn;


    }

    public double getMag() {
        return mag;
    }

    public String getCountry() {
        return country;
    }

    public String getDate() {
        return date;
    }
}
