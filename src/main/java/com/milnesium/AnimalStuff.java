package com.milnesium;

public class AnimalStuff {

    //Variables
    private String name;
    private byte quantity;

    //Constructors Super etc
    public AnimalStuff(String name) {
        this.name = name;
    }

    //getters + Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getQuantity() {
        return quantity;
    }

    public void setQuantity(byte quantity) {
        this.quantity = quantity;
    }

    //Override to String
    //Override the toString class in order to display the actual name in method from class AnimalRescuer
    @Override
    public String toString() {
        return  name;
    }
}
