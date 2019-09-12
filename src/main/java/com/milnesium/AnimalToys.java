package com.milnesium;

public class AnimalToys extends AnimalStuff{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AnimalToys(String name) {
        super(name);
    }
}
