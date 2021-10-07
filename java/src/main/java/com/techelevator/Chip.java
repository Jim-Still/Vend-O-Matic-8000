package com.techelevator;

public class Chip extends Item{

    public Chip(String slotId, String name, int price){
        super(slotId, name, price);
    }


    @Override
    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Crunch crunch, Yum!";
    }

}
