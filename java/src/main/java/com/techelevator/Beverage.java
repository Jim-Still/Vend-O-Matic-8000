package com.techelevator;

import java.math.BigDecimal;

public class Beverage extends Item {

    //Variables
    private String dispenseSound = "Glug Glug, Yum!";


    //Constructor
    public Beverage(String slotId, String name, BigDecimal price){
        super(slotId, name, price);
    }
}
