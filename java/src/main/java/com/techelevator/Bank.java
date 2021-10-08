package com.techelevator;

import java.math.BigDecimal;

public class Bank {

    private int currentBalance = 0;  // This will be displayed on the console use the verbage ("Current Money Provided)


    public int getCurrentBalance() {
        return currentBalance;
    }

    public int getChangeGiven() {
        int changeGiven = currentBalance;

        //can declare current balance = change given


        return changeGiven;
    }

    //constructor
    public Bank() {
    }


    //METHODS

    public void deposit() {

    }


    // deposit(); -- technically the setter.

    // returnChange();



    public String toStringCurrentBalance() {
        return "Current Balance: $" + BigDecimal.valueOf((double) currentBalance / 100);
    }

    public String toStringCurrentMoneyProvided() {
        return "Current Money Provided: $" + BigDecimal.valueOf((double) currentBalance/ 100);
    }
    public String toStringChangeGiven() {
        return "Change: $" + BigDecimal.valueOf((double) currentBalance/ 100);
    }
}
