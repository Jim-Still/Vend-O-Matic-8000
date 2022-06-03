# Tech Elevator Module 1 Capstone - Vending Machine Command Line Software

This was my first pair project, & my first big Java project of any kind. We used the driver/navigator principles of pair programming & worked extremely well together to accomplish our goal of buiding a command line Java app simulating a real-life vending machine using Object Oriented Programming. We took on this project before learning about database management, so the inventory function is all hard-coded.


## Technology Used

Java (IntelliJ)

JUnit


## Lessons Learned

FLUSH THE LOGGER INSTEAD OF CLOSING IT! In all seriousness, this was a really fun project to work through. All sorts of little loops & logical operations, & it really hammered home the key concepts of OOP - encapsulation, inheritence, & polymorphism.


### About Vendo-Matic-8000:

1. The vending machine dispenses beverages, candy, chips, and gum.
   - Each vending machine item has a Name and a Price.
2. A main menu displays when the software runs, presenting the following options:
    > ```
    > (1) Display Vending Machine Items
    > (2) Purchase
    > (3) Exit
    > ```
3. The vending machine inventory is stocked via an input file when the vending machine
starts.
4. The vending machine is automatically restocked each time the application runs.
5. When the customer selects "(1) Display Vending Machine Items", they're presented
with a list of all items in the vending machine with its quantity remaining:
    - Each vending machine product has a slot identifier and a purchase price.
    - Each slot in the vending machine has enough room for 5 of that product.
    - Every product is initially stocked to the maximum amount.
    - A product that has run out must indicate that it is SOLD OUT.
6. When the customer selects "(2) Purchase", they are guided through the purchasing
process menu:
    >```
    >(1) Feed Money
    >(2) Select Product
    >(3) Finish Transaction
    >
    > Current Money Provided: $2.00
    >```
7. The purchase process flow is as follows:
    1. Selecting "(1) Feed Money" allows the customer to repeatedly feed money into the
    machine in valid, whole dollar amounts—for example, $1, $2, $5, or $10.
        - The "Current Money Provided" indicates how much money the customer
        has fed into the machine.
    2. Selecting "(2) Select Product" allows the customer to select a product to
    purchase.
        - It shows a list of products available and allows the customer to enter
        a code to select an item.
        - If the product code does not exist, the customer is informed and returned
        to the Purchase menu.
        - If a product is sold out, the customer is informed and returned to the
        Purchase menu.
        - If a valid product is selected, it is dispensed to the customer.
        - Dispensing an item prints the item name, cost, and the money
        remaining. Dispensing also returns a message:
          - All chip items print "Crunch Crunch, Yum!"
          - All candy items print "Munch Munch, Yum!"
          - All drink items print "Glug Glug, Yum!"
          - All gum items print "Chew Chew, Yum!"
        - After the product is dispensed, the machine updates its balance
        accordingly and returns the customer to the Purchase menu.
    3. Selecting "(3) Finish Transaction" allows the customer to complete the
    transaction and receive any remaining change.
        - The customer's money is returned using nickels, dimes, and quarters
        (using the smallest amount of coins possible).
        - The machine's current balance must be updated to $0 remaining.
    4. After completing their purchase, the user is returned to the "Main" menu to
    continue using the vending machine.
8. All purchases are audited to prevent theft from the vending machine:
   - Each purchases generate a line in the file called `Log.txt`.
9. Unit tests demonstrate that the code works correctly.
