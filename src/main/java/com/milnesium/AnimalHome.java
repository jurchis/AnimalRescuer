package com.milnesium;

public class AnimalHome {

    //Variables
    private String type;
    //size of the shelter that is place in rescuer home for the animal to stay in s,m,l
    private String size;
    private String color;

    //Constructors Super etc.
    public AnimalHome(String type) {
        this.type = type;
    }

    //Getters + Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
