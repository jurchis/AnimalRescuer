package com.milnesium;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    int barkingLevel;

    @Override
    public void happy(int happinessLevel) {
        if (happinessLevel>6){
            System.out.println("The Dog is bending its tail");}
        else    {
            System.out.println("The dog is unhappy");
        }
    }



}
