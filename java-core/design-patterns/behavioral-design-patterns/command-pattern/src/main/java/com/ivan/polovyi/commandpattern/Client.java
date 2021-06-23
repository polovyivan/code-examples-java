package com.ivan.polovyi.commandpattern;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        EWSService ewsService = new EWSService();

        Command c1 = new AddMemberCommand("spam@gmail.com", "apam", ewsService);

        MailTasksRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("spam2@gmail.com", "apam2", ewsService);

        MailTasksRunner.getInstance().addCommand(c2);

        Thread.sleep(3000);

        MailTasksRunner.getInstance().shutdown();
    }

}
