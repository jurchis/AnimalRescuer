package com.milnesium;

public class AnimalRescuer extends People {

    //Variables
    //how much love feels from the animal 1 to 10
    private byte loveFelt;

    //Constructor Supra etc.
    public AnimalRescuer(String name) {
        super(name);
    }

    //Methods
    public void feedAnimal(Animal animal, AnimalFood food) {

        int oldHungryLevel = animal.getHungryLevel();

        if (food.getName().equals(animal.getFavoriteFood())) {
            animal.setHungryLevel((byte) (animal.getHungryLevel() - 2));
            System.out.println(getName() + " just gave " + food.getName() + " food to " + animal.getName());
            System.out.println("Yummy favorite food. " + animal.getHungryLevel() + " is the new decreased hungry level after feeding " + animal.getName() +
                    " which had level " + oldHungryLevel + " before being feed.");
        } else if (food.getName().equals("skip")) {
            animal.setHungryLevel((byte) (animal.getHungryLevel() + 2));
            System.out.println(getName() + " skipped feeding " + animal.getName());
            System.out.println(animal.getHungryLevel() + " is the new increased hungry level after feeding " + animal.getName() +
                    " which had " + oldHungryLevel + " before being feed;");
        } else {
            animal.setHungryLevel((byte) (animal.getHungryLevel() - 1));
            System.out.println(getName() + " just gave some " + food.getName() + " food to " + animal.getName());
            System.out.println(animal.getHungryLevel() + " is the new hungry level after feeding " + animal.getName() +
                    " which had " + oldHungryLevel + " before being feed;");
        }
    }

    public void doRelaxation(Animal animal, AnimalActivity activity) {
        int oldHappinessLevel = animal.getHappinessLevel();
        if (activity.getName().equals(animal.getFavoriteActivity())) {
            System.out.println("Amazing!!! " + getName() + " did a " + activity.getName() + " which is the perfect recreation activity of " + animal.getName());
            animal.setHappinessLevel((byte) (animal.getHappinessLevel() + 2));
            System.out.println(animal.getHappinessLevel() +
                    " is the new increased happiness level after doing a relaxation activity with the animal that had " +
                    oldHappinessLevel);
        } else if (activity.getName().equals("skip")) {
            System.out.println(getName() + " skipped recreation activity with " + animal.getName());
            animal.setHappinessLevel((byte) (animal.getHappinessLevel() - 2));
            System.out.println(animal.getHappinessLevel() +
                    " is the new decreased happiness level after skipping a relaxation activity with the animal that had " +
                    oldHappinessLevel);
        } else {
            System.out.println(getName() + " did a " + activity.getName() + " recreation activity with " + animal.getName());
            animal.setHappinessLevel((byte) (animal.getHappinessLevel() + 1));
            System.out.println(animal.getHappinessLevel() +
                    " is the new increased happiness level after doing a relaxation activity with the animal that had " +
                    oldHappinessLevel);
        }
    }

    //Getters + Setters
    public byte getLoveFelt() {
        return loveFelt;
    }

    public void setLoveFelt(byte loveFelt) {
        this.loveFelt = loveFelt;
    }
}