package com.milnesium;

//import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.time.LocalDate;
//import java.util.Date;

public class AnimalFood {

    String name;
    int price;
    byte quantity;
    boolean stockAvailability;
    LocalDate expirationDate = LocalDate.now();

    //new properties
    int proteins;
    String manufacturer;
    //quality from 1 to 10
    byte quality;
    //size in grams
    int sizeGram;
}
