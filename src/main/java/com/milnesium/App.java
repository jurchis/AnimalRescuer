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
        Animal Dog = new Animal("Zorel");
        Dog.age=2;
        Dog.favoriteActivity="Outside Walk";
        Dog.favoriteFood="Beef";
        Dog.happinessLevel=5;
        Dog.healthLevel=8;
        Dog.hungryLevel=9;

        //AnimalRescuer class object
        AnimalRescuer Rescuer = new AnimalRescuer("Lorin");
        Rescuer.availableCash=10000;

        //AnimalMDClass object
        AnimalMDStaff Vet = new AnimalMDStaff("Orel");
        Vet.specialization="Dogs";

        //AnimalFood class object
        AnimalFood food = new AnimalFood("Good beef");
        food.price=10;
        food.stockAvailability=true;
        food.quantity=5;
        food.expirationDate = LocalDate.of(2019, Month.DECEMBER, 9);

        //AnimalActivity class object
        AnimalActivity sleep = new AnimalActivity("Sleeping");

        //AnimalHome class object
        AnimalHome home = new AnimalHome("CuteHome");
        home.size = "M";
        home.color = "yellow";

        //AnimalHotel class object;
        AnimalHotel petHotel = new AnimalHotel("7*Animals");
        petHotel.availabilityInArea = true;

        //AnimalRescuerCompanion class object
        AnimalRescuerCompanion companion = new AnimalRescuerCompanion("Elisa");
        companion.bonding = 9;
        companion.availableCash = 1000;
        companion.care = 9;
        companion.workFromHome = true;
        companion.yard = true;

        //AnimalToys class object
        AnimalToys toys = new AnimalToys("ToyToys");
        toys.color = "Purple";
        toys.quantity = 3;

        //Game class object
        Game tamagotchi = new Game(Dog);
        tamagotchi.animalRescuer = Rescuer;
        tamagotchi.animalMDStaff = Vet;

        AnimalOutsideToys outToy = new AnimalOutsideToys("Ball");
        outToy.color = "Blue";
        outToy.quantity = 1;
        outToy.outsidePurpose = "Catch";

        System.out.println("The story of " +Dog.name+ " and his rescuer " +Rescuer.name+"\n");
        System.out.println(Dog.name+" is our rescued dog.\nHe has "+Dog.age+ " years, he likes "+Dog.favoriteActivity+
                " and his favorite food is "+ Dog.favoriteFood+".");
        System.out.println("Regarding his overall status, "+Dog.name+" is having the following levels:\n"+
                Dog.happinessLevel+ " Happiness Level out of 10,\n"+
                Dog.healthLevel+ " Health Level out of 10 and\n" +
                Dog.hungryLevel+ " Hungry Level out of 10.");
        System.out.println(Dog.name+ " is fortunate because was rescued by a person that loves dogs named "+
                Rescuer.name +".\nAlso "+ Rescuer.name + " happens to have "+Rescuer.availableCash+
                " cash available so he will buy for " + Dog.name + " plenty of " + Dog.favoriteFood+".");
        System.out.println("In the end our good dog was checked by "+Vet.name+" a very good Vet,\nspecialized in: "+
                Vet.specialization+".");
    }
}
