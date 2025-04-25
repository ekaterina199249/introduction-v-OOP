package org.skypro.skyshop;

import javax.xml.namespace.QName;
import java.util.DoubleSummaryStatistics;

public class ProductBasket() {


    public void nameProductBasket() {

    }

    public int allSum(Product product) {
        int cost = 0;
        for (int i = 0; i < product.lenght; i++) {

            cost = cost + product.lenght;
            System.out.println(cost);
            return cost;
        }
        public void printBasket {
            boolean isEmpty = true;
            for (Product products : product) {
                if (isEmpty == false) {
                    System.out.println(products.getName() + ": " + products.getGetPrice());
                }
                if (isEmpty == true) {

                    System.out.println("В корзине пусто");
                }
            }
            System.out.println("Итого: ");


        }
        return product.lenght;
    }
}




