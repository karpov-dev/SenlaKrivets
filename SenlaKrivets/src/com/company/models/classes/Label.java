package com.company.models.classes;

import com.company.models.abstraction.Control;
import com.company.models.interfaces.Focusabe;

public class Label extends Control implements Focusabe {
    private String text;

    public Label(String name, String id) {
        super(name, id);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
