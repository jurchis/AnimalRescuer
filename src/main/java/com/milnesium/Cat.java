package com.milnesium;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    int meowLevel;

    @Override
    public void happy(int happinessLevel) {
        if (happinessLevel>8){
            System.out.println("The Cat is purring");}
        else    {
            System.out.println("The cat is unhappy");
        }
    }



}
