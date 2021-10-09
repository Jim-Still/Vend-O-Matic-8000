package com.techelevator;

import java.math.BigDecimal;

public class Chip extends Item{


    //Constructor
    public Chip(String slotId, String name, BigDecimal price){
        super(slotId, name, price);
        setDispenseSound("Crunch Crunch, Yum!");
    }




}
