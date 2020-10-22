package com.company.models.abstraction;

import com.company.exceptions.InvalidDataException;

abstract public class Control {
    private String id;
    private String name;

    public Control(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) throws InvalidDataException {
        if (id.isBlank()) {
           throw new InvalidDataException();
        }

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataException {
        if (name.isBlank()) {
            throw new InvalidDataException();
        }

        this.name = name;
    }
}
