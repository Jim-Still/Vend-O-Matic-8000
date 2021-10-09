package com.techelevator;

public class Beverage extends Item {

    //Variables
    private String dispenseSound = "Glug Glug, Yum!";


    //Constructor
    public Beverage(String slotId, String name, String price){
        super(slotId, name, price);
    }
}
