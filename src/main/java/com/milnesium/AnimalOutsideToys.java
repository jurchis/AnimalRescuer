package com.milnesium;

public class AnimalOutsideToys extends AnimalStuff{

    private String outsidePurpose;

    public AnimalOutsideToys(String name) {
        super(name);
    }

    private String color;

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
