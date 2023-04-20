package org.yearup.shopping;

public class ShoppingListWithLoopsMain {
    public static void main(String[] args) {


        // Show the user a list of items for sale
        // Only show the product names and IDs, not the prices


        Item[] itemsForSale = ItemsForSale.itemsForSale;
        for (Item i : itemsForSale){
            System.out.println(i);

        }

        // Invite the user to buy something

        // Read in the user's response

        // Parse their choice and get that item from the list

        // Tell the user they can have it for a price!
        // show them the price and ask them to accept it

        // Read their response
        //   if yes, tell them it's theirs
        //   if no, start over and show them the list again


    }
}
