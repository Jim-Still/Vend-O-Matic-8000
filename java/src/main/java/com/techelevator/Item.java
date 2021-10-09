package com.techelevator;

import java.lang.reflect.Array;

public abstract class Item {

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //constructor
    public Item(String slotId, String name, String price) {
        this.slotId = slotId;
        this.name = name;
        this.price = price;
    }

    //METHODS


    @Override
    public String toString() {
        return this.slotId + " | " + this.name + " | " + this.price + " | " + this.quantity;
    }
}
