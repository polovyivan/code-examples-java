package com.ivan.polovyi.statepattern;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.paymentSuccessful();
        order.cancel();
    }
}
