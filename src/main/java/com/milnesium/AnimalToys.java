package com.milnesium;

public class AnimalToys extends AnimalStuff{

    //Variables
    private String color;

    //Constructor Super etc.
    public AnimalToys(String name) {
        super(name);
    }

    //Getters + Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
