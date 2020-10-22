package com.company.models.interfaces;

public interface Focusabe {
    default void onFocus() {
        System.out.println("OnFocus");
    }

    default void onFocusEnded() {
        System.out.println("Focus ended");
    }
}
