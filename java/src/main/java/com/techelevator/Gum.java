package com.techelevator;

public class Gum extends Item {

    public Gum(String slotId, String name, int price){
        super(slotId, name, price);
    }

    @Override
    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Chew chew, Yum!";
    }

}
