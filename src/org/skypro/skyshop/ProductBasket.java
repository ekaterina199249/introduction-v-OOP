package org.skypro.skyshop;

import java.util.Arrays;

public class ProductBasket {
    private Product[] products = new Product[5];


    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }

        }
        System.out.println("Невозможно добавить продукт");
    }

    public int getSum() {
        int cost = 0;
        for (int i = 0; i < this.products.length; i++) {
            if (this.products != null) {
                int price = this.products[i].getQuantity();
                cost += price;
            }
        }
        return cost;
    }
        public void printBasket () {
            boolean isEmpty = true;
            for (Product product : products) {
                if (products != null) {
                    System.out.println(product + ": " + products);
                    isEmpty = false;
                }
                if (isEmpty) {
                    System.out.println("В корзине пусто!");

                } else {
                    System.out.println("Итого: " + getSum());
                }
                return;
            }
        }
                public void test () {
                    System.out.println(Arrays.toString(products));
                }
            }































