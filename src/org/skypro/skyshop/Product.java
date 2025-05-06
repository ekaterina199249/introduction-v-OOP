package org.skypro.skyshop;

public class Product {
    public String product;
    public int lenght;
    private String name;
    public String getName() {
        return name;

    }

    public Product(String name, int i) {
        this.name = name;
    }

    public String toString() {
        return name;


    }
}
