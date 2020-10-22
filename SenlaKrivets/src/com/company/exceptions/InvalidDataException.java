package com.company.exceptions;

public class InvalidDataException extends Exception {
    private String message;

    public InvalidDataException() {
        message = "Invalid Data";
    }

    public InvalidDataException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
