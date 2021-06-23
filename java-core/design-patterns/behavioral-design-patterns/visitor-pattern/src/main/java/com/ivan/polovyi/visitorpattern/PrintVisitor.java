package com.ivan.polovyi.visitorpattern;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Programmer programmer) {
        String message = programmer.getName() + " is a  " + programmer.getSkill() + " programmer.";
        System.out.println("message = " + message);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        String message = projectLead.getName() + " is a project lead   " + projectLead.getDirectReports().size()
                + " programmers.";
        System.out.println("message = " + message);
    }

    @Override
    public void visit(Manager manager) {
        String message = manager.getName() + " is a manager   " + manager.getDirectReports().size()
                + " reporting.";
        System.out.println("message = " + message);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        String message = vicePresident.getName() + " is a vp   " + vicePresident.getDirectReports().size()
                + " reporting.";
        System.out.println("message = " + message);
    }
}
