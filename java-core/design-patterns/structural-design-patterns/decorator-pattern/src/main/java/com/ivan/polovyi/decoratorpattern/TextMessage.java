package com.ivan.polovyi.decoratorpattern;

//Concrete component. Object to be decorated
public class TextMessage implements Message {

	private String msg;
	
	public TextMessage(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getContent() {
		return msg;
	}
}
