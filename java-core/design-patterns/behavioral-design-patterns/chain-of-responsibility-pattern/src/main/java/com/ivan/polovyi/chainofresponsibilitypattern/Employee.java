package com.ivan.polovyi.chainofresponsibilitypattern;

//Abstract handler
public abstract class Employee implements LeaveApprover {

    private String aprovverRole;

    private LeaveApprover successor;

    public Employee(String aprovverRole, LeaveApprover successor) {
        this.aprovverRole = aprovverRole;
        this.successor = successor;
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if (!processRequest(leaveApplication) && successor != null) {
            successor.processLeaveApplication(leaveApplication);
        }
    }

    @Override
    public String getApproverRole() {
        return this.aprovverRole;
    }
}