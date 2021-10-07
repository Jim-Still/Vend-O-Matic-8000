package com.techelevator;

public class Beverage extends Item {

    @Override
    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Glug glug, Yum!";
    }

}
