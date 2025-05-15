package org.skypro.skyshop;

import javax.sound.sampled.Line;
import java.io.PrintStream;

public class App {

    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product apple = new Product("Яблоко", 30);
        Product milk = new Product("Молоко", 30);
        Product bread = new Product("Хлеб", 2);
        Product eggs = new Product("Яйца", 20);
        Product juice = new Product("Сок", 3);

        System.out.println(apple);
        System.out.println(milk);
        System.out.println(bread);
        System.out.println(eggs);
        System.out.println(juice);
        }
    }

