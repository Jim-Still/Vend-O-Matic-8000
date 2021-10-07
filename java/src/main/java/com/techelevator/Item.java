package com.techelevator;

import java.lang.reflect.Array;

public abstract class Item implements Buyable {

    //private member variables
    private String name;
    private String slotId;
    private int price;
    private Item[] slotInventory = new Item[5];

    //getters and setters(?)
    public String getName() {
        return name;
    }

    public String getSlotId() {
        return slotId;
    }

    public int getPrice() {
        return price;
    }

    public Item[] getSlotInventory() {
        return slotInventory;
    }

    public void setSlotInventory(Item[] slotInventory) {
        this.slotInventory = slotInventory;
    }

    //constructor
    public Item(String slotId, String name, int price) {
        this.slotId = slotId;
        this.name = name;
        this.price = price;
    }

    //METHODS
    public String dispense(){
        String result = "";

        // have it remove item from inventory
        //display item specific text
        // sold out error

        return result;
    }

    @Override
    public String toString() {
        return this.slotId + " | " + this.name + " | " + this.price;
    }
}
