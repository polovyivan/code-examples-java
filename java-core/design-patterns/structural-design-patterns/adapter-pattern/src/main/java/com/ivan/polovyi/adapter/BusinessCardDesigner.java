package com.ivan.polovyi.adapter;

/**
 * Client code which requires Customer interface.
 */
public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        return String.join("\n", customer.getName(), customer.getDesignation(), customer.getAddress());
    }
}
