package com.gamerverse.exception.user;

public class InvalidUUID extends RuntimeException {
    public InvalidUUID(String message) {
        super(message);
    }
}
