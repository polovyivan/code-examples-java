package com.ivan.polovyi.chainofresponsibilitypattern;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();

}
