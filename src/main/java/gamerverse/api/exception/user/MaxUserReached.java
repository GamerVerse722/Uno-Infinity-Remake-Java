package gamerverse.api.exception.user;

public class MaxUserReached extends RuntimeException {
    public MaxUserReached(String message) {
        super(message);
    }
}
