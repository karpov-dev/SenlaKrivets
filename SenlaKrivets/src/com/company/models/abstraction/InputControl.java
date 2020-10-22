package com.company.models.abstraction;

import com.company.models.interfaces.Clickable;
import com.company.models.interfaces.Focusabe;
import com.company.models.interfaces.Input;

abstract public class InputControl extends Control implements Clickable, Focusabe, Input {
    public InputControl(String name, String id) {
        super(name, id);
    }

    @Override
    public String getInput() {
        return null;
    }

    @Override
    public void setInput() {

    }
}
