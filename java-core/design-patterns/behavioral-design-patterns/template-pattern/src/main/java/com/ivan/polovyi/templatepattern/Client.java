package com.ivan.polovyi.templatepattern;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {

		Order order = new Order("1001");
		order.addItem("Soda", 2.50);
		order.addItem("Sandwich", 3.50);
		order.addItem("Pizza", 23.50);

		OrderPrinter txtPrinter = new TextPrinter();
		txtPrinter.printOrder(order, "1001.txt");

		OrderPrinter htmlPrinter = new TextPrinter();
		htmlPrinter.printOrder(order, "1001.html");
	}
}
