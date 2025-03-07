package com.milnesium;

import java.time.LocalDate;

public class AnimalFood extends AnimalStuff {

    //Variables
    private boolean stockAvailability;
    private int price;
    private LocalDate expirationDate;

    //new properties
    private int proteins;
    private String manufacturer;
    //quality from 1 to 10
    private byte quality;
    //size in grams
    private int sizeGram;

    //Constructors Super etc
    public AnimalFood(String name) {
        super(name);
    }

    //Getters + Setters
    public boolean isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public byte getQuality() {
        return quality;
    }

    public void setQuality(byte quality) {
        this.quality = quality;
    }

    public int getSizeGram() {
        return sizeGram;
    }

    public void setSizeGram(int sizeGram) {
        this.sizeGram = sizeGram;
    }
}
