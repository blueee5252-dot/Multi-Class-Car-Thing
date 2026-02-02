package com.carproject.parts;

public class InvalidPartException extends RuntimeException {
    public InvalidPartException(String message) {
        super(message);
    }
}