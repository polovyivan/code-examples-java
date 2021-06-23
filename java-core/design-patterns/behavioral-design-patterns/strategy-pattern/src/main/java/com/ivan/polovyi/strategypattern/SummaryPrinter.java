package com.ivan.polovyi.strategypattern;

import java.util.Collection;
import java.util.Iterator;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("*************Summary report*************");
        Iterator<Order> iterator = orders.iterator();
        double total = 0;
        for (int i = 1; iterator.hasNext(); i++) {
            Order order = iterator.next();
            total += order.getTotal();
            System.out.println("index = " + i);
            System.out.println("order.getId() = " + order.getId());
            System.out.println("order.getDate() = " + order.getDate());
            System.out.println("order.getItems().size() = " + order.getItems().size());
            System.out.println("order.getTotal() = " + order.getTotal());
            System.out.println("*************END*************");
        }
        System.out.println("total is = " + total);
    }
}
