package com.techelevator;

import java.lang.reflect.Array;

public abstract class Item implements Buyable {

    //private member variables
    private String name;
    private String slotId;
    private int price;
    private Item[] slotInventory = new Item[5];

    //getters and setters(?)

    //constructor

    //METHODS
    public String dispense(){
        String result = "";

        // have it remove item from inventory
        //display item specific text
        // sold out error

        return result;
    }

    //toString()




}
