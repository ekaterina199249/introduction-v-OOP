package org.skypro.skyshop;

public abstract class DiscountedProduct extends Product {
    public DiscountedProduct(String name, int price) {
        super(name, price);

    }
    public DiscountedProduct(String name, int price, int basePrice, double discount) {
        super(name, price);
        this.basePrice = basePrice;
        this.discount = discount;
}


    private int basePrice;
    private double discount;

    public int getBasePrice() {
        return basePrice;
    }

    public double getDiscount() {
        return discount;
    }


    }



