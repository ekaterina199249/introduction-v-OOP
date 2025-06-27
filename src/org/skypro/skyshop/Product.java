package org.skypro.skyshop;

import java.util.Objects;

public abstract class Product {
    protected String name;


    public Product(String name, int price) {
        this.name = name;
    }

    public abstract int getPrice() {

    }

    public String getProductName() {
        return name;
    }
    @Override
    public String toString() {
        String price = new String();
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean isEmpty() {
        return false;
    }
}






