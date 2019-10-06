package com.milnesium;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    //Variables
    private AnimalRescuer animalRescuer;
    private Animal animal;
    private AnimalMDStaff animalMDStaff;

    private AnimalRescuer rescuer1;
    private AnimalRescuer rescuer2;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private AnimalActivity[] availableActivities = new AnimalActivity[5];
    private List<AnimalRescuer> rescuers= new ArrayList<>();

    public void start(){
        initializeRescuers();
        initFood();
        initActivities();
        displayActivities();
        displayFood();
    }

    //Constructors Super etc.
//    public Game(Animal animal) {
//        this.animal = animal;
//    }

    //Methods
    private void initializeRescuers(){
        System.out.println("\nStart game:");;
        System.out.println("The competitors are:");
        int competitorCount = 2;
        for(int i = 0; i < competitorCount; i++){
            AnimalRescuer rescuer = new AnimalRescuer("Rescuer"+i);
            rescuer.setAvailableCash(ThreadLocalRandom.current().nextInt(50,3000));
            rescuer.setLoveFelt((byte)0);
            rescuer.setCare((byte) ThreadLocalRandom.current().nextInt(5, 10));
            rescuer.setYard(ThreadLocalRandom.current().nextBoolean());
            rescuer.setWorkFromHome(ThreadLocalRandom.current().nextBoolean());
            System.out.println(rescuer);
            rescuers.add(rescuer);
            rescuers.size();
        }
    }

    private void initFood(){
        AnimalFood food1 = new AnimalFood("Beef");
        availableFood.add(food1);

        AnimalFood food2 = new AnimalFood("Vegetables");
        availableFood.add(food2);
    }

    private void initActivities(){
        AnimalActivity activity1 = new AnimalActivity("Walking");
        availableActivities[0] = activity1;

        AnimalActivity activity2 = new AnimalActivity("Running");
        availableActivities[1] = activity2;
    }

    private void displayActivities(){
        System.out.println("\nThe available activities are:");
        for(int i = 0; i <availableActivities.length; i++){
            if (availableActivities[i]!=null){
                System.out.println(availableActivities[i].getName());
            }
        }
    }

    private void displayFood(){
        System.out.println("\nThe available food is:");
        for (AnimalFood f: availableFood
             ) {
                System.out.println(f.getName());
        }
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
