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
    public VendingMachine() throws FileNotFoundException { }

    //methods

// selectProduct() - the same thing as dispense() / each selection purchases that item
    public void purchaseProduct(String selection){
        //user makes a selection from the menu using a code
        // product does not exist, customer returns to display menu

        if(!selection.equals(currentInventory.getInventory().keySet())){   //risky, this may not work
            System.out.println("NOT VALID OPTION");
        }

        for(Item selectedProducts : currentInventory.getInventory().values()){
            selectedProducts.dispense(selectedProducts);
        }
    }


//     LOGGER - NEED TO FIX


    public void audit(String event){
            //how do we pass that event?
                audit.log(event);
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
