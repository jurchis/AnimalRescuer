package com.milnesium;

public class AnimalMDStaff extends People {

    //Variables
    private String specialization;
    //new properties
    private byte experienceYears;
    //how good is this MD from 1 to 10
    private byte skills;
    //passion for work from 1 to 10
    private byte passion;

    //Constructors Supra etc.
    public AnimalMDStaff(String name) {
        super(name);
    }
    //care for the animals from 1 to 10

    //Getters + Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public byte getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(byte experienceYears) {
        this.experienceYears = experienceYears;
    }

    public byte getSkills() {
        return skills;
    }

    public void setSkills(byte skills) {
        this.skills = skills;
    }

    public byte getPassion() {
        return passion;
    }

    public void setPassion(byte passion) {
        this.passion = passion;
    }
}
