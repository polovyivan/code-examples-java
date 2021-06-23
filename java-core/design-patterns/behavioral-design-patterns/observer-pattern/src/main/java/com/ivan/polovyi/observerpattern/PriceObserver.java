package com.ivan.polovyi.observerpattern;

//Concrete observer
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double itemCost = order.getItemCost();
        if (itemCost >= 500) {
            order.setDiscount(20);
        } else if (itemCost >= 200) {
            order.setDiscount(10);
        }
    }
}
