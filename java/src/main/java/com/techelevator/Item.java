package com.techelevator;

import java.lang.reflect.Array;

public abstract class Item implements Buyable {

    //private member variables
    private String name;
    private String slotId;
    private String price;
    private int quantity = 5;


    //getters and setters(?)
    public String getName() {
        return name;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getPrice() {
        return price;
    }


    //constructor
    public Item(String slotId, String name, String price) {
        this.slotId = slotId;
        this.name = name;
        this.price = price;
    }

    //METHODS
    public String dispense(){
        String result = "";

        // have it remove and adjust quantity
        //display item specific text
        // sold out error when quantity = 0;

        return result;
    }

    @Override
    public String toString() {
        return this.slotId + " | " + this.name + " | " + this.price;
    }
}
