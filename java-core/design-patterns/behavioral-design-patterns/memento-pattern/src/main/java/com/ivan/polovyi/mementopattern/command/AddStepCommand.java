package com.ivan.polovyi.mementopattern.command;

import com.ivan.polovyi.mementopattern.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.addStep(step);
    }
}
