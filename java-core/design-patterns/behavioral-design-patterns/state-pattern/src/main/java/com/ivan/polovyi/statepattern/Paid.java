package com.ivan.polovyi.statepattern;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment department to handle refund");
        return 0;
    }
}
