package com.milnesium;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    int singingLevel;

    @Override
    public void happy(int happinessLevel) {
        if (happinessLevel>7){
            System.out.println("The Bird is singing");}
        else    {
            System.out.println("The Bird is unhappy");
        }
    }

}
