package com.techelevator;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Formatter;

public abstract class Item {

    //private member variables
    private String name;
    private String slotId;
    private BigDecimal price;
    private int quantity = 5;
    private String dispenseSound;


    //getters and setters(?)
    public String getName() {
        return name;
    }

    public String getSlotId() {
        return slotId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setDispenseSound(String dispenseSound) {
        this.dispenseSound = dispenseSound;
    }

    public String getDispenseSound() {
        return dispenseSound;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //constructor
    public Item(String slotId, String name, BigDecimal price) {
        this.slotId = slotId;
        this.name = name;
        this.price = price;
        this.dispenseSound = "";
    }


    //METHODS
    @Override
    public String toString() {

        StringBuilder itemFormatting = new StringBuilder();
        Formatter itemToPrint = new Formatter(itemFormatting);
        itemToPrint.format("%s | %-25s  $%s | Qty %s", this.slotId, this.name, this.price, this.quantity);

        return itemFormatting.toString();
    }
}
