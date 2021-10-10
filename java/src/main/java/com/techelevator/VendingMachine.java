package com.techelevator;

import com.techelevator.*;
import com.techelevator.view.Inventory;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class VendingMachine {

    public Inventory currentInventory = new Inventory();
    private BigDecimal currentBalance;
    public Logger audit = new Logger();

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    //constructors
    public VendingMachine() {
        this.currentBalance = new BigDecimal("0");
    }

    //methods


    public String purchaseProduct(String selection){

        BigDecimal startingBalance = currentBalance;
        String result = "";
        String toAdd = "";

        if(!currentInventory.getInventory().containsKey(selection)) {
//            System.out.println("NOT A VALID OPTION. TRY AGAIN.");
            result = "NOT A VALID OPTION. TRY AGAIN.";
        }
        if(currentInventory.getInventory().get(selection).getQuantity() == 0){
//            System.out.println("SOLD OUT");
            result = "SOLD OUT";
        }

        if(currentInventory.getInventory().containsKey(selection) && currentInventory.getInventory().get(selection).getQuantity() > 0)  {

            //This should adjust the balance
            BigDecimal itemPriceCheck = currentInventory.getInventory().get(selection).getPrice();
            BigDecimal moneyAvailable = getCurrentBalance();

            if ( itemPriceCheck.compareTo(moneyAvailable) < 0){

                BigDecimal newBalance = getCurrentBalance().subtract(currentInventory.getInventory().get(selection).getPrice()); //.subtract
                setCurrentBalance(newBalance);

                //subtract 1 from the quantity
                int newQuantity = currentInventory.getInventory().get(selection).getQuantity() - 1;
                currentInventory.getInventory().get(selection).setQuantity(newQuantity);

                //dispenses item

//                System.out.println(currentInventory.getInventory().get(selection).getName() + " $" + currentInventory.getInventory().get(selection).getPrice() + " | Remaining Balance: $" + getCurrentBalance() );
//                System.out.println(currentInventory.getInventory().get(selection).getDispenseSound());
                result = currentInventory.getInventory().get(selection).getName() + " $" + currentInventory.getInventory().get(selection).getPrice() +
                        " | Remaining Balance: $" + getCurrentBalance() + "\n" + currentInventory.getInventory().get(selection).getDispenseSound();

            } else {
//                System.out.println("You need to feed the machine money!!!");
                result = "You need to feed the machine money!!!";
            }

            //can we pass this to the logger right from here?
            String productName = currentInventory.getInventory().get(selection).getName();
            String slotIdAudit = currentInventory.getInventory().get(selection).getSlotId();
            toAdd = productName + " " + slotIdAudit;




            //pass the Item name && Item slotId && starting balance && new balance
        }
        String event = toAdd + "," + startingBalance + "," + getCurrentBalance();
        audit.log(event);
        return result;


    }


    public void displayMenu() {
        for (Item item : currentInventory.getInventory().values()) {
            System.out.println(item);
        }
    }
    public String exitDialogue(){
        return "Umbrella Corp. thanks you for using Vendo-Matic 800 for your snacking needs.\nCome back again soon!";
    }

    public void audit(String event){

    }

    public void feedMoney(String amountToDeposit){

        BigDecimal startingBalance = currentBalance;

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

        String event = "FEED MONEY "+ "," + startingBalance + "," + getCurrentBalance() + ",";
        audit.log(event);

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
        audit.log("GIVE CHANGE" + "," + startingBalance + "," + getCurrentBalance());
        return changeReturnStatement;
    }





}
