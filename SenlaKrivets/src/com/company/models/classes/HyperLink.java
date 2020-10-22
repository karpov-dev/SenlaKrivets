package com.company.models.classes;

import com.company.models.interfaces.Clickable;

public class HyperLink extends Label implements Clickable {
    private String Link;

    public HyperLink(String name, String id, String link) {
        super(name, id);
        Link = link;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    @Override
    public void onClick() {
        System.out.println("Clicked");
    }

    @Override
    public void onFocusEnded() {
        System.out.println("Link was focused");
    }
}
