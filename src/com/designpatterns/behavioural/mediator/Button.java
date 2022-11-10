package com.designpatterns.behavioural.mediator;

public class Button extends UIControl {
    public Button(DialogBox owner) {
        super(owner);
    }

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        owner.changed(this);
    }
}
