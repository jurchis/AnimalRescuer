package com.milnesium;

public class AnimalHotel {

    //Variables
    private String name;
    private boolean availabilityInArea;

    //Constructors Super etc.
    public AnimalHotel(String name) {
        this.name = name;
    }

    //Getters + Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailabilityInArea() {
        return availabilityInArea;
    }

    public void setAvailabilityInArea(boolean availabilityInArea) {
        this.availabilityInArea = availabilityInArea;
    }
}
