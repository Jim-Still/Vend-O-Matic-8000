package com.techelevator;

import java.math.BigDecimal;

public class Bank {

    private int currentBalance = 0;


    public int getCurrentBalance() {
        return currentBalance / 100;
    }


    //constructor
    public Bank() {
    }


    //METHODS

    public void deposit(String amountToDeposit) {

        int numericValue = 0;

        if (amountToDeposit.equals("$1")){
            numericValue = 100;
        }
        if (amountToDeposit.equals("$2")){
            numericValue = 200;
        }
        if (amountToDeposit.equals("$5")){
            numericValue = 500;
        }
        if (amountToDeposit.equals("$10")){
            numericValue = 1000;
        }

        this.currentBalance += numericValue;
    }


    public String returnChange() {
        int startingBalance = currentBalance;
        int numberOfQuarters = 0;
        int numberOfDimes = 0;
        int numberOfNickels = 0;
        String changeReturnStatement = "";

        while (currentBalance > 0) {
            if (currentBalance >= 25) {
                numberOfQuarters++;
                currentBalance -= 25;
            } else if (currentBalance >= 10) {
                numberOfDimes++;
                currentBalance -= 10;
            } else if (currentBalance >= 5) {
                numberOfNickels++;
                currentBalance -= 5;
            }
        }

        changeReturnStatement = "Your change is $" + BigDecimal.valueOf((double) startingBalance / 100) + " in \n" + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, " + numberOfNickels + " nickels.";

        return changeReturnStatement;
    }
}
