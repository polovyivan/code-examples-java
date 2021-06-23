package com.ivan.polovyi.visitorpattern;

public interface Visitor {
    void visit(Programmer programmer);

    void visit(ProjectLead projectLead);

    void visit(Manager manager);

    void visit(VicePresident vicePresident);
}
