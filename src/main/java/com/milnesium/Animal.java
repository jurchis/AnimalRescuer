package com.milnesium;

public class Animal{

    public Animal(String name) {
        this.name = name;
    }

    private String name;
    private byte age;
    private byte healthLevel;
    private byte hungryLevel;
    private byte happinessLevel;
    private String favoriteFood;
    private String favoriteActivity;

    //additional properties
    private String overallColor;
    private String eyeColor;
    //good, bad, not so good
    private String behavior;
    //how much does it care about the rescuer 1 to 10
    private byte rescuerLove;
    private byte kilograms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(byte healthLevel) {
        this.healthLevel = healthLevel;
    }

    public byte getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(byte hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public byte getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(byte happinessLevel) {
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

    public byte getRescuerLove() {
        return rescuerLove;
    }

    public void setRescuerLove(byte rescuerLove) {
        this.rescuerLove = rescuerLove;
    }

    public byte getKilograms() {
        return kilograms;
    }

    public void setKilograms(byte kilograms) {
        this.kilograms = kilograms;
    }
}
