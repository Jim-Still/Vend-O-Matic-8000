package com.techelevator;

public class Candy extends Item {

    public Candy(String slotId, String name, String price){

        super(slotId, name, price);
    }



    public String dispense() {
        //may need to refer back to parent method using (super)
        return "Munch munch, Yum!";
    }

}
