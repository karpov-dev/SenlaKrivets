package com.company.models.interfaces;

public interface Input {
    default void onChange() {
        System.out.println("Text changing");
    }

    default void inputEnd() {
        System.out.println("Text change ends");
    }

    public String getInput();
    public void setInput();
}
