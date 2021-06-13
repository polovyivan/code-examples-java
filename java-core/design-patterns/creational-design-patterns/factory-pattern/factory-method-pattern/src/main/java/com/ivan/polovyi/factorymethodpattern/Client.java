package com.ivan.polovyi.factorymethodpattern;

import com.ivan.polovyi.factorymethodpattern.message.Message;

public class Client {

	public static void main(String[] args) {

		printMessage(new TextMessageCreator());
		printMessage(new JSONMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message ms = creator.getMessage();
		System.out.println("ms = " + ms);
	}
}
