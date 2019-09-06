package com.milnesium;

//import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

public class AnimalFood {

    String name;
    int price;
    byte quantity;
    boolean stockAvailability;
    Date expirationDate = new Date();

    //new properties
    int proteins;
    String manufacturer;
    //quality from 1 to 10
    byte quality;
    //size in grams
    int sizeGram;
}
