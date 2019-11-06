package com.milnesium;

public class AnimalOutsideToys extends AnimalStuff {

    //Variables
    private String outsidePurpose;
    private String color;

    //Constructors Supra etc.
    public AnimalOutsideToys(String name) {
        super(name);
    }

    //Getters + Setters
    public String getOutsidePurpose() {
        return outsidePurpose;
    }

    public void setOutsidePurpose(String outsidePurpose) {
        this.outsidePurpose = outsidePurpose;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
