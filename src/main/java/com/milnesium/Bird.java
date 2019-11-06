package com.milnesium;

public class Bird extends Animal {

    //Variables
    public Bird(String name) {
        super(name);
    }

    private int singingLevel;

    public int getSingingLevel() {
        return singingLevel;
    }

    public void setSingingLevel(int singingLevel) {
        this.singingLevel = singingLevel;
    }

    //Override
    @Override
    public void happy(int happinessLevel) {
        if (happinessLevel > 7) {
            System.out.println(getName() + " is singing");
        } else {
            System.out.println(getName() + " is unhappy");
        }
    }
}
