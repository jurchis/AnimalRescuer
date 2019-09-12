package com.milnesium;

public class AnimalHotel {

    public AnimalHotel(String name) {
        this.name = name;
    }

    private String name;
    private boolean availabilityInArea;

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
