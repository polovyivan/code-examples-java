package com.ivan.polovyi.decoratorpattern;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator1 = new HtmlEncodedMessage(m);
		System.out.println("decorator1 = " + decorator1.getContent());

		Message base64EncodedMessage = new Base64EncodedMessage(decorator1);
		System.out.println("base64EncodedMessage.getContent() = " + base64EncodedMessage.getContent());
	}
}
