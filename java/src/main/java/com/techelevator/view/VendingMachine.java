package com.techelevator.view;

import com.techelevator.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class VendingMachine {

    //members
    public Map<String, Item> inventory = new HashMap<>();
    public Logger audit = new Logger();
    Scanner fileScanner;


    //getters and setters
    public Map<String, Item> getInventory() {
        return inventory;
    }

    //constructors
    public VendingMachine() throws FileNotFoundException { }

    //methods
    public void audit(String event){
        //how do we pass that event?
        audit.log(event);
    }

    public void stock() throws FileNotFoundException {

        File inventoryFile = new File("vendingmachine.csv");
        fileScanner = new Scanner(inventoryFile);
        
        while(fileScanner.hasNextLine()){
            String inventoryLine = fileScanner.nextLine();
            String[] inventoryItem = inventoryLine.split("\\|");   //this may have issues

            Integer productPrice = Integer.parseInt(inventoryItem[2]);

            if(inventoryItem[3].equals("Candy")){

                Candy candyProduct = candyProduct = new Candy(inventoryItem[0], inventoryItem[1], productPrice);
                inventory.put(inventoryItem[0], candyProduct);

            } else if (inventoryItem[3].equals("Chip")){

                Chip chipProduct = chipProduct = new Chip(inventoryItem[0], inventoryItem[1], productPrice);
                inventory.put(inventoryItem[0], chipProduct);

            } else if (inventoryItem[3].equals("Drink")){

                Beverage beverageProduct = beverageProduct = new Beverage(inventoryItem[0], inventoryItem[1], productPrice);
                inventory.put(inventoryItem[0], beverageProduct);

            }else if (inventoryItem[3].equals("Gum")){

                Gum gumProduct = gumProduct = new Gum(inventoryItem[0], inventoryItem[1], productPrice);
                inventory.put(inventoryItem[0], gumProduct);

            }
        }
    }


    public String toStringDisplayItems(){
        for (String item : inventory.keySet()){
             return inventory.get(item).getSlotId() + " " + inventory.get(item).getName() + " " + inventory.get(item).getPrice();
        }
        return "";
    }

}
