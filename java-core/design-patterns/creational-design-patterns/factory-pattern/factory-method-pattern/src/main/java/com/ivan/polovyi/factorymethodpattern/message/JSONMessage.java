package com.ivan.polovyi.factorymethodpattern.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
