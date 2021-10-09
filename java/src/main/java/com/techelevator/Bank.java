package com.techelevator;

import java.math.BigDecimal;

public class Bank {

    private BigDecimal currentBalance = new BigDecimal("0");


    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    //constructor
    public Bank() {
    }

    //Setter

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    //METHODS

    public void deposit(String amountToDeposit) {

        if (amountToDeposit.equals("1")){
            BigDecimal dollar = new BigDecimal(1.00);
            this.currentBalance.add(dollar);
        }
        if (amountToDeposit.equals("2")){
            BigDecimal twoDollar = new BigDecimal(2.00);
            this.currentBalance.add(twoDollar);
        }
        if (amountToDeposit.equals("3")){
            BigDecimal fiveDollar = new BigDecimal(5.00);
            this.currentBalance.add(fiveDollar);
        }
        if (amountToDeposit.equals("4")){
            BigDecimal tenDollar = new BigDecimal(10.00);
            this.currentBalance.add(tenDollar);
        }
    }


    public String returnChange() {
        BigDecimal startingBalance = currentBalance;
        Integer convertedCurrentBalance = startingBalance.intValue();
        int numberOfQuarters = 0;
        int numberOfDimes = 0;
        int numberOfNickels = 0;
        String changeReturnStatement = "";

        while (convertedCurrentBalance > 0) {
            if (convertedCurrentBalance >= 25) {
                numberOfQuarters++;
                BigDecimal quarter = new BigDecimal(0.25);
                currentBalance.subtract(quarter);
            } else if (convertedCurrentBalance >= 10) {
                numberOfDimes++;
                BigDecimal dime = new BigDecimal(0.10);
                currentBalance.subtract(dime);
            } else if (convertedCurrentBalance >= 5) {
                BigDecimal nickel = new BigDecimal(0.05);
                currentBalance.subtract(nickel);
            }
        }

        changeReturnStatement = "Your change is $" + currentBalance + " in \n" + numberOfQuarters + " quarter(s), " + numberOfDimes + " dime(s), " + numberOfNickels + " nickel(s).";

        return changeReturnStatement;
    }
}
