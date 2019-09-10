package com.milnesium;

public class AnimalMDStaff extends People{


    String specialization;
    //new properties
    byte experienceYears;
    //how good is this MD from 1 to 10
    byte skills;
    //passion for work from 1 to 10
    byte passion;

    public AnimalMDStaff(String name) {
        super(name);
    }
    //care for the animals from 1 to 10
}
