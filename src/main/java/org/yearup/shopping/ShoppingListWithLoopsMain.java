package org.yearup.shopping;
import java.util.Scanner;
public class ShoppingListWithLoopsMain {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Hello, here are the list of the items: ");
        Item[] itemsForSale = ItemsForSale.itemsForSale;
        for (Item i : itemsForSale){
            if (!i.isInStock()) continue;
            // Show the user a list of items for sale
            // Only show the product names and IDs, not the prices
            System.out.println( "Product ID  " + " " + i.getProductID() + ": " + i.getDescription());

        }
        // Invite the user to buy something
        System.out.println("Please enter the Product ID of the item you would like to purchase");
        // Read in the user's response
        String selectedProductId = consoleInput.nextLine();
        // Parse their choice and get that item from the list
        Item selectedItem = null;
        for (Item currentItemInTheList : itemsForSale){
            if (selectedProductId.equals(currentItemInTheList.getProductID())){
                selectedItem = currentItemInTheList;  // Tell the user they can have it for a price!
                System.out.println("The price of this item is: " + "$" + currentItemInTheList);
                break;
            }
        }
        // show them the price and ask them to accept it
        System.out.println("Would you like to continue? (yes/no)");
        String response = consoleInput.nextLine();
        // Read their response
        if (response.equals("yes")){ //   if yes, tell them it's theirs
            System.out.println("The item is yours. Thank you for shopping with us");
        } else if (response.equals("no")) {
            System.out.println("Hello, here are the list of the items:");
        }



        //   if no, start over and show them the list again


    }
}
