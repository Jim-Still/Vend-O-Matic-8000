package com.techelevator;

import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class VendingMachineCLI {

	//EXECUTION ENTRY POINT
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}

	VendingMachine machine = new VendingMachine();

	//MAIN OPTIONS
	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";

	// PURCHASE OPTIONS
	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";

	//DEPOSIT_OPTIONS
	private static final String DEPOSIT_MENU_OPTION_ONE = "$1";
	private static final String DEPOSIT_MENU_OPTION_TWO = "$2";
	private static final String DEPOSIT_MENU_OPTION_FIVE = "$5";
	private static final String DEPOSIT_MENU_OPTION_TEN = "$10";

	//MENU COLLECTIONS
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};
	private static final String[] MAIN_DISPLAY_MENU_OPTIONS = {MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};
	private static final String[] DEPOSIT_MENU_OPTIONS = {DEPOSIT_MENU_OPTION_ONE, DEPOSIT_MENU_OPTION_TWO, DEPOSIT_MENU_OPTION_FIVE, DEPOSIT_MENU_OPTION_TEN};
	String[] selectionChoice;

	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {

		machine.currentInventory.stock();
		selectionChoice = machine.currentInventory.getInventory().keySet().toArray(new String[machine.currentInventory.getInventory().size()]);


		String[] activeMenu = MAIN_MENU_OPTIONS;


		while (true) {
			//start with main menu (see line 48)
			String choice = (String) menu.getChoiceFromOptions(activeMenu);

			//in main menu - user selects display items:
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {

				machine.displayMenu();
				activeMenu = MAIN_DISPLAY_MENU_OPTIONS;

				// user selects Purchase, then displays this menu:
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				activeMenu = PURCHASE_MENU_OPTIONS;
			} else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {

				System.out.println();
				machine.displayMenu();
				System.out.println();

				System.out.println("Current Money Provided: $" + BigDecimal.valueOf((double) machine.currentBank.getCurrentBalance()));

				System.out.print(PURCHASE_MENU_OPTION_SELECT_PRODUCT );


				String selection = (String) menu.getChoiceFromOptions(selectionChoice);
				machine.purchaseProduct(selection);


				//way to log and store selection

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				machine.currentBank.returnChange();

				// vending machine closes log vm.exitDialogue();

				System.exit(1);

			} else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {

				System.out.println(machine.currentBank.returnChange());

				activeMenu = MAIN_MENU_OPTIONS;

			}
			//feed Money
			else if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
				System.out.println();
				System.out.println("Current Money Provided: $" + BigDecimal.valueOf((double) machine.currentBank.getCurrentBalance()));

				String deposit = (String) menu.getChoiceFromOptions(DEPOSIT_MENU_OPTIONS);

			 	machine.feedMoney(deposit);

			}
		}

	}
}
