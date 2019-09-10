package com.milnesium;

public class AnimalActivity {

    public AnimalActivity(String name) {
        this.name = name;
    }

    String name;

    //Additional properties
    //how much time for playing
    short time;
    //when exactly morning, afternoon
    String dayPlayPeriod;
    String place;
    //how far from home is happening the activity
    int distance;

}
