package com.ivan.polovyi.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

//Mediator
public class UIMediator {

    private List<UIControl> colleagues = new ArrayList<>();

    public void register(UIControl uiControl) {
        colleagues.add(uiControl);
    }

    public void valueChanged(UIControl uiControl) {
        colleagues.stream()
                .filter(c -> c != uiControl)
                .forEach(c -> c.controlChanged(uiControl));
    }

}
