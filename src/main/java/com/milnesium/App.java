package com.milnesium;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal Dog = new Animal();
        Dog.name="Zorel";
        Dog.age=2;
        Dog.favoriteActivity="Outside Walk";
        Dog.favoriteFood="Beef";
        Dog.happinessLevel=5;
        Dog.healthLevel=8;
        Dog.hungryLevel=9;

        AnimalRescuer Rescuer = new AnimalRescuer();
        Rescuer.name="Lorin";
        Rescuer.availableCash=10000;

        AnimalMDStaff Vet = new AnimalMDStaff();
        Vet.name="Orel";
        Vet.specialization="Dogs";

        AnimalFood food = new AnimalFood();
        food.name="Good Beef";
        food.price=10;
        food.stockAvailability=true;
        food.quantity=5;

        AnimalActivity sleep = new AnimalActivity();
        sleep.name="Sleeping";
        
        //HELP NEEDED: I tryied to create expiration date but did not managed to

        //HELP NEEDED: At this point in time I cannot see what I can do with Game. I have a Vet there but I already
        //have a vet declared above with the use of AnimalMDStaff. Is the purpose of that to use inheritance?

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
