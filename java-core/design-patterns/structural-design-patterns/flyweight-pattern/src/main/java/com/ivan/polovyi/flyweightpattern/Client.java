package com.ivan.polovyi.flyweightpattern;


public class Client {

	public static void main(String[] args) {
		ErrorMessage message1 = ErrorMessageFactory.getInstance()
				.getMessage(ErrorMessageFactory.ErrorType.GenericSystemError);
		System.out.println("message1 = " + message1.getText("12345"));

		UserBannedErrorMessage userBannedMessage = ErrorMessageFactory.getInstance().getUserBannedMessage("345");
		System.out.println("userBannedMessage.getText(\"1234\") = " + userBannedMessage.getText("1234"));
	}

}
