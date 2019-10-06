package com.milnesium;

public class AnimalRescuer extends People{

    //Variables
    //how much love feels from the animal 1 to 10
    private byte loveFelt;

    //Constructor Supra etc.
    public AnimalRescuer(String name) {
        super(name);
    }

    //Methods
    public void feedAnimal(Animal animal, AnimalFood food){

        int oldHungryLevel = animal.getHungryLevel();
        System.out.println(getName()+" just gave some " +food.getName()+" food to "+animal.getName());

        if (food.getName()==animal.getFavoriteFood()){
            animal.setHungryLevel((byte) (animal.getHungryLevel()-1));
            int oldHappinessLevel = animal.getHappinessLevel();
            animal.setHappinessLevel((byte) (animal.getHappinessLevel()+1));
            System.out.println(animal.getHungryLevel()+" is the new hungry level after feeding "+animal.getName()+
                    " which had "+oldHungryLevel+" before being feed; Also " +animal.getHappinessLevel()+
                    " is the new happiness level after doing a relaxation activity with the animal that had "+
                            oldHappinessLevel);
        }

        else{
            animal.setHungryLevel((byte) (animal.getHungryLevel()-1));
            System.out.println(animal.getHungryLevel()+" is the new hungry level after feeding "+ animal.getName()+
                    " which had "+oldHungryLevel+" before being feed;");
        }
    }

    public void doRelaxation(Animal animal, AnimalActivity activity){

        if(activity.getName()==animal.getFavoriteActivity()){
            int oldHappinessLevel = animal.getHappinessLevel();
            System.out.println(getName()+ " did " +activity.getName() +" recreation activity with "+animal.getName());
            animal.setHappinessLevel((byte) (animal.getHappinessLevel()+2));
            System.out.println(animal.getHappinessLevel()+
                    " is the new happiness level after doing a relaxation activity with the animal that had "+
                    oldHappinessLevel);
        }
        else{
            int oldHappinessLevel = animal.getHappinessLevel();
            System.out.println(getName()+ " did " +activity.getName() +" recreation activity with "+animal.getName());
            animal.setHappinessLevel((byte) (animal.getHappinessLevel()+1));
            System.out.println(animal.getHappinessLevel()+
                    " is the new happiness level after doing a relaxation activity with the animal that had "+
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