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

    public int getQuantity() {
        return quantity;
    }

    //constructor
    public Item(String slotId, String name, String price) {
        this.slotId = slotId;
        this.name = name;
        this.price = price;
    }

    //METHODS
    public String dispense(Item productType){
        String result = "TEST TEST WOOOO";

        if (this.quantity > 0){
            this.quantity -= 1;
            result = productType.dispense(); // this may not work
        } if (this.quantity == 0){
            return "SOLD OUT";
        }

        return result;
    }

    @Override
    public String toString() {
        return this.slotId + " | " + this.name + " | " + this.price + " | " + this.quantity;
    }
}
