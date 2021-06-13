package com.ivan.polovyi.factorymethodpattern;

import com.ivan.polovyi.factorymethodpattern.message.JSONMessage;
import com.ivan.polovyi.factorymethodpattern.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
