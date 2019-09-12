package com.milnesium;

public class People {

    public People(String name) {
        this.name = name;
    }

    private String name;
    private int availableCash;
    //additional properties
    //1 to 10 care for the animal
    private byte care;
    //Does he have a yard
    private boolean yard;
    //Can he work from home
    private boolean workFromHome;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(int availableCash) {
        this.availableCash = availableCash;
    }

    public byte getCare() {
        return care;
    }

    public void setCare(byte care) {
        this.care = care;
    }

    public boolean isYard() {
        return yard;
    }

    public void setYard(boolean yard) {
        this.yard = yard;
    }

    public boolean isWorkFromHome() {
        return workFromHome;
    }

    public void setWorkFromHome(boolean workFromHome) {
        this.workFromHome = workFromHome;
    }
}
