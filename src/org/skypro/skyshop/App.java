package org.skypro.skyshop;

public class App {

    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        SimpleProduct apple = new SimpleProduct("Яблоко", 30);
        SimpleProduct milk = new SimpleProduct("Молоко", 30);
        SimpleProduct bread = new SimpleProduct("Хлеб", 2);
        SimpleProduct eggs = new SimpleProduct("Яйца", 20);
        SimpleProduct juice = new SimpleProduct("Сок", 3);

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


