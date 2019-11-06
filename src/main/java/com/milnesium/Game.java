package com.milnesium;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
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
    private List<AnimalRescuer> rescuers = new ArrayList<>();
    private Animal[] availableAnimals = new Animal[5];
    private static int noOfDays = 5;


    public void start() {
        AnimalRescuer animalRescuer = initializeRescuers();
        initAnimal();
        initFood();
        initActivities();
        displayAnimal();
        Animal selectedAnimal = getSelectedAnimalFromUser();
        selectedAnimal.setName(nameAnimal());

        for (int i = 0; i <= noOfDays; i++) {
            if (selectedAnimal.getHungryLevel() <= 9) {
                System.out.println("\n" + selectedAnimal + " needs food.");
                animalRescuer.feedAnimal(selectedAnimal, requireFeeding());
            } else {
                System.out.println(selectedAnimal.getName() + " had sufficient food for now :) ");
            }

            if (selectedAnimal.getHappinessLevel() <= 9) {
                System.out.println("\n" + selectedAnimal + " needs activity.");
                animalRescuer.doRelaxation(selectedAnimal, requireActivity());
            } else {
                System.out.println(selectedAnimal.getName() + " had lot of fun for now :) ");
            }
        }

        if (selectedAnimal.getHungryLevel() >= 7 || selectedAnimal.getHappinessLevel() <= 7) {
            System.out.println("\nGame Over! " + selectedAnimal.getName() + " has been taken in custody by " +
                    "animal protection due to skipping important steps that involved taking care of it. " +
                    "\nYou did not passed the " + noOfDays + " number of days test!" +
                    "\nFull Report on " + selectedAnimal.getName() + ":\nHungry Level: " + selectedAnimal.getHungryLevel() +
                    "\nHappiness Level: " + selectedAnimal.getHappinessLevel());
        } else if (selectedAnimal.getHungryLevel() >= 8 || selectedAnimal.getHappinessLevel() <= 8) {
            System.out.println("\nYou've done fine! " + selectedAnimal.getName() +
                    " has a good overall condition!!!" +
                    "\nYou did passed the " + noOfDays + " number of days test!" +
                    "\nFull Report on " + selectedAnimal.getName() + ":\nHungry Level: " + selectedAnimal.getHungryLevel() +
                    "\nHappiness Level: " + selectedAnimal.getHappinessLevel());
        } else {
            System.out.println("\nCongratulations! You did a great job. " + selectedAnimal.getName() +
                    " is happy and not hungry anymore!!!" +
                    "\nYou did passed the " + noOfDays + " number of days test!" +
                    "\nFull Report on " + selectedAnimal.getName() + ":\nHungry Level: " + selectedAnimal.getHungryLevel() +
                    "\nHappiness Level: " + selectedAnimal.getHappinessLevel());
        }
    }

    //Methods
    private void initAnimal() {
        Animal dog = new Dog("Dog");
        dog.setHappinessLevel(ThreadLocalRandom.current().nextInt(3, 7));
        dog.setHungryLevel(ThreadLocalRandom.current().nextInt(5, 8));
        dog.setFavoriteFood("beef");
        dog.setHealthLevel(ThreadLocalRandom.current().nextInt(3, 7));
        dog.setAge(ThreadLocalRandom.current().nextInt(2, 15));
        dog.setEyeColor("blue");
        dog.setKilograms(30 - 30 / dog.getAge());
        dog.setFavoriteActivity("running");
        dog.setOverallColor("grey");
        dog.setRescuerLove(ThreadLocalRandom.current().nextInt(7, 9));
//        dog.setBarkingLevel(ThreadLocalRandom.current().nextInt(6, 10));
        dog.setBehavior("good");
        availableAnimals[0] = dog;

        Animal cat = new Cat("Cat");
        cat.setHappinessLevel(ThreadLocalRandom.current().nextInt(2, 7));
        cat.setHungryLevel(ThreadLocalRandom.current().nextInt(7, 9));
        cat.setFavoriteFood("can fish");
        cat.setHealthLevel(ThreadLocalRandom.current().nextInt(6, 9));
        cat.setAge(ThreadLocalRandom.current().nextInt(5, 15));
        cat.setEyeColor("light blue");
        cat.setKilograms(3 - 3 / cat.getAge());
        cat.setFavoriteActivity("toy playing");
        cat.setOverallColor("grey");
        cat.setRescuerLove(ThreadLocalRandom.current().nextInt(3, 6));
        cat.setBehavior("fine");
//        cat.setMeowLevel(ThreadLocalRandom.current().nextInt(7, 10));
        availableAnimals[1] = cat;

        Animal bird = new Bird("Bird");
        bird.setHappinessLevel(ThreadLocalRandom.current().nextInt(5, 7));
        bird.setHungryLevel(ThreadLocalRandom.current().nextInt(6, 9));
        bird.setFavoriteFood("parakeet");
        bird.setHealthLevel(ThreadLocalRandom.current().nextInt(6, 9));
        bird.setAge(ThreadLocalRandom.current().nextInt(7, 20));
        bird.setEyeColor("dark");
        bird.setKilograms(1 - 1 / bird.getAge());
        bird.setFavoriteActivity("karaoke");
        bird.setOverallColor("red");
        bird.setRescuerLove(ThreadLocalRandom.current().nextInt(3, 7));
        bird.setBehavior("good");
//        bird.setSingingLevel(ThreadLocalRandom.current().nextInt(5, 9));
        availableAnimals[2] = bird;
    }

    private void displayAnimal() {
        System.out.println("\nSelect the animal that you want to adopt:");
        for (int i = 0; i < availableAnimals.length; i++) {
            if (availableAnimals[i] != null) {
                System.out.println("Animal no. " + (i + 1) + ". Name: " + availableAnimals[i].getName());
            }
        }
    }

    private Animal getSelectedAnimalFromUser() {
        System.out.println("\nPlease select an animal corresponding number:");
        Scanner scanner = new Scanner(System.in);
        try {
            int userChoice = scanner.nextInt();
            System.out.println("Selected animal is: " + availableAnimals[userChoice - 1]);
            return availableAnimals[userChoice - 1];
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("You have entered an invalid animal selection!");
            return getSelectedAnimalFromUser();
        }
    }

    private String nameAnimal() {
        System.out.println("\nPlease name your adopted pet:");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid animal name!");
            return nameAnimal();
        }
    }

    private String getRescuerName() {
        System.out.println("Enter your player name:");
        Scanner scanner = new Scanner(System.in);

        try {
            return scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid player name!");
            return getRescuerName();
        }
    }

    private AnimalRescuer initializeRescuers() {
        System.out.println("\nStarting game...");

        String name = getRescuerName();
        AnimalRescuer rescuer = new AnimalRescuer(name);
        rescuer.setAvailableCash(ThreadLocalRandom.current().nextInt(50, 3000));
        rescuer.setLoveFelt((byte) 0);
        rescuer.setCare((byte) ThreadLocalRandom.current().nextInt(5, 10));
        rescuer.setYard(ThreadLocalRandom.current().nextBoolean());
        rescuer.setWorkFromHome(ThreadLocalRandom.current().nextBoolean());
        System.out.println(rescuer);
        return rescuer;
    }

    private void initFood() {
        AnimalFood food1 = new AnimalFood("beef");
        availableFood.add(food1);

        AnimalFood food2 = new AnimalFood("vegetables");
        availableFood.add(food2);

        AnimalFood food3 = new AnimalFood("can fish");
        availableFood.add(food3);

        AnimalFood food4 = new AnimalFood("parakeet");
        availableFood.add(food4);

        AnimalFood food5 = new AnimalFood("skip");
        availableFood.add(food5);
    }

    private void initActivities() {
        AnimalActivity activity1 = new AnimalActivity("walking");
        availableActivities[0] = activity1;

        AnimalActivity activity2 = new AnimalActivity("running");
        availableActivities[1] = activity2;

        AnimalActivity activity3 = new AnimalActivity("toy playing");
        availableActivities[2] = activity3;

        AnimalActivity activity4 = new AnimalActivity("karaoke");
        availableActivities[3] = activity4;

        AnimalActivity activity5 = new AnimalActivity("skip");
        availableActivities[4] = activity5;
    }

    private void displayActivities() {
        System.out.println("The available activities are:");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println((i + 1) + "." + availableActivities[i].getName());
            }
        }
    }

    private void displayFood() {
        int i = 0;
        System.out.println("The available food is:");
        for (AnimalFood f : availableFood
        ) {
            System.out.println((i + 1) + "." + f.getName());
            i++;
        }
    }

    private AnimalFood requireFeeding() {
        displayFood();
        System.out.println("Please select one of the above options:");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        return availableFood.get(userChoice - 1);
    }

    private AnimalActivity requireActivity() {
        displayActivities();
        System.out.println("Please select one of the above options:");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        return availableActivities[userChoice - 1];
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
