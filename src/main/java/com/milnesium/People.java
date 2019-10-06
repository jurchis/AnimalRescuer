package com.milnesium;

public class People {

    //Variables
    private String name;
    private int availableCash;
    //additional properties
    //1 to 10 care for the animal
    private byte care;
    //Does he have a yard
    private boolean yard;
    //Can he work from home
    private boolean workFromHome;

    //Constructors super etc.
    public People(String name) {
        this.name = name;
    }

    //Methods
    public void feedAnimal(String Animal, String AnimalFood) {
        System.out.println(getName()+" just gave some "+ AnimalFood + " food to " + Animal);

    }

    //Getters + Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(int availableCash) {
        this.availableCash = availableCash;
    }

    public byte getCare() {
        return care;
    }

    public void setCare(byte care) {
        this.care = care;
    }

    public boolean isYard() {
        return yard;
    }

    public void setYard(boolean yard) {
        this.yard = yard;
    }

    public boolean isWorkFromHome() {
        return workFromHome;
    }

    public void setWorkFromHome(boolean workFromHome) {
        this.workFromHome = workFromHome;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", availableCash=" + availableCash +
                ", care=" + care +
                ", yard=" + yard +
                ", workFromHome=" + workFromHome +
                '}';
    }
}
