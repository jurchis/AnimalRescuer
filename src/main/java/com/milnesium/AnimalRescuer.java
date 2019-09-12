package com.milnesium;

public class AnimalRescuer extends People{

    //how much love feels from the animal 1 to 10
    private byte loveFelt;

    public byte getLoveFelt() {
        return loveFelt;
    }

    public void setLoveFelt(byte loveFelt) {
        this.loveFelt = loveFelt;
    }

    public AnimalRescuer(String name) {
        super(name);
    }
}
