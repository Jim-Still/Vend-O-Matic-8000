package com.techelevator;

import java.math.BigDecimal;

public class Bank {

    //private member variables
    private int currentBalance = 0;
    private int currentMoneyProvided = 0; // This will be displayed on the console
    private int changeGiven = 0;

    //getters and setters(?)
    public int getCurrentBalance() {
        return currentBalance;
    }

    public int getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public void setCurrentMoneyProvided(int currentMoneyProvided) {
        this.currentMoneyProvided = currentMoneyProvided;
    }

    public int getChangeGiven() {
        return changeGiven;
    }

    //constructor
    public Bank() {
    }


    //METHODS


    // deposit();
    // returnChange();
    // feedMoney() (?) - use this method to set currentMoneyProvided()


    public String toStringCurrentBalance() {
        return "Current Balance: $" + BigDecimal.valueOf((double) currentBalance / 100);
    }

    public String toStringCurrentMoneyProvided() {
        return "Current Money Provided: $" + BigDecimal.valueOf((double) currentMoneyProvided / 100);
    }
    public String toStringChangeGiven() {
        return "Change: $" + BigDecimal.valueOf((double) changeGiven / 100);
    }
}
