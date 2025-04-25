package org.skypro.skyshop;

import javax.naming.Name;

public class Product {
public String produkt;
    public int lenght;
    private String name;
    private int quantity;
    private int getPrice;

    public Product(String Яблоко, int i) {
    }

    public String getName() {
        return name;

    }
public Product(String name) {
    this.name = name;
}

    public int getQuantity() {
        return quantity;
    }

    public int getGetPrice() {
        return getPrice;
    }
    public String  toString() {
    return name;

    }
}

