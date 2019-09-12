package com.milnesium;

public class AnimalRescuerCompanion extends AnimalRescuer{

    //from 1 to 10 how close the rescuer with his back-up is
    private byte bonding;

    public byte getBonding() {
        return bonding;
    }

    public void setBonding(byte bonding) {
        this.bonding = bonding;
    }

    public AnimalRescuerCompanion(String name) {
        super(name);
    }
}
