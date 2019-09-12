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
    {;

        //Animal class object
        Animal Dog = new Animal("Zorel");
        Dog.setAge((byte) 2);
        Dog.setFavoriteActivity("Outside Walk");
        Dog.setFavoriteFood("Beef");
        Dog.setHappinessLevel((byte) 5);
        Dog.setHealthLevel((byte) 8);
        Dog.setHungryLevel((byte) 9);

        //AnimalRescuer class object
        AnimalRescuer Rescuer = new AnimalRescuer("Lorin");
        Rescuer.setAvailableCash(10000);

        //AnimalMDClass object
        AnimalMDStaff Vet = new AnimalMDStaff("Orel");
        Vet.setSpecialization("Dogs");

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
        Game tamagotchi = new Game(Dog);
        tamagotchi.setAnimalRescuer(Rescuer);
        tamagotchi.setAnimalMDStaff(Vet);

        AnimalOutsideToys outToy = new AnimalOutsideToys("Ball");
        outToy.setColor("Blue");
        outToy.setQuantity((byte) 1);
        outToy.setOutsidePurpose("Catch");

        System.out.println("The story of " +Dog.getName()+ " and his rescuer " +Rescuer.getName()+"\n");
        System.out.println(Dog.getName()+" is our rescued dog.\nHe has "+Dog.getAge()+ " years, he likes "+Dog.getFavoriteActivity()+
                " and his favorite food is "+ Dog.getFavoriteFood()+".");
        System.out.println("Regarding his overall status, "+Dog.getName()+" is having the following levels:\n"+
                Dog.getHappinessLevel()+ " Happiness Level out of 10,\n"+
                Dog.getHappinessLevel()+ " Health Level out of 10 and\n" +
                Dog.getHungryLevel()+ " Hungry Level out of 10.");
        System.out.println(Dog.getName()+ " is fortunate because was rescued by a person that loves dogs named "+
                Rescuer.getName() +".\nAlso "+ Rescuer.getName() + " happens to have "+Rescuer.getAvailableCash()+
                " cash available so he will buy for " + Dog.getName() + " plenty of " + Dog.getFavoriteFood()+".");
        System.out.println("In the end our good dog was checked by "+Vet.getName()+" a very good Vet,\nspecialized in: "+
                Vet.getSpecialization()+".");
    }
}
