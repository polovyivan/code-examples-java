package com.ivan.polovyi.factorymethodpattern;

import com.ivan.polovyi.factorymethodpattern.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    public abstract Message createMessage();

}
