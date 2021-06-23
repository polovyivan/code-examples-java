package com.ivan.polovyi.chainofresponsibilitypattern;

//A concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("ProjectLead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        //is six leave and duration ap to 2 days
        if(application.getType()== LeaveApplication.Type.Sick){
            if(application.getNoOfDays()<=2){
                application.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
