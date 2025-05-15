package org.skypro.skyshop;

public class ProductBasket {



    public void productBasket() {

    }
    public void addProduct(Product product) {

        boolean productBasket = false;
        for (int i = 0; i < productBasket.lenght; i++) {

            if (productBasket[i] != null) {

                return;
            }

        }
    System.out.println("Невозможно добавить продукт");
}
    public int allSum(Product product) {
        int cost = 0;

        for (int i = 0; i <= cost; i++) {
            System.out.println(cost);
        }

        return cost;
    }

    public void printBasket(Product product) {
        boolean isEmpty = true;
        for (Product product : productBasket) {
            System.out.println(product.getName() + ": " + product.getQuantity());
            isEmpty = false;
        }
            if (isEmpty) {
                System.out.println("В корзине пусто!");



            System.out.println("Итого: " + getTotalQuantity());
        }
    }

    private String getTotalQuantity() {

        return getTotalQuantity();
    }
}








