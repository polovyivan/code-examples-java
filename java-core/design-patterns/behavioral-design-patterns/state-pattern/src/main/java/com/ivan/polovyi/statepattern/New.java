package com.ivan.polovyi.statepattern;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("It is new order, no processing done");
        return 0;
    }
}
