package com.company.models.classes;

import com.company.models.abstraction.Control;
import com.company.models.interfaces.Clickable;
import com.company.models.interfaces.Focusabe;

public class Button extends Control implements Clickable, Focusabe {
    public Button(String name, String id) {
        super(name, id);
    }

    @Override
    public void onClick() {
        System.out.println("Button clicked");
    }

    @Override
    public void onFocus() {
        System.out.println("Button on focus");
    }
}
