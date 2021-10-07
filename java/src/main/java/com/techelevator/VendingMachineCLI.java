package com.techelevator;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}

	//MAIN OPTIONS
	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";

	// PURCHASE OPTIONS
	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";

	//MENU COLLECTIONS
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION  };


	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}


	public void run() {

		//declare a new vending machine (ONLY ONE)
		String[] activeMenu = MAIN_MENU_OPTIONS;

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(activeMenu);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {

				// do purchase

				activeMenu = PURCHASE_MENU_OPTIONS;
				//feedMoney() - is this its own loop?

				// selectProduct() - interact with dispense() (?) / reference same display and inventory
				// count of top menu / main menu display

				//current money provided method called from bank

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				//new instance vending machine closes bank vm.closeBank()
				// vending machine closes log vm.exitDialogue();
				System.exit(1);

			} else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)){
				activeMenu = MAIN_MENU_OPTIONS;
				// gives you change and returns you to main menu

			}
		}
	}

}
