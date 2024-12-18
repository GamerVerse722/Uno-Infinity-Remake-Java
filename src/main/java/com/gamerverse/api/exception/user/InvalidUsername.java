package com.gamerverse.api.exception.user;

public class InvalidUsername extends Exception {
    public InvalidUsername(String errorMessage) {
        super(errorMessage);
    }
}
