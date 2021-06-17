package com.ivan.polovyi.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {

    //This serves as key for getting flyweight instance
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private Map<ErrorType, ErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("Generic error of type $errorCode occured ", "http://google.com?="));
        errorMessages.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page not found. Error of type $errorCode occured ", "http://google.com?="));
        errorMessages.put(ErrorType.ServerError,
                new SystemErrorMessage("Server error message. Error of type $errorCode occured ",
                        "http://google.com?="));

    }

    public ErrorMessage getMessage(ErrorType errorType) {
        return errorMessages.get(errorType);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
