package com.milnesium;

public class AnimalActivity {

    //Variables
    String name;

    //Additional properties
    //how much time for playing
    private short time;
    //when exactly morning, afternoon
    private String dayPlayPeriod;
    private String place;
    //how far from home is happening the activity
    private int distance;

    //Constructors Super etc
    public AnimalActivity(String name) {
        this.name = name;
    }

    //Getters + Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getTime() {
        return time;
    }

    public void setTime(short time) {
        this.time = time;
    }

    public String getDayPlayPeriod() {
        return dayPlayPeriod;
    }

    public void setDayPlayPeriod(String dayPlayPeriod) {
        this.dayPlayPeriod = dayPlayPeriod;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    //Overrides
    @Override
    public String toString() {
        return name;
    }
}
