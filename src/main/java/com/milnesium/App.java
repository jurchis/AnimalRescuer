package com.milnesium;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Animal class object
        Animal dog = new Animal("Zorel");
        dog.setAge((byte) 2);
        dog.setFavoriteActivity("Outside Walk");
        dog.setFavoriteFood("Beef");
        dog.setHappinessLevel((byte) 5);
        dog.setHealthLevel((byte) 8);
        dog.setHungryLevel((byte) 9);

        //AnimalRescuer class object
        AnimalRescuer rescuer = new AnimalRescuer("Lorin");
        rescuer.setAvailableCash(10000);

        //AnimalMDClass object
        AnimalMDStaff vet = new AnimalMDStaff("Orel");
        vet.setSpecialization("Dogs");

        //AnimalFood class object
        AnimalFood food = new AnimalFood("Good beef");
        food.setPrice(10);
        food.setStockAvailability(true);
        food.setQuantity((byte) 5);
        food.setExpirationDate(LocalDate.of(2019, Month.DECEMBER, 9));

        //AnimalActivity class object
        AnimalActivity sleep = new AnimalActivity("Sleeping");

        //AnimalHome class object
        AnimalHome home = new AnimalHome("CuteHome");
        home.setSize("M");
        home.setColor("yellow");

        //AnimalHotel class object;
        AnimalHotel petHotel = new AnimalHotel("7*Animals");
        petHotel.setAvailabilityInArea(
                true);

        //AnimalRescuerCompanion class object
        AnimalRescuerCompanion companion = new AnimalRescuerCompanion("Elisa");
        companion.setBonding((byte) 9);
        companion.setAvailableCash(1000);
        companion.setCare((byte) 9);
        companion.setWorkFromHome(true);
        companion.setYard(true);

        //AnimalToys class object
        AnimalToys toys = new AnimalToys("ToyToys");
        toys.setColor("Purple");
        toys.setQuantity((byte) 3);

        //Game class object
        Game tamagotchi = new Game(dog);
        tamagotchi.setAnimalRescuer(rescuer);
        tamagotchi.setAnimalMDStaff(vet);

        AnimalOutsideToys outToy = new AnimalOutsideToys("Ball");
        outToy.setColor("Blue");
        outToy.setQuantity((byte) 1);
        outToy.setOutsidePurpose("Catch");

        System.out.println("The story of " +dog.getName()+ " and his rescuer " +rescuer.getName()+"\n");
        System.out.println(dog.getName()+" is our rescued dog.\nHe has "+dog.getAge()+ " years, he likes "+dog.getFavoriteActivity()+
                " and his favorite food is "+ dog.getFavoriteFood()+".");
        System.out.println("Regarding his overall status, "+dog.getName()+" is having the following levels:\n"+
                dog.getHappinessLevel()+ " Happiness Level out of 10,\n"+
                dog.getHappinessLevel()+ " Health Level out of 10 and\n" +
                dog.getHungryLevel()+ " Hungry Level out of 10.");
        System.out.println(dog.getName()+ " is fortunate because was rescued by a person that loves dogs named "+
                rescuer.getName() +".\nAlso "+ rescuer.getName() + " happens to have "+rescuer.getAvailableCash()+
                " cash available so he will buy for " + dog.getName() + " plenty of " + dog.getFavoriteFood()+".");
        System.out.println("In the end our good dog was checked by "+vet.getName()+" a very good vet,\nspecialized in: "+
                vet.getSpecialization()+".");

        vet.feedAnimal(dog.getName(), food.getName());
        rescuer.feedAnimal(dog,food);
        rescuer.doRelaxation(dog, sleep);
        dog.happy(dog.getHappinessLevel());

        Animal beagle = new Dog("Grivei");
        beagle.setHappinessLevel((byte) 7);

        Animal irishBlue = new Cat("Mitzi");
        irishBlue.setHappinessLevel((byte) 9);

        Animal parrot = new Bird("Johnny");
        parrot.setHappinessLevel((byte) 9);

        System.out.println("\nTesting for the actual situation:");
        beagle.happy(beagle.getHappinessLevel());
        irishBlue.happy(irishBlue.getHappinessLevel());
        parrot.happy(parrot.getHappinessLevel());

        System.out.println("\nTesting for unhappiness:");
        beagle.happy(6);
        irishBlue.happy(5);
        parrot.happy(5);
    }
}
