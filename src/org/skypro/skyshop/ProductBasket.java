package org.skypro.skyshop;

import javax.xml.namespace.QName;
import java.util.DoubleSummaryStatistics;
import java.util.stream.IntStream;

public class ProductBasket () {


    public void nameProductBasket() {

    }

    public int allSum(Product product) {
        int cost = 0;

        for (int i = 0; i < product.lenght; i++) cost = products[i].getSum() + cost;
        System.out.println(cost);
        return cost;
    }

    public void printBasket(Product product) {
        for (int i = 0; i < product.lenght; i++) {
            if (product[i] == null) {
                System.out.println("В корзине пусто!");
            } else System.out.println(product[i]);


            System.out.println("Итого: " + allSum(product));
        }
    }
}







