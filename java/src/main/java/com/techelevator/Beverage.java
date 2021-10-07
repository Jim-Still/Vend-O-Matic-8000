package com.techelevator;

public class Beverage extends Item {

    public Beverage(String slotId, String name, String price){
        super(slotId, name, price);
    }


    @Override
    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Glug glug, Yum!";
    }

}
