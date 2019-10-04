package com.milnesium;

public class Game {

    //Variables
    private AnimalRescuer animalRescuer;
    private Animal animal;
    private AnimalMDStaff animalMDStaff;

    //Constructors Super etc.
    public Game(Animal animal) {
        this.animal = animal;
    }

    //Getters + Setters
    public AnimalRescuer getAnimalRescuer() {
        return animalRescuer;
    }

    public void setAnimalRescuer(AnimalRescuer animalRescuer) {
        this.animalRescuer = animalRescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public AnimalMDStaff getAnimalMDStaff() {
        return animalMDStaff;
    }

    public void setAnimalMDStaff(AnimalMDStaff animalMDStaff) {
        this.animalMDStaff = animalMDStaff;
    }
}
