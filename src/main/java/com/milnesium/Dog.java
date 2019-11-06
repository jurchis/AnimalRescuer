package com.milnesium;

public class Dog extends Animal {

    //Variables
    private int barkingLevel;

    public int getBarkingLevel() {
        return barkingLevel;
    }

    public void setBarkingLevel(int barkingLevel) {
        this.barkingLevel = barkingLevel;
    }

    //Constructors Super etc.
    public Dog(String name) {
        super(name);
    }

    //Override
    @Override
    public void happy(int happinessLevel) {
        if (happinessLevel > 6) {
            System.out.println(getName() + " is bending its tail");
        } else {
            System.out.println(getName() + " is unhappy");
        }
    }
}
