package com.ivan.polovyi.statepattern;

//Context class
public class Order {

    private OrderState currentState;

    public Order() {
        currentState = new New();
    }

    public double cancel() {
        double cancellationFees = currentState.handleCancellation();
        currentState = new Cancelled();
        return cancellationFees;

    }

    public void paymentSuccessful() {
        currentState = new Paid();
    }

    public void dispatched() {
        currentState = new InTransit();
    }

    public void delivered() {
        currentState = new Delivered();
    }
}
