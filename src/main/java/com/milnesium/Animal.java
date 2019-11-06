package com.milnesium;

public class Animal {

    //Variables
    private String name;
    private byte age;
    private int healthLevel;
    private int hungryLevel;
    private int happinessLevel;
    private String favoriteFood;
    private String favoriteActivity;

    //additional properties
    private String overallColor;
    private String eyeColor;
    //good, bad, not so good
    private String behavior;
    //how much does it care about the rescuer 1 to 10
    private int rescuerLove;
    private int kilograms;

    //Constructors super etc
    public Animal(String name) {
        this.name = name;
    }

    //Getters + Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (byte) age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getOverallColor() {
        return overallColor;
    }

    public void setOverallColor(String overallColor) {
        this.overallColor = overallColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public int getRescuerLove() {
        return rescuerLove;
    }

    public void setRescuerLove(int rescuerLove) {
        this.rescuerLove = rescuerLove;
    }

    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    //Override to String
    @Override
    public String toString() {
        return name;
    }

    public void happy(int happinessLevel) {
        if (happinessLevel > 6) {
            System.out.println(getName() + " is happy");
        } else {
            System.out.println(getName() + " is unhappy");
        }
    }
}
