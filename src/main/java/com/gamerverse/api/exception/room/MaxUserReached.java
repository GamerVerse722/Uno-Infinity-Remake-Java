package com.gamerverse.api.exception.room;

public class MaxUserReached extends RuntimeException {
    public MaxUserReached(String message) {
        super(message);
    }
}
