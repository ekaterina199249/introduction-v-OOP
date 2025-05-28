package org.skypro.skyshop;

public class App {

    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product apple = new Product("Яблоко", 30);
        Product milk = new Product("Молоко", 30);
        Product bread = new Product("Хлеб", 2);
        Product eggs = new Product("Яйца", 20);
        Product juice = new Product("Сок", 3);

     basket.addProduct(apple);
     basket.addProduct(milk);
     basket.addProduct(bread);
     basket.addProduct(eggs);
     basket.addProduct(juice);

     basket.test();
     basket.getSum();
     basket.printBasket();

        }
    }


