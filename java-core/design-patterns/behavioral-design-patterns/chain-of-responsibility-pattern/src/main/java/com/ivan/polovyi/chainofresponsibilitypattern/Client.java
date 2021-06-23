package com.ivan.polovyi.chainofresponsibilitypattern;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        LeaveApplication leaveApplication = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now())
                .to(LocalDate.now().plusDays(10))
                .build();
        System.out.println("leaveApplication = " + leaveApplication);
        LeaveApprover leaveApprover = createChain();
        leaveApprover.processLeaveApplication(leaveApplication);
        System.out.println("leaveApplication = " + leaveApplication);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead projectLead = new ProjectLead(manager);
        return projectLead;
    }
}
