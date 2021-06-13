package com.ivan.polovyi.factorymethodpattern;

import com.ivan.polovyi.factorymethodpattern.message.Message;
import com.ivan.polovyi.factorymethodpattern.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    public Message createMessage() {
        return new TextMessage();
    }
}
