package com.techelevator;

import java.math.BigDecimal;

public class Bank {

    private BigDecimal currentBalance;


    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    //constructor
    public Bank() {
        this.currentBalance = new BigDecimal("0");
    }

    //Setter

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    //METHODS

    public void deposit(String amountToDeposit) {

        if (amountToDeposit.equals("$1")){
            BigDecimal dollar = new BigDecimal(1.00);
            this.currentBalance = this.currentBalance.add(dollar);
        }
        if (amountToDeposit.equals("$2")){
            BigDecimal twoDollar = new BigDecimal(2.00);
            this.currentBalance = this.currentBalance.add(twoDollar);
        }
        if (amountToDeposit.equals("$5")){
            BigDecimal fiveDollar = new BigDecimal(5.00);
            this.currentBalance = this.currentBalance.add(fiveDollar);
        }
        if (amountToDeposit.equals("$10")){
            BigDecimal tenDollar = new BigDecimal(10.00);
            this.currentBalance = this.currentBalance.add(tenDollar);
        }
    }


    public void returnChange() {
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
                this.currentBalance = this.currentBalance.subtract(quarter);
            } else if (convertedCurrentBalance >= 10) {
                numberOfDimes++;
                BigDecimal dime = new BigDecimal(0.10);
                this.currentBalance = this.currentBalance.subtract(dime);
            } else if (convertedCurrentBalance >= 5) {
                BigDecimal nickel = new BigDecimal(0.05);
                this.currentBalance = this.currentBalance.subtract(nickel);
            }
        }

        changeReturnStatement = "Your change is $" + this.currentBalance + " in \n" + numberOfQuarters + " quarter(s), " + numberOfDimes + " dime(s), " + numberOfNickels + " nickel(s).";

        System.out.println(changeReturnStatement);
    }
}
