package com.ivan.polovyi.flyweightpattern;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage {

    //some error message $errorCode
    private String messageTemplate;

    //https://somedomain.come?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code).concat(helpUrlBase).concat(code);
    }
}
