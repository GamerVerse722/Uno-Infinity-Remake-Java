package com.gamerverse.exception.room;

public class MaxUserReached extends RuntimeException {
    public MaxUserReached(String message) {
        super(message);
    }
}
