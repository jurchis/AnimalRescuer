package com.milnesium;

public class AnimalStuff {

    public AnimalStuff(String name) {
        this.name = name;
    }

    private String name;
    private byte quantity;

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

    //Override the toString class in order to display the actual name in method from class AnimalRescuer
    @Override
    public String toString() {
        return  name;
    }
}
