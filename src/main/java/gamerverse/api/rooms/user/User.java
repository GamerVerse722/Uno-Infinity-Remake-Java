package gamerverse.api.rooms.user;

import gamerverse.api.exception.user.InvalidUsername;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    public String username;
    public final String uuid;

    @JsonProperty("is_vip")
    public boolean isVIP = false;

    public User(String username, String uuid) throws InvalidUsername {
        if (username.isBlank()) {
            throw new InvalidUsername("Username cannot be empty");
        }
        this.username = username;
        this.uuid = uuid;
    }

}
