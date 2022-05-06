package com.company.pointofsale;

public class IceCream {

    private String flavors;
    private double price;
    private int quantity;

    public IceCream(String flavors, double price, int quantity) {
        this.flavors = flavors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavors;
    }

    public void setFlavor(String flavors) {
        this.flavors = flavors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
