package com.ivan.polovyi.facadepattern.email;

import com.ivan.polovyi.facadepattern.Order;

//Facade provides simple methods for client to use
public class EmailFacade {

    public boolean sendOrderEmail(Order order){
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }

}
