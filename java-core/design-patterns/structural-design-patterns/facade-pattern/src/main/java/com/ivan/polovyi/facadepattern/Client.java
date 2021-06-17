package com.ivan.polovyi.facadepattern;

import com.ivan.polovyi.facadepattern.email.EmailFacade;
//import com.ivan.polovyi.facadepattern.email.Email;
//import com.ivan.polovyi.facadepattern.email.Mailer;
//import com.ivan.polovyi.facadepattern.email.Stationary;
//import com.ivan.polovyi.facadepattern.email.StationaryFactory;
//import com.ivan.polovyi.facadepattern.email.Template;
//import com.ivan.polovyi.facadepattern.email.TemplateFactory;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade emailFacade = new EmailFacade();
		boolean result = emailFacade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}
//
}
