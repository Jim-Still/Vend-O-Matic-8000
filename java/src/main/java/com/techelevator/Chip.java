package com.techelevator;

public class Chip extends Item{

    @Override
    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Crunch crunch, Yum!";
    }

}
