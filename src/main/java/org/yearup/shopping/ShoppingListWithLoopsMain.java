package org.yearup.shopping;

public class ShoppingListWithLoopsMain {
    public static void main(String[] args) {


        // Show the user a list of items for sale
        // Only show the product names and IDs, not the prices


        Item[] itemsForSale = ItemsForSale.itemsForSale;
        for (Item i : itemsForSale){
            if ( ! i.isInStock()) continue;
            // System.out.println(i);
            System.out.println(i.getDescription());

        }

        // Invite the user to buy something

        // Read in the user's response

        // Parse their choice and get that item from the list

        String selectedProductId = null;
        Item selectedItem = null;

        for (Item currentItemInListInTheLoop : itemsForSale ){
            if (selectedProductId.equals(currentItemInListInTheLoop.getProductID())){
                selectedItem = currentItemInListInTheLoop;
                break;
            }
        }



        // Tell the user they can have it for a price!
        // show them the price and ask them to accept it

        // Read their response
        //   if yes, tell them it's theirs
        //   if no, start over and show them the list again


    }
}
