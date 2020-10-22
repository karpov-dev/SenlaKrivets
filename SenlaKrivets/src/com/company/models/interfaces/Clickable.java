package com.company.models.interfaces;

public interface Clickable {
    public void onClick();

    default void keyDown() {
        System.out.println("key down");
    }

    default void keyUp() {
        System.out.println("Key up");
    }
}
