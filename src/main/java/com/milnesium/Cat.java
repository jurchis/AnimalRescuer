package com.milnesium;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    int meowLevel;

    @Override
    public void happy(int happinessLevel) {
        if (happinessLevel>8){
            System.out.println(getName()+" is purring");}
        else    {
            System.out.println(getName()+" is unhappy");
        }
    }



}
