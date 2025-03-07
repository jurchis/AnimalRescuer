package com.milnesium;

public class Cat extends Animal {

    //Variables
    private int meowLevel;

    public int getMeowLevel() {
        return meowLevel;
    }

    public void setMeowLevel(int meowLevel) {
        this.meowLevel = meowLevel;
    }

    //Constructors Super etc.
    public Cat(String name) {
        super(name);
    }

    //Override
    @Override
    public void happy(int happinessLevel) {
        if (happinessLevel > 8) {
            System.out.println(getName() + " is purring");
        } else {
            System.out.println(getName() + " is unhappy");
        }
    }


}
