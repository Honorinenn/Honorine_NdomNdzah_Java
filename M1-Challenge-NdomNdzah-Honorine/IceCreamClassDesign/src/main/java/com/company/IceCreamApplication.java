package com.company;

import com.company.factory.IceCream;

public class IceCreamApplication {

    public static void main(String[] args) {
        IceCream iceCreamFactory = new IceCream("vanilla", 7.7, 5.1, 1, "milk" );
        com.company.pointofsale.IceCream iceCreamPointOfSale = new com.company.pointofsale.IceCream("strawberry", 3.5, 1);

       // Calling the iceCreamFactory methods
        String flavor = iceCreamFactory.getFlavor();
        int productionTime = iceCreamFactory.getProductionTime();
        double salePrice = iceCreamFactory.getSalePrice();
        double productionCost = iceCreamFactory.getProductionCost();
        String ingredients = iceCreamFactory.getIngredients();

        System.out.println("The factory produces" + " " + productionTime + " " + flavor + " " + "ice cream for" + " " + productionCost + "." + " " + "This ice cream is made from" + " " + ingredients + " " + "and is sold at" + " " + salePrice + ".");

       // Calling  the iceCreamPointOfSale method
        String flavors = iceCreamPointOfSale.getFlavor();
        double price = iceCreamPointOfSale.getPrice();
        int quantity = iceCreamPointOfSale.getQuantity();

        System.out.println( quantity + " " + flavors + " " + "ice cream will cost" + " " + 8.1 + ".");





    }
}
