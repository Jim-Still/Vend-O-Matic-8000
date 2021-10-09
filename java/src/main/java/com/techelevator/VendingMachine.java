package com.techelevator;

import com.techelevator.*;
import com.techelevator.view.Inventory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class VendingMachine {

    Inventory currentInventory = new Inventory();
    Bank currentBank = new Bank();
    public Logger audit = new Logger();


    //constructors
    public VendingMachine() { }

    //methods

// selectProduct() - the same thing as dispense() / each selection purchases that item
    public void purchaseProduct(String selection){
        //user makes a selection from the menu using a code
        // product does not exist, customer returns to display menu

        if(!currentInventory.getInventory().containsKey(selection)) {
            System.out.println("NOT A VALID OPTION. TRY AGAIN.");
        }
        if(currentInventory.getInventory().get(selection).getQuantity() == 0){
            System.out.println("SOLD OUT");
        }
        if(currentInventory.getInventory().containsKey(selection) && currentInventory.getInventory().get(selection).getQuantity() > 0)  {

            //This should adjust the balance
            int convertedPrice = Integer.parseInt(currentInventory.getInventory().get(selection).getPrice());
            int newBalance = currentBank.getCurrentBalance() - convertedPrice;
            currentBank.setCurrentBalance(newBalance);

            //subtract 1 from the quantity
            int newQuantity = currentInventory.getInventory().get(selection).getQuantity() - 1;
            currentInventory.getInventory().get(selection).setQuantity(newQuantity);

            //can we pass this to the logger right from here?
            //pass the Item name && Item slotId && starting balance && new balance
        }
    }

    public String dispense(Item productType){
        String result = "TEST TEST WOOOO";



        return result;
    }


    public void displayMenu() {
        for (Item item : currentInventory.getInventory().values()) {
            System.out.println(item);
        }
    }


    public void feedMoney(String amountToDeposit){
        this.currentBank.deposit(amountToDeposit);
        this.audit.log(amountToDeposit);
    }



}
