package org.skypro.skyshop;

public class Product {
    public String product;
    private String name;
    private int quantity;
    private int getPrice;

    public String getName() {
        return name;

    }

    public Product(String name, int i) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getGetPrice() {
        return getPrice;
    }

    public String toString() {
        return name;


    }
}
