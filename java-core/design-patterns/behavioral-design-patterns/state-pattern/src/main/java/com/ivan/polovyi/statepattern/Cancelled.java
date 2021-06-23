package com.ivan.polovyi.statepattern;

public class Cancelled implements OrderState {

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cant cancel cancelled order!");
    }
}
