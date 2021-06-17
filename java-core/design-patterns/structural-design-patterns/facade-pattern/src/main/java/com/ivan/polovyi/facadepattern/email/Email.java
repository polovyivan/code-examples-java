package com.ivan.polovyi.facadepattern.email;

public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
