package com.techelevator;

public class Candy extends Item {

    @Override
    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Munch munch, Yum!";
    }

}
