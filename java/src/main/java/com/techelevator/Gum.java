package com.techelevator;

public class Gum extends Item {

    @Override
    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Chew chew, Yum!";
    }

}
