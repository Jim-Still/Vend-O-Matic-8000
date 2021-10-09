package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Item {

    //Variables
    String dispenseSound = "Munch Munch, Yum!";


    //Constructor
    public Candy(String slotId, String name, BigDecimal price){

        super(slotId, name, price);
    }

}
