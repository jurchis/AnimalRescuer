package com.milnesium;

public class AnimalRescuerCompanion extends AnimalRescuer{

    //Variables
    //from 1 to 10 how close the rescuer with his back-up is
    private byte bonding;

    //Constructors Supra etc.
    public AnimalRescuerCompanion(String name) {
        super(name);
    }

    //Getters + Setters
    public byte getBonding() {
        return bonding;
    }

    public void setBonding(byte bonding) {
        this.bonding = bonding;
    }
}
